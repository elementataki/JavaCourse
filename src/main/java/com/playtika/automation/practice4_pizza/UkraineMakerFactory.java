package com.playtika.automation.practice4_pizza;

public class UkraineMakerFactory implements PizzaMakerFactory {

    @Override
    public PizzaMaker getPizzaMaker(Button button) {
        switch (button) {
            case BUTTON_1:
                return new CarbonaraMaker();
            case BUTTON_2:
                return new FourCheesesMaker();
            case BUTTON_3:
                return new PepperoniMaker();
            case BUTTON_4:
                return new PolloMaker();
        }
        throw new IllegalStateException();
    }
}