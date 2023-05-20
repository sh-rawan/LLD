package DecoratorPattern.PizzaDecorator.toppings;

import DecoratorPattern.PizzaDecorator.base.Pizza;

public class Cheese extends Topping {
    public Cheese(Pizza pizza) {
        super("Cheese ", 8, pizza);
    }
}