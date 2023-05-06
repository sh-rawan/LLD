package Chess.player;

import java.util.Map;

import Chess.board.ChessBoard;
import Chess.board.Pieces.ChessPiece;
import Chess.board.Pieces.PieceName;
import Chess.move.Move;

public class ChessPlayer extends Player {
    private final Map<PieceName, ChessPiece> pieces;
    private final ChessBoard chessBoard;
    public ChessPlayer(String name, Map<PieceName, ChessPiece> pieces, ChessBoard chessBoard) {
        super(name);
        this.chessBoard = chessBoard;
        this.pieces = pieces;
    }
    public Move makMove(){
        return null;
    }
    public ChessPiece getPiece(PieceName name){
        return pieces.get(name);
    }
    public ChessBoard getChessBoard() {
        return chessBoard;
    }

}
