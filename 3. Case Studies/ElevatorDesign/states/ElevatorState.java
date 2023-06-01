package ElevatorDesign.states;

import ElevatorDesign.data.Direction;
import ElevatorDesign.data.Floor;
import ElevatorDesign.data.State;

public interface ElevatorState {
    void destine(Floor floor, Direction direction);

    void open(Floor floor);

    void close(Floor floor);

    void stop(Floor floor);

    State getNAme();
}
