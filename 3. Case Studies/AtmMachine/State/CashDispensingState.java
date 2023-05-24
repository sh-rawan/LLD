package AtmMachine.State;

import AtmMachine.ATM.ATM;
import AtmMachine.card.CardManagerFactory;
import AtmMachine.data.CardDetails;
import AtmMachine.data.CardType;
import AtmMachine.db.DBAccessor;

public class CashDispensingState implements State {

    private final ATM atm;

    public CashDispensingState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public boolean cancel(int transId) {
        DBAccessor.cancelTransction(transId);
        this.atm.changeState(new CardEjectingState(this.atm));
        return true;
    }

    @Override
    public float dispenseCash(int transId) {
        // code to get the CardType
        CardType cardType = null;
        //
        CardManagerFactory.getCardManager(cardType).executeWithdrawal(transId);
        this.atm.changeState(new CardEjectingState(this.atm));
        return DBAccessor.markAsExec(transId);
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("Some error");
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
        return ATMState.CARD_DISPENSING;
    }
}
