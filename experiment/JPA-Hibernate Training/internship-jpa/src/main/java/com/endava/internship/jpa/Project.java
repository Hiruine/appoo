package com.endava.internship.jpa;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Entity
@Table(name = "PROJECT")
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "TYPE")
public abstract class Project implements Serializable {

    @EmbeddedId
    @AttributeOverride(name = "value", column = @Column(name = "CODE"))
    private ProjectCode code;

    @Column(name = "NAME")
    private String name;

    @Convert(converter = ProjectStatusAttributeConverter.class)
    private Status status;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "PROJECT_COSTS", joinColumns = @JoinColumn(name = "PROJECT_CODE"))
//    @Column(name = "COST_AMOUNT")
    @MapKeyColumn(name = "COST_MONTH")
//    @Convert(converter = MoneyAttributeConverter.class, attributeName = "value")
    @AttributeOverrides({
            @AttributeOverride(name = "value.amount", column = @Column(name = "COST_AMOUNT")),
            @AttributeOverride(name = "value.currencyCode", column = @Column(name = "COST_CURRENCY_CODE"))
    })
    private Map<LocalDate, Money> costs;

    Project() { // for JPA
    }

    protected Project(ProjectCode code, String name) {
        this.code = code;
        this.name = name;
        status = Status.OPEN;
        costs = new HashMap<>();
    }

    public ProjectCode code() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(code, project.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return code.toString();
    }

    public void addCost(LocalDate date, Money money) {
        //guards
        costs.put(date, money);
    }

    public void removeCost(LocalDate date) {
        costs.remove(date);
    }
}
