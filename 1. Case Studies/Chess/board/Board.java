package Chess.board;

import Chess.board.Pieces.ChessPiece;
import Chess.move.Move;

public interface Board {
    void applyMove(Move move);
    void display();
    void putPiece(ChessPiece chessPiece, int row, int col);
}
