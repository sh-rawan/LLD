package ElevatorDesign.moves;

import java.util.Optional;
import java.util.PriorityQueue;

import ElevatorDesign.data.Direction;
import ElevatorDesign.data.Move;

public class UnidirectionalMoveStore implements MoveStore {
    private final PriorityQueue<Move> upMoves;
    private final PriorityQueue<Move> downMoves;
    private Direction currDirection;

    public UnidirectionalMoveStore() {
        this.upMoves = new PriorityQueue<Move>(
                (f1, f2) -> f1.getDestinationFloor().getNumber() - f2.getDestinationFloor().getNumber());
        this.downMoves = new PriorityQueue<Move>(
                (f1, f2) -> f1.getDestinationFloor().getNumber() - f2.getDestinationFloor().getNumber());
        this.currDirection = Direction.HALT;
    }

    @Override
    public void addMove(Move move) {
        if (this.upMoves.isEmpty() && this.downMoves.isEmpty()) {
            this.currDirection = move.getDestinationDirection();
        }
        if (move.getDestinationDirection().equals(Direction.UP)) {
            this.upMoves.add(move);
        } else {
            this.downMoves.add(move);
        }
    }

    @Override
    public Optional<Move> getTop() {
        if (this.upMoves.isEmpty() && this.downMoves.isEmpty()) {
            return Optional.empty();
        }
        if (currDirection.equals(Direction.UP)) {
            return Optional.of(this.upMoves.peek());
        }
        return Optional.of(this.downMoves.peek());
    }

    @Override
    public void celarTop() {
        if (this.upMoves.isEmpty() && this.downMoves.isEmpty()) {
            throw new RuntimeException();
        }
        if (this.currDirection.equals(Direction.UP)) {
            this.upMoves.poll();
            if (this.upMoves.isEmpty()) {
                if (!this.downMoves.isEmpty()) {
                    this.currDirection = Direction.DOWN;
                } else {
                    this.currDirection = Direction.HALT;
                }
            } else {
                this.downMoves.poll();
                if (this.downMoves.isEmpty()) {
                    if (!this.upMoves.isEmpty()) {
                        this.currDirection = Direction.UP;
                    } else {
                        this.currDirection = Direction.HALT;
                    }
                }
            }
        }

    }

    @Override
    public Direction getCurrentDirection() {
        return this.currDirection;
    }

}
