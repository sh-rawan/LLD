package AbstractFactoryPattern.coffee;

public class Cappuccino implements Coffee{
    private String name = "Cappuccino";

    public String drink(){
        return "Drink your " + name;
    }

    public void brew(){

    }

    public void boil(){

    }

}
