package AbstractFactoryPattern.coffee;

public class Espresso implements Coffee{
    public String name = "Espresso";

    public String drink(){
        return "Drink your " + name;
    }

    public void brew(){

    }

    public void boil(){

    }

}
