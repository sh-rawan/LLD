package AtmMachine.State;

import AtmMachine.ATM.ATM;
import AtmMachine.data.CardDetails;

public class CardEjectingState implements State {

    private final ATM atm;

    public CardEjectingState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public boolean cancel(int transId) {
        throw new IllegalStateException("Some error");
    }

    @Override
    public float dispenseCash(int transId) {
        throw new IllegalStateException("Some error");
    }

    @Override
    public void ejectCard() {
        // some code to eject the card
        this.atm.changeState(new ReadyState(this.atm));
    }

    @Override
    public int init() {
        throw new IllegalStateException("Some error");
    }

    @Override
    public boolean readCard(CardDetails cardDetails) {
        throw new IllegalStateException("Some error");
    }

    @Override
    public boolean readWithdrawalDetails(CardDetails cardDetails, int transId, float amount) {
        throw new IllegalStateException("Some error");
    }

    @Override
    public ATMState getStateName() {
        return ATMState.CARD_EJECTING;
    }
}
