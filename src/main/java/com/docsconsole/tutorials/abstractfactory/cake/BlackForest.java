package com.docsconsole.tutorials.abstractfactory.cake;

public class BlackForest implements Cake {

    public Long price;

    public BlackForest(Long price) {
        this.price = price;
    }

    @Override
    public Long getCakePrice() {
        return price;
    }
}