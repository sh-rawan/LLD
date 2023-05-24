package AtmMachine.State;

import AtmMachine.ATM.ATM;
import AtmMachine.card.CardManagerFactory;
import AtmMachine.data.CardDetails;
import AtmMachine.db.DBAccessor;

public class CardReadingState implements State {

    private final ATM atm;

    @Override
    public boolean cancel(int transId) {
        DBAccessor.cancelTransction(transId);
        this.atm.changeState(new ReadyState(this.atm));
        return true;
    }

    public CardReadingState(ATM atm) {
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
        throw new IllegalStateException("Some error");
    }

    @Override
    public boolean readCard(CardDetails cardDetails) {
        boolean result = CardManagerFactory.getCardManager(cardDetails.getCardType()).validateCard(cardDetails);
        DBAccessor.persistCardDetails(cardDetails, this.atm.getMachineId());
        if (result) {
            this.atm.changeState(new WithdrawelDetailsState(this.atm));
        } else {
            DBAccessor.disapproveTransaction(this.atm.getMachineId());
            this.atm.changeState(new ReadyState(this.atm));
        }
        return true;
    }

    @Override
    public boolean readWithdrawalDetails(CardDetails cardDetails, int transId, float amount) {
        throw new IllegalStateException("Some error");
    }

    @Override
    public ATMState getStateName() {
        return ATMState.CARD_READING;
    }

}
