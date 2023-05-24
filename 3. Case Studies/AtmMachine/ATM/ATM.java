package AtmMachine.ATM;

import AtmMachine.State.State;
import AtmMachine.State.StateFactory;
import AtmMachine.db.DBAccessor;

public class ATM {
    private final String machineId;
    private State state;

    public ATM(String machineId) {
        this.machineId = machineId;
        // this.state = new ReadyState(this);
        this.state = StateFactory.getState(DBAccessor.getAtmState(machineId), this);
    }

    public int init() {
        return this.state.init();
    }

    public boolean cancel(int transId) {
        return true;
    }

    public boolean readCard(String cardType, long cardNum, int pin, String name) {
        return true;
    }

    public boolean readWithdrawalDetails(String cardType) {
        return true;
    }

    public boolean dispenseCash(int transId) {
        return true;
    }

    public void ejectCard() {
        //
    }

    public String getMachineId() {
        return machineId;
    }

    public void changeState(State state) {
        this.state = state;
        DBAccessor.updateATMState(machineId, state.getStateName());
    }
}
