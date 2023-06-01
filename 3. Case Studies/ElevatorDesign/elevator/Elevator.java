package ElevatorDesign.elevator;

import ElevatorDesign.data.Floor;
import ElevatorDesign.moves.MoveStore;
import ElevatorDesign.states.ElevatorState;

public class Elevator {
    private Floor currentFloor;
    private ElevatorState state;
    private MoveStore moveStore;

    public Elevator(Floor currentFloor, MoveStore moveStore) {
        this.currentFloor = currentFloor;
        this.moveStore = moveStore;
    }

    public void setState(ElevatorState state) {
        this.state = state;
    }

    public MoveStore getMoveStore() {
        return moveStore;
    }

    public Floor getCurrentFloor() {
        return currentFloor;
    }

    public void open(Floor floor) {
        this.state.open(floor);
    }

    public void close(Floor floor) {
        this.state.close(floor);
    }

    public ElevatorState getState() {
        return state;
    }
}
