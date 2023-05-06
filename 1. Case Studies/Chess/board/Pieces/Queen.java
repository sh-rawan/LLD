package Chess.board.Pieces;

import Chess.board.ChessBoard;
import Chess.board.ChessCell;

public class Queen implements ChessPiece {
    private final Color color;
    private final PieceName name;
    private boolean isDead;
    public Queen(Color color, PieceName name, boolean isDead) {
        this.color = color;
        this.name = name;
        this.isDead = isDead;
    }

    public void move(ChessCell source, ChessCell destination, ChessBoard chessBoard){

    }

    public void setDead(boolean isDead){
        this.isDead=isDead;
    }
    
    public Color getColor() {
        return color;
    }
    public boolean isDead(){
        return isDead;
    }

    public PieceName getName() {
        return name;
    }
}
