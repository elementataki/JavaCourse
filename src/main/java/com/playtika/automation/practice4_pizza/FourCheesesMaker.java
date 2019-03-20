package com.playtika.automation.practice4_pizza;

public class FourCheesesMaker extends PizzaMaker {

    @Override
    protected void fillIngredients() {
        System.out.println("Cheese1 is added" +
                                   "Cheese2 is added" +
                                   "Cheese3 is added" +
                                   "Cheese4 is added");
    }

    @Override
    protected void bake() {
        System.out.println("Pizza is backing...");
        try {
            Thread.sleep(12_000);
        } catch (InterruptedException e) {

        }
    }

    @Override
    protected String make() {
        return "Pizza Four Cheeses";
    }
}