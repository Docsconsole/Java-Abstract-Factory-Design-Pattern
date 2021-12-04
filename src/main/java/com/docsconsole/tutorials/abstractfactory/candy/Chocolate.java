package com.docsconsole.tutorials.abstractfactory.candy;


public class Chocolate implements Candy {
    public Long price;

    public Chocolate(Long price) {
        this.price = price;
    }

    @Override
    public Long getCandyPrice() {
        return price;
    }
}