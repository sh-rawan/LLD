package AtmMachine.db;

import AtmMachine.State.ATMState;
import AtmMachine.data.CardDetails;
import AtmMachine.data.TranscState;

public class DBAccessor {
    private DBAccessor() {
    }

    public static ATMState getAtmState(String machineId) {
        // Some logic to find the machine ID
        return ATMState.READY;
    }

    public static int createNewTransaction(String machineId) {
        return 1;
    }

    public static void updateATMState(String machineId, ATMState state) {
    }

    public static void persistCardDetails(CardDetails cardDetails, String machineId) {
    }

    public static void disapproveTransaction(String machineId) {
    }

    public static void cancelTransction(int transId) {
    }

    public static void persistWithdrawalDetails(int transId, float amount, TranscState transcState) {
    }

    public static float markAsExec(int transId) {
        return 1;
    }
}
