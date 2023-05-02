package FactoryPattern;

import FactoryPattern.coffee.Coffee;

public class Tester {
    public static void main(String[] args) {
        Coffee coffee = new CoffeeServer().serve("Espresso");
        System.out.println(coffee.drink());
    }
}
