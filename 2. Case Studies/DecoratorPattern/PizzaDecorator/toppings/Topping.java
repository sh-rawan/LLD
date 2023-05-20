package DecoratorPattern.PizzaDecorator.toppings;

import DecoratorPattern.PizzaDecorator.base.Pizza;

public abstract class Topping extends Pizza {
    private final Pizza pizza;

    public Topping(String name, double cost, Pizza pizza) {
        super(name, cost);
        this.pizza = pizza;
    }

    public String getName() {
        return super.getName() + pizza.getName();
    }

    public double getCost() {
        return super.getCost() + pizza.getCost();
    }
}
