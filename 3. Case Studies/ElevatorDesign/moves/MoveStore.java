package ElevatorDesign.moves;

import java.util.Optional;

import ElevatorDesign.data.Direction;
import ElevatorDesign.data.Move;

public interface MoveStore {
    void addMove(Move move);

    Optional<Move> getTop();

    void celarTop();

    Direction getCurrentDirection();
}
