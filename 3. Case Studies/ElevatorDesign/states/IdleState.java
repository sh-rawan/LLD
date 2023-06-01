package ElevatorDesign.states;

import ElevatorDesign.data.Direction;
import ElevatorDesign.data.Floor;
import ElevatorDesign.data.State;
import ElevatorDesign.elevator.Elevator;

public class IdleState implements ElevatorState {
    private final Elevator elevator;

    public IdleState(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void destine(Floor floor, Direction direction) {
        throw new RuntimeException();
    }

    @Override
    public void open(Floor floor) {
        throw new RuntimeException();
    }

    @Override
    public void close(Floor floor) {
        throw new RuntimeException();
    }

    @Override
    public void stop(Floor floor) {
        throw new RuntimeException();
    }

    @Override
    public State getNAme() {
        return State.HALT;
    }

}
