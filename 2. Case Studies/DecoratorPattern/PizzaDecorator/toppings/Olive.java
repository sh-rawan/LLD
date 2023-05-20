package DecoratorPattern.PizzaDecorator.toppings;

import DecoratorPattern.PizzaDecorator.base.Pizza;

public class Olive extends Topping {
    public Olive(Pizza pizza) {
        super("Olive ", 5, pizza);
    }
}
