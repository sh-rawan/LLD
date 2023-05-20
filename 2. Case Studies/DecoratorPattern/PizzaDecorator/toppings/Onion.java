package DecoratorPattern.PizzaDecorator.toppings;

import DecoratorPattern.PizzaDecorator.base.Pizza;

public class Onion extends Topping {
    public Onion(Pizza pizza) {
        super("Onion ", 3, pizza);
    }
}