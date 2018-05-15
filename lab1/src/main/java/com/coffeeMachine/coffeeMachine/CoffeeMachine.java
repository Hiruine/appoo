package com.coffeeMachine.coffeeMachine;


import com.coffeeMachine.coffeeTypes.Coffee;
import com.coffeeMachine.coffeeFactory.CoffeeFactory;

public class CoffeeMachine {
    private CoffeeFactory coffeeFactory;

    public CoffeeMachine(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(String type) {

        Coffee coffee = coffeeFactory.createCoffee(type);
        coffee.prepare();

        return coffee;
    }
}
//        System.out.println(coffee.getPrice());
//        System.out.println(String.valueOf(coffee.hasIngredients()));


//        if (MoneyValidator.hasEnoughMoney(coffee.getPrice())) {
//            coffee.prepare();
//        }
//        else {
//            throw new RuntimeException("not enogh input");
//        }