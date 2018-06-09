package com.endava.internship.jpa;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "BASKET")
public class Basket {

    @Id
    @Column(name = "ID")
    private Long id;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "BASKET_FRUIT", joinColumns = @JoinColumn(name = "BASKET_ID"))
    @Column(name = "FRUIT")
    private Set<Fruit> fruits;

    private Basket() { // for JPA
    }

    public Basket(Long id, Set<Fruit> fruits) {
        this.id = id;
        this.fruits = fruits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(id, basket.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    public void addFruit(Fruit banana) {
        fruits.add(banana);
    }
}
