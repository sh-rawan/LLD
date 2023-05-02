package FactoryPattern;

import FactoryPattern.coffee.Cappuccino;
import FactoryPattern.coffee.Coffee;
import FactoryPattern.coffee.Espresso;
import FactoryPattern.coffee.Robusta;

public class CoffeeFactory {
    public Coffee getCoffee(String coffeeType){
        Coffee coffee;
        if(coffeeType.equals("Cappuccino")){
            coffee = new Cappuccino();
        }else if(coffeeType.equals("Espresso")){
            coffee = new Espresso();
        }else{
            coffee = new Robusta();
        }
        return coffee;
    }
}
