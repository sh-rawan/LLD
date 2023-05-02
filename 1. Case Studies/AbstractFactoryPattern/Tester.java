package AbstractFactoryPattern;

import AbstractFactoryPattern.coffee.Coffee;

public class Tester {
    public static void main(String[] args) {
        Coffee coffee = new CoffeeServer(new CoffeeFactory()).serve("Espresso");
        System.out.println(coffee.drink());
    }
}
