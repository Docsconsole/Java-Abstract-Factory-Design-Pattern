package com.docsconsole.tutorials.abstractfactory.factory;

public class FactoryProducer {
    public FoodFactory getFactory(String foodType) {
        if (foodType.equalsIgnoreCase("Cake")) {
            return new CakeFactory();
        } else if (foodType.equalsIgnoreCase("Candy")) {
            return new CandyFactory();
        }
        return null;
    }
}
