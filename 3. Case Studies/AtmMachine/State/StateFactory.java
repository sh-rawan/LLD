package AtmMachine.State;

import AtmMachine.ATM.ATM;

public class StateFactory {
    private StateFactory() {
    }

    public static State getState(ATMState atmState, ATM atm) {
        State state = null;
        if (atmState.equals(ATMState.READY)) {
            state = new ReadyState(atm);
        } else if (atmState.equals(ATMState.CARD_EJECTING)) {
            state = new CardEjectingState(atm);
        } else if (atmState.equals(ATMState.CARD_DISPENSING)) {
            state = new CashDispensingState(atm);
        } else if (atmState.equals(ATMState.CARD_READING)) {
            state = new CardReadingState(atm);
        } else if (atmState.equals(ATMState.WITHDRAWEL_DETAILS)) {
            state = new WithdrawelDetailsState(atm);
        } else {
            throw new IllegalArgumentException("Not a valid state");
        }
        return state;
    }
}
