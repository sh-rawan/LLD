package DecoratorPattern;

import DecoratorPattern.PizzaDecorator.base.*;
import DecoratorPattern.PizzaDecorator.toppings.*;

public class PizzaMain {
    public static void main(String[] args) {
        Pizza pizza = new Onion(new Olive(new Cheese(new Olive(new ThikCrust()))));
        System.out.println(pizza.getCost());
        System.out.println(pizza.getName() + "Pizza");
    }
}
