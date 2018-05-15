package com.coffeeMachine.coffeeTypes;

import com.coffeeMachine.coffeeTypes.components.Ingredients;

import java.math.BigDecimal;

public class Americano implements Coffee{

    private Ingredients ingredients;
    private BigDecimal price;


    public Americano(Ingredients ingredients, BigDecimal price) {
        this.ingredients = ingredients;
        this.price = price;
    }

    @Override
    public void prepare() {
        ////
    }
}
