package com.playtika.automation.practice4_pizza;

public class PolloMaker extends PizzaMaker {

    @Override
    protected void fillIngredients() {
        System.out.println("Chicken is added" +
                                   "Cheese is added" +
                                   "Pollo Ingridient is added" +
                                   "Cream souce is added");
    }

    @Override
    protected void bake() {
        System.out.println("Pizza is backing...");
        try {
            Thread.sleep(25_000);
        } catch (InterruptedException e) {

        }
    }

    @Override
    protected String make() {
        return "Pizza Pollo";
    }
}