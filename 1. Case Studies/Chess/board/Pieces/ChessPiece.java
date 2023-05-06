package Chess.board.Pieces;

import Chess.board.ChessBoard;
import Chess.board.ChessCell;

public interface ChessPiece {
    void move(ChessCell  source, ChessCell destination, ChessBoard ChessBoard);
    boolean isDead();
    void setDead(boolean isDead);
    PieceName getName();
}
