package com.docsconsole.tutorials.abstractfactory.candy;


public class CandyBar implements Candy {
    public Long price;

    public CandyBar(Long price) {
        this.price = price;
    }

    @Override
    public Long getCandyPrice() {
        return price;
    }
}