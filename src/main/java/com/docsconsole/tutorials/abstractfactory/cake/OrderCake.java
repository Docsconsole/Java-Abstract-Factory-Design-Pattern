package com.docsconsole.tutorials.abstractfactory.cake;

import com.docsconsole.tutorials.abstractfactory.factory.CakeFactory;

public class OrderCake {
    public static void main(String[] args) {
        CakeFactory factory = new CakeFactory();
        factory.makeCake("StrawBerryCrush");
    }
}
