package AbstractFactoryPattern;

import AbstractFactoryPattern.coffee.Coffee;

public interface AbstractCoffeeFactory {
    public Coffee getCoffee(String coffeeType);
}
