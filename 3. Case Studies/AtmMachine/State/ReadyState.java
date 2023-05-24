package AtmMachine.State;

import AtmMachine.ATM.ATM;
import AtmMachine.data.CardDetails;
import AtmMachine.db.DBAccessor;

public class ReadyState implements State {

    private final ATM atm;

    @Override
    public boolean cancel(int transId) {
        throw new IllegalStateException("Some error");
    }

    public ReadyState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public float dispenseCash(int transId) {
        throw new IllegalStateException("Some error");
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("Some error");
    }

    @Override
    public int init() {
        int transId = DBAccessor.createNewTransaction(this.atm.getMachineId());
        if (transId == 0)
            throw new RuntimeException("Random error in readystate..");
        this.atm.changeState(new CardReadingState(this.atm));
        return transId;
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
        return ATMState.READY;
    }
}
