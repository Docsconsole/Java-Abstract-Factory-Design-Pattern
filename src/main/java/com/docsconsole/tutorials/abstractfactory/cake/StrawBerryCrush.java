package com.docsconsole.tutorials.abstractfactory.cake;


public class StrawBerryCrush implements Cake {
    public Long price;

    public StrawBerryCrush(Long price) {
        this.price = price;
    }

    @Override
    public Long getCakePrice() {
        return price;
    }
}