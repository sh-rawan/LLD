package ElevatorDesign.states;

import ElevatorDesign.data.Direction;
import ElevatorDesign.data.Floor;
import ElevatorDesign.data.Move;
import ElevatorDesign.data.State;
import ElevatorDesign.elevator.Elevator;

public class MovingDownState implements ElevatorState {
    private final Elevator elevator;

    public MovingDownState(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void destine(Floor floor, Direction direction) {
        this.elevator.getMoveStore().addMove(new Move(floor, direction));
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
        this.elevator.getMoveStore().celarTop();
        this.elevator.setState(new IdleState(this.elevator));
    }

    @Override
    public State getNAme() {
        return State.MOVING_DOWN;
    }

}
