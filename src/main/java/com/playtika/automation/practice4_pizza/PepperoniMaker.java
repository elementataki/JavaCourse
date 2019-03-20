package com.playtika.automation.practice4_pizza;

public class PepperoniMaker extends PizzaMaker {

    @Override
    protected void fillIngredients() {
        System.out.println("Sausage is added" +
                                   "Mozzarella is added" +
                                   "Basilic are added" +
                                   "Tomato souse is added");
    }

    @Override
    protected void bake() {
        System.out.println("Pizza is backing...");
        try {
            Thread.sleep(16_000);
        } catch (InterruptedException e) {

        }
    }

    @Override
    protected String make() {
        return "Pizza Pepperoni";
    }
}