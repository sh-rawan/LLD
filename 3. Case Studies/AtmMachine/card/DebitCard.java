package AtmMachine.card;

import AtmMachine.data.CardDetails;

public class DebitCard implements CardManager {

    @Override
    public void executeWithdrawal(int transId) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean validateCard(CardDetails cardDetails) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean validateWithdrawal(float amount, int transId) {
        // TODO Auto-generated method stub
        return false;
    }

}
