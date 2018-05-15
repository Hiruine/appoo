package com.coffeeMachine.coffeeTypes.ingredients;

public class Ingredients {

    private final double water;
    private final double coffee;
    private final double milk;
    private final double chocolate;
    private final double cream;

    public static class Builder {
        private final double water;
        private final double coffee;

        private double milk = 0.0;
        private double chocolate = 0.0;
        private double cream = 0.0;

        public Builder(double water, double coffee) {
            this.water = water;
            this.coffee = coffee;
        }

        public Builder milk(double val) {
            milk = val;
            return this;
        }

        public Builder chocolate(double val) {
            chocolate = val;
            return this;
        }

        public Builder cream(double val) {
            cream = val;
            return this;
        }

        public Ingredients build() {
            return new Ingredients(this);
        }
    }

    private Ingredients(Builder builder) {
        water = builder.water;
        coffee = builder.coffee;
        milk = builder.milk;
        chocolate = builder.chocolate;
        cream = builder.cream;
    }
}