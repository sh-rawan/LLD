package FactoryPattern;


//Example of dependancy inversion principal
// My commented method depends upon Coffee and its sub classes
// but the second method only depende on the cofee class


// import FactoryPattern.coffee.Cappuccino;
import FactoryPattern.coffee.Coffee;
// import FactoryPattern.coffee.Espresso;
// import FactoryPattern.coffee.Robusta;

public class CoffeeServer {
    
    // Not a good design pattern because you need to put so many if statements
    // Also putting this code in the main class is not good because we are transfering the problem

    // public Coffee serve(String coffeeType){
    //     Coffee coffee;
    //     if(coffeeType.equals("Cappuccino")){
    //         coffee = new Cappuccino();
    //     }else if(coffeeType.equals("Espresso")){
    //         coffee = new Espresso();
    //     }else{
    //         coffee = new Robusta();
    //     }
    //     coffee.brew();
    //     coffee.boil();
    //     return coffee;

    //         ---------------------------------OldDesign-------------------------------------
    //
    //
    //                                -<--<--- CoffeeServer --->-->---
    //                              v              V                   v
    //                             v               V                    v 
    //                            v   Coffee(Everyone depends here)      v
    //                      Cappuccino            ^                     Robusta
    //                          |                 ^                        |
    //                          |               /   \                      |
    //                          -->--->---->---       -<-----<-----<----<---
    

    //        ----------------------------------NewDesign--------------------------------------
    //
    //
    //                                              CoffeeServer
    //                                             //     | 
    //                                            //      |
    //                                -<-- CoffeeFactory--V----->-->---
    //                              v              V      |            v
    //                             v               V      V             v 
    //                            v   Coffee(Everyone depends here)      v
    //                      Cappuccino            ^                     Robusta
    //                          |                 ^                        |
    //                          |               /   \                      |
    //                          -->--->---->---       -<-----<-----<----<---
    
    // }
    

    public Coffee serve(String coffeeType){
        Coffee coffee = new CoffeeFactory().getCoffee(coffeeType);
        coffee.brew();
        coffee.boil();
        return coffee;
    }
}
