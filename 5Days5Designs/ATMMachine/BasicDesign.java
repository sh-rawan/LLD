package ATMMachine;

public enum ATMState {
    READY,
    CARD_READING,
    CARD_DESPENSING,
    ...
}

public class ATM {

    private final String machineId;
    private ATMState state;

    public ATM(String machineId){
        this.machineId=machineId;
    }

    public int init() {
        // Issue: tons of ifff statement!!!!
        if (this.state.equals(ATMState.CARD_READING)){
            throw new RuntimeException("cant init, currently reading");
        }
        if (this.state.equals(ATMState.CARD_DESPENSING)){
            throw new RuntimeException("cant init, currently dispensing");
        }
        return 0;
    }

    public boolean validateCardDetails(CardDetails cardDetails){}

    public boolean validateWithDetails(float amount, String pin, int txnid){}

    public void dispenseCash(){}

    public void ejectCard(){}

    
}


public class BasicDesign {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
