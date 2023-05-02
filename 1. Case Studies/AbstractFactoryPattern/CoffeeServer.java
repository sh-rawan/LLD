package AbstractFactoryPattern;


//Example of dependancy inversion principal
// My commented method depends upon Coffee and its sub classes
// but the second method only depende on the cofee class


// import FactoryPattern.coffee.Cappuccino;
import AbstractFactoryPattern.coffee.Coffee;
// import FactoryPattern.coffee.Espresso;
// import FactoryPattern.coffee.Robusta;

public class CoffeeServer {

    private AbstractCoffeeFactory factory;

    public CoffeeServer(AbstractCoffeeFactory factory){
        this.factory = factory;
    }

    //         ---------------------------------OldDesign-------------------------------------
    //
    //                                              CoffeeServer
    //                                               //   | 
    //                                             //     |
    //                                           //       |
    //                                -<-- CoffeeFactory--V----->-->---
    //                              v              V      |            v
    //                             v               V      V             v 
    //                            v   Coffee(Everyone depends here)      v
    //                      Cappuccino            ^                     Robusta
    //                          |                 ^                        |
    //                          |               /   \                      |
    //                          -->--->---->---       -<-----<-----<----<---

    //        ----------------------------------NewDesign--------------------------------------
    //
    //
    //                       AbstractFactory  <<<<<<<<  CoffeeServer
    //                                  ^                 | 
    //                                   \\               |
    //                                     \\             |
    //                                -<-- CoffeeFactory--V----->-->---
    //                              v              V      |            v
    //                             v               V      V             v 
    //                            v   Coffee(Everyone depends here)      v
    //                      Cappuccino            ^                     Robusta
    //                          |                 ^                        |
    //                          |               /   \                      |
    //                          -->--->---->---       -<-----<-----<----<---
    
    // But still the problem is in order to compile Coffee Server we need to compile all the other classes
    // Solution is to create the abstract factory
    // }
    

    public Coffee serve(String coffeeType){
        Coffee coffee = factory.getCoffee(coffeeType);
        coffee.brew();
        coffee.boil();
        return coffee;
    }
}
