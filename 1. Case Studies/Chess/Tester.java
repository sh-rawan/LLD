package Chess;

import java.util.HashMap;
import java.util.Map;

import Chess.board.ChessBoard;
import Chess.board.Pieces.Bishop;
import Chess.board.Pieces.ChessPiece;
import Chess.board.Pieces.Color;
import Chess.board.Pieces.King;
import Chess.board.Pieces.Knight;
import Chess.board.Pieces.Pawn;
import Chess.board.Pieces.PieceName;
import Chess.board.Pieces.Queen;
import Chess.board.Pieces.Rook;
import Chess.game.BoardGame;
import Chess.game.Chess;
import Chess.player.ChessPlayer;
import Chess.player.HumanChessPlayer;

public class Tester {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        ChessPlayer firstplayer = new HumanChessPlayer("Shrawan", getPieces(Color.WHITE), chessBoard);
        ChessPlayer secondplayer = new HumanChessPlayer("Aditya", getPieces(Color.BLACK), chessBoard);
        BoardGame chessBoardGame = new Chess(firstplayer, secondplayer, chessBoard);
        chessBoardGame.startGame();
    }
    // Move 1              || --------- Move 2 ---------         
    // 0 1                 || 0 6  || 2 5  || 4 4 || 6 5       
    // 2 0                 || 2 5  || 4 4  || 6 5 || 7 3 
    //                     ||      ||      ||     ||  
    // 7 6                 || 7 1  || 5 2  || 7 1 || Shrawan won the match ****
    // 5 6 --> invalid     || 5 2  || 7 1  || 5 2 ||       



    private static Map<PieceName, ChessPiece> getPieces(Color color){
        Map<PieceName, ChessPiece> pieces = new HashMap<>();
        pieces.put(PieceName.BISHOP1, new Bishop(color, PieceName.BISHOP1, false));
        pieces.put(PieceName.BISHOP2, new Bishop(color, PieceName.BISHOP2, false));
        pieces.put(PieceName.KNIGHT1, new Knight(color, PieceName.KNIGHT1, false));
        pieces.put(PieceName.KNIGHT2, new Knight(color, PieceName.KNIGHT2, false));
        pieces.put(PieceName.ROOK1, new Rook(color, PieceName.ROOK1, false));
        pieces.put(PieceName.ROOK2, new Rook(color, PieceName.ROOK2, false));
        pieces.put(PieceName.KING, new King(color, PieceName.KING, false));
        pieces.put(PieceName.QUEEN, new Queen(color, PieceName.QUEEN, false));
        pieces.put(PieceName.PAWN1, new Pawn(color, PieceName.PAWN1, false));
        pieces.put(PieceName.PAWN2, new Pawn(color, PieceName.PAWN2, false));
        pieces.put(PieceName.PAWN3, new Pawn(color, PieceName.PAWN3, false));
        pieces.put(PieceName.PAWN4, new Pawn(color, PieceName.PAWN4, false));
        pieces.put(PieceName.PAWN5, new Pawn(color, PieceName.PAWN5, false));
        pieces.put(PieceName.PAWN6, new Pawn(color, PieceName.PAWN6, false));
        pieces.put(PieceName.PAWN7, new Pawn(color, PieceName.PAWN7, false));
        pieces.put(PieceName.PAWN8, new Pawn(color, PieceName.PAWN8, false));
        return pieces;
    }
}
