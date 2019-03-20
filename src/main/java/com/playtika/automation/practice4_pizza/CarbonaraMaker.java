package com.playtika.automation.practice4_pizza;

public class CarbonaraMaker extends PizzaMaker {

    @Override
    protected void fillIngredients() {
        System.out.println("Backon is added" +
                                   "Cheese is added" +
                                   "Eggs are added" +
                                   "Cream souce is added");
    }

    @Override
    protected void bake() {
        System.out.println("Pizza is backing...");
        try {
            Thread.sleep(20_000);
        } catch (InterruptedException e) {

        }
    }

    @Override
    protected String make() {
        return "Pizza Carbonara";
    }
}