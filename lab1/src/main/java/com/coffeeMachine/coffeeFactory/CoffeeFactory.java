package com.coffeeMachine.coffeeFactory;

import com.coffeeMachine.coffeeTypes.Coffee;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public interface CoffeeFactory {

    Coffee createCoffee(String coffeeType);

    static CoffeeFactory factory(Consumer<Builder> consumer) {
        Map<String, Supplier<Coffee>> map = new HashMap<>();
        consumer.accept(map::put);
        return coffeeType -> map.getOrDefault(coffeeType, () -> {
            throw new IllegalArgumentException("Unknown coffee type.");
        }).get();
    }

    interface Builder {
        void register(String name, Supplier<Coffee> supplier);
    }
}
