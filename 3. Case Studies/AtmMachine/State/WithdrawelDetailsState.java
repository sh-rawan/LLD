package AtmMachine.State;

import AtmMachine.ATM.ATM;
import AtmMachine.card.CardManagerFactory;
import AtmMachine.data.CardDetails;
import AtmMachine.data.TranscState;
import AtmMachine.db.DBAccessor;

public class WithdrawelDetailsState implements State {

    private final ATM atm;

    public WithdrawelDetailsState(ATM atm) {
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
        throw new IllegalStateException("Some error");
    }

    @Override
    public boolean readWithdrawalDetails(CardDetails cardDetails, int transId, float amount) {
        boolean result = CardManagerFactory.getCardManager(cardDetails.getCardType()).validateWithdrawal(amount,
                transId);
        if (result) {
            DBAccessor.persistWithdrawalDetails(transId, amount, TranscState.ACCEPTED);
            this.atm.changeState(new CashDispensingState(this.atm));
        } else {
            DBAccessor.persistWithdrawalDetails(transId, amount, TranscState.REJECTED);
            this.atm.changeState(new CardEjectingState(this.atm));
        }
        return result;
    }

    @Override
    public ATMState getStateName() {
        return ATMState.WITHDRAWEL_DETAILS;
    }
}
