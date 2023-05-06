package Chess.board;

import java.util.Optional;

import Chess.board.Pieces.ChessPiece;

public class ChessCell {
    private final int x;
    private final int y;
    private Optional<ChessPiece> chessPiece;
    public ChessCell(int x, int y) {
        this.x = x;
        this.y = y;
        this.chessPiece = Optional.empty();
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public Optional<ChessPiece> getChessPiece() {
        return chessPiece;
    }
    public ChessCell setChessPiece(Optional<ChessPiece> chessPiece) {
        this.chessPiece = chessPiece;
        return this;
    }
    
    
}
