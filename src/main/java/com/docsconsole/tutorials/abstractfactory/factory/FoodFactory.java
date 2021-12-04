package com.docsconsole.tutorials.abstractfactory.factory;

import com.docsconsole.tutorials.abstractfactory.cake.Cake;
import com.docsconsole.tutorials.abstractfactory.candy.Candy;

public abstract class FoodFactory {
    public abstract Cake makeCake(String cakeName);

    public abstract Candy makeCandy(String candyName);
}
