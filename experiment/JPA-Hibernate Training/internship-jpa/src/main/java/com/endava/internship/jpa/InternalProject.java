package com.endava.internship.jpa;

import javax.persistence.*;

@Entity
//@DiscriminatorValue("INTERNAL")
public class InternalProject extends Project {

    @AttributeOverrides({
            @AttributeOverride(name = "amount", column = @Column(name = "BUDGET_AMOUNT")),
            @AttributeOverride(name = "currencyCode", column = @Column(name = "BUDGET_CURRENCY_CODE"))
    })
    private Money budget;

    private InternalProject() { // for JPA
    }

    public InternalProject(ProjectCode code, String name, Money budget) {
        super(code, name);
        this.budget = budget;
    }
}
