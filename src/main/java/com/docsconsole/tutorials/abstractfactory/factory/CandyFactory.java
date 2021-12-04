package com.docsconsole.tutorials.abstractfactory.factory;

import com.docsconsole.tutorials.abstractfactory.cake.Cake;
import com.docsconsole.tutorials.abstractfactory.candy.BubbleGum;
import com.docsconsole.tutorials.abstractfactory.candy.Candy;
import com.docsconsole.tutorials.abstractfactory.candy.CandyBar;
import com.docsconsole.tutorials.abstractfactory.candy.Jelly;

public class CandyFactory extends FoodFactory {

    public Candy makeCandy(String CandyName) {
        Candy candy = null;
        if (CandyName.equalsIgnoreCase("Jelly")) {
            candy = new Jelly(6l);
            System.out.println("Ordered Candy is: Jelly and price is:" + candy.getCandyPrice() + "$");
        } else if (CandyName.equalsIgnoreCase("CandyBar")) {
            candy = new CandyBar(5l);
            System.out.println("Ordered Candy is: CandyBar and price is:" + candy.getCandyPrice() + "$");
        } else if (CandyName.equalsIgnoreCase("BubbleGum")) {
            candy = new BubbleGum(3l);
            System.out.println("Ordered Candy is: BubbleGum and price is:" + candy.getCandyPrice() + "$");
        } else {
            System.out.println("The Ordered Candy is not presented now.");
        }
        return candy;
    }

    @Override
    public Cake makeCake(String cakeName) {
        return null;
    }

}
