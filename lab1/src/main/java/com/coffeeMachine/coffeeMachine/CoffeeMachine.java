package com.coffeeMachine.coffeeMachine;


import com.coffeeMachine.coffeeTypes.Coffee;
import com.coffeeMachine.factory.CoffeeFactory;
import com.sun.jdi.InvalidTypeException;

public class CoffeeMachine {
    private CoffeeFactory coffeeFactory;

    public CoffeeMachine(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(String type) {

        Coffee coffee = coffeeFactory.createCoffee(type);

        prepareCoffee(coffee);

//        System.out.println(coffee.getPrice());
//        System.out.println(String.valueOf(coffee.hasIngredients()));


//        if (MoneyValidator.hasEnoughMoney(coffee.getPrice())) {
//            coffee.prepare();
//        }
//        else {
//            throw new RuntimeException("not enogh money");
//        }

        return coffee;
    }

    private void prepareCoffee(Coffee coffee) {
        coffee.prepare();
    }
}
