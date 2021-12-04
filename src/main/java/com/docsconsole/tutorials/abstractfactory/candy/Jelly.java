package com.docsconsole.tutorials.abstractfactory.candy;


public class Jelly implements Candy {
    public Long price;

    public Jelly(Long price) {
        this.price = price;
    }

    @Override
    public Long getCandyPrice() {
        return price;
    }
}