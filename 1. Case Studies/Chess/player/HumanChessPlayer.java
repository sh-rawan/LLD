package Chess.player;

import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

import Chess.board.ChessBoard;
import Chess.board.Pieces.ChessPiece;
import Chess.board.Pieces.PieceName;
import Chess.move.Move;
import Chess.move.Pair;

public class HumanChessPlayer extends ChessPlayer {
    public HumanChessPlayer(String name, Map<PieceName, ChessPiece> pieces, ChessBoard chessBoard){
        super(name, pieces, chessBoard);
    }
    public Move makeMove(){
        getChessBoard().display();
        // if(true)
        //     throw new RuntimeException("Invalid piece");
        int x,y;
        Scanner scan = new Scanner(System.in);
        x=scan.nextInt();
        y=scan.nextInt(); scan.close();
        Optional<ChessPiece> chessPiece =  getChessBoard().getCell(new Pair(x, y)).getChessPiece();
        if(!chessPiece.isPresent()) throw new RuntimeException("Invalid spot");
        if(!chessPiece.get().equals(getPiece(chessPiece.get().getName())))
            throw new RuntimeException("Invalid piece");
        Pair source = new Pair(x,y);
        scan = new Scanner(System.in);
        x=scan.nextInt();
        y=scan.nextInt(); scan.close();
        Pair destination = new Pair(x,y);
        // addchk Add the validation for the destination here.
        return new Move(source, destination);
    }
}
