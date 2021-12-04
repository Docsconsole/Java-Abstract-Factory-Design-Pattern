package com.docsconsole.tutorials.abstractfactory;

import com.docsconsole.tutorials.abstractfactory.factory.FactoryProducer;

public abstract class AbstractFactoryDemo {
    public static void main(String[] args) {
        FactoryProducer producer = new FactoryProducer();
        producer.getFactory("Cake").makeCake("BlackForest");
        producer.getFactory("Candy").makeCandy("Jelly");
    }
}
