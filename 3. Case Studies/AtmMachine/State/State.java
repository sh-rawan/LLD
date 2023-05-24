package AtmMachine.State;

import AtmMachine.data.CardDetails;

public interface State {
    public int init();

    public boolean cancel(int transId);

    public boolean readCard(CardDetails cardDetails);

    public boolean readWithdrawalDetails(CardDetails cardDetails, int transId, float amount);

    public float dispenseCash(int transId);

    public void ejectCard();

    public ATMState getStateName();
}
