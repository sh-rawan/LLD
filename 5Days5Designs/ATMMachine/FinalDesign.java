package ATMMachine;

public interface State {
    int init();

    public boolean validateCardDetails(CardDetails cardDetails);

    public boolean validateWithDetails(float amount, String pin, int txnid);

    public void dispenseCash();

    public void ejectCard();
}

public class CardReading implements State{
    private final ATM atm;
    CardReading(ATM atm){this.atm=atm;}
    int init(){
        // OWN logic
    }
    public boolean validateCardDetails(CardDetails cardDetails){}

    public boolean validateWithDetails(float amount, String pin, int txnid){}

    public void dispenseCash(){}

    public void ejectCard(){}

}
public class ATM {

    private final String machineId;
    private State state;

    public ATM(String machineId){
        this.machineId=machineId;
    }

    public int init() {
        // Issue: tons of ifff statement!!!!
        int id = this.state.init();
        return id;
    }

    public boolean validateCardDetails(CardDetails cardDetails){}

    public boolean validateWithDetails(float amount, String pin, int txnid){}

    public void dispenseCash(){}

    public void ejectCard(){}

    
}


public class FinalDesign {
    public static void main(String[] args) {
        System.out.println("abcd");
    }
}
