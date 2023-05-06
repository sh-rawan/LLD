package Chess.player;

import java.util.Map;

import Chess.board.ChessBoard;
import Chess.board.Pieces.ChessPiece;
import Chess.board.Pieces.PieceName;
import Chess.move.Move;

public class ComputerChessPlayer extends ChessPlayer {
    public ComputerChessPlayer(String name, Map<PieceName, ChessPiece> pieces, ChessBoard chessBoard){
        super(name, pieces, chessBoard);
    }
    public Move makeMove(){
        return null;
    }
}
