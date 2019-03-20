package com.playtika.automation.practice4_pizza;

public abstract class PizzaMaker {

    public final String makePizza() {
        takeBase();
        fillIngredients();
        bake();
        cutPizza();
        packPizza();

        return make();
    }

    protected abstract String make();

    private void takeBase() {
        System.out.println("Base is taken");
    }

    protected abstract void fillIngredients();

    protected abstract void bake();

    private void cutPizza() {
        System.out.println("Pizza is cut");
    }

    private void packPizza() {
        System.out.println("Pizza is packed");
    }
}