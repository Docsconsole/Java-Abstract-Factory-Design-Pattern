package com.docsconsole.tutorials.abstractfactory.candy;


public class BubbleGum implements Candy {
    public Long price;

    public BubbleGum(Long price) {
        this.price = price;
    }

    @Override
    public Long getCandyPrice() {
        return price;
    }
}