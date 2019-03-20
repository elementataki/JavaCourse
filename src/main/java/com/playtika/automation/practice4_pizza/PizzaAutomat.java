package com.playtika.automation.practice4_pizza;

public class PizzaAutomat {

    private final PizzaMakerFactory pizzaMakerFactory;

    public PizzaAutomat(PizzaMakerFactory pizzaMakerFactory) {
        this.pizzaMakerFactory = pizzaMakerFactory;
    }

    public String getPizza(Button button) {

        PizzaMaker maker = pizzaMakerFactory.getPizzaMaker(button);
        return maker.makePizza();
    }

    public static void main(String[] args) {

        PizzaAutomat automat = new PizzaAutomat(new UkraineMakerFactory());
        String pizza = automat.getPizza(Button.BUTTON_2);
        System.out.printf("%s is ready", pizza);
    }
}