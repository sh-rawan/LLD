package ElevatorDesign.states;

import ElevatorDesign.data.Direction;
import ElevatorDesign.data.Floor;
import ElevatorDesign.data.State;
import ElevatorDesign.elevator.Elevator;

public class MovingUpState implements ElevatorState {
    private final Elevator elevator;

    public MovingUpState(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void destine(Floor floor, Direction direction) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'destine'");
    }

    @Override
    public void open(Floor floor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'open'");
    }

    @Override
    public void close(Floor floor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'close'");
    }

    @Override
    public void stop(Floor floor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stop'");
    }

    @Override
    public State getNAme() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNAme'");
    }

}
