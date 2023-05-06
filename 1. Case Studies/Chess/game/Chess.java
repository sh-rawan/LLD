package Chess.game;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import Chess.board.ChessBoard;
import Chess.board.Pieces.PieceName;
import Chess.player.ChessPlayer;
import Chess.player.Player;

public class Chess extends BoardGame {
    private final ChessPlayer player1, player2;

    public Chess(ChessPlayer player1, ChessPlayer player2, ChessBoard chessBoard){
        super(chessBoard, new LinkedList<Player>(Arrays.asList(player1, player2)));
        this.player1 = player1;
        this.player2 = player2;
        prepareBoard(this.player1, this.player2, chessBoard);
    }
    public boolean isOver(){
        return player1.getPiece(PieceName.KING).isDead() || player2.getPiece(PieceName.KING).isDead();
    }
    private void prepareBoard(ChessPlayer firstPlayer, ChessPlayer secondPlayer, ChessBoard board){
        placePawns(board, firstPlayer, secondPlayer);
        placeRooks(board, firstPlayer, secondPlayer);
        placeKnights(board, firstPlayer, secondPlayer);
        placeBishops(board, firstPlayer, secondPlayer);
        placeKing(board, firstPlayer, secondPlayer);
        placeQueens(board, firstPlayer, secondPlayer);
    }
    private void placePawns(ChessBoard board, ChessPlayer firstPlayer, ChessPlayer secondPlayer){
        List<PieceName> pieceNames = Arrays.asList(PieceName.PAWN1, PieceName.PAWN2, PieceName.PAWN3, PieceName.PAWN4, PieceName.PAWN5, PieceName.PAWN6, PieceName.PAWN7, PieceName.PAWN8);
        int col = 0;
        for (PieceName pieceName : pieceNames){
            board.putPiece(firstPlayer.getPiece(pieceName),1,col);
            board.putPiece(secondPlayer.getPiece(pieceName),1,col++);
        }
    };

    private void placeRooks(ChessBoard board, ChessPlayer firstPlayer, ChessPlayer secondPlayer){
        board.putPiece(firstPlayer.getPiece(PieceName.ROOK1),0,0);
        board.putPiece(firstPlayer.getPiece(PieceName.ROOK2),0,7);
        board.putPiece(secondPlayer.getPiece(PieceName.ROOK2),7,0);
        board.putPiece(secondPlayer.getPiece(PieceName.ROOK2),7,7);
    };

    private void placeKnights(ChessBoard board, ChessPlayer firstPlayer, ChessPlayer secondPlayer){
        board.putPiece(firstPlayer.getPiece(PieceName.KNIGHT1),0,1);
        board.putPiece(firstPlayer.getPiece(PieceName.KNIGHT2),0,6);
        board.putPiece(secondPlayer.getPiece(PieceName.KNIGHT2),7,1);
        board.putPiece(secondPlayer.getPiece(PieceName.KNIGHT2),7,6);
    };

    private void placeBishops(ChessBoard board, ChessPlayer firstPlayer, ChessPlayer secondPlayer){
        board.putPiece(firstPlayer.getPiece(PieceName.BISHOP1),0,2);
        board.putPiece(firstPlayer.getPiece(PieceName.BISHOP2),0,5);
        board.putPiece(secondPlayer.getPiece(PieceName.BISHOP2),7,2);
        board.putPiece(secondPlayer.getPiece(PieceName.BISHOP2),7,5);
    };

    private void placeKing(ChessBoard board, ChessPlayer firstPlayer, ChessPlayer secondPlayer){
        board.putPiece(firstPlayer.getPiece(PieceName.KING),0,3);
        board.putPiece(secondPlayer.getPiece(PieceName.KING),7,3);
    };

    private void placeQueens(ChessBoard board, ChessPlayer firstPlayer, ChessPlayer secondPlayer){
        board.putPiece(firstPlayer.getPiece(PieceName.QUEEN),0,4);
        board.putPiece(secondPlayer.getPiece(PieceName.QUEEN),7,4);
    };

}
