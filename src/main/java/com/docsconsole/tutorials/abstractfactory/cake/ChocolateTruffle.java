package com.docsconsole.tutorials.abstractfactory.cake;

public class ChocolateTruffle implements Cake {

    public Long price;

    public ChocolateTruffle(Long price) {
        this.price = price;
    }

    @Override
    public Long getCakePrice() {
        return price;
    }
}