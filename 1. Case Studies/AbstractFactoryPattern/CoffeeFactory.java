package AbstractFactoryPattern;

import AbstractFactoryPattern.coffee.Cappuccino;
import AbstractFactoryPattern.coffee.Coffee;
import AbstractFactoryPattern.coffee.Espresso;
import AbstractFactoryPattern.coffee.Robusta;

public class CoffeeFactory implements AbstractCoffeeFactory {
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
