package Chess.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import Chess.board.Pieces.ChessPiece;
import Chess.move.Move;
import Chess.move.Pair;

public class ChessBoard implements Board {
    List<List<ChessCell>> chessCells;

    public ChessBoard(){
        this.chessCells = new ArrayList<>();
        for(int i = 0; i < 8; i++){
            List<ChessCell> cells = new ArrayList<>();
            for (int j = 0; j < 8; j++) {
                cells.add(new ChessCell(i,j));
            }
            chessCells.add(cells);
        }
    }
    public void applyMove(Move move){
        // if(true)
        // throw new RuntimeException("Invalid piece");
        ChessCell sourceCell = getCell(move.getSource());
        ChessPiece chessPiece = sourceCell.getChessPiece().get();
        chessPiece.move(sourceCell, getCell(move.getDestination()), this);
    }
    public void putPiece(ChessPiece chessPiece, int row, int col){
        chessCells.get(row).set(col, new ChessCell(row, col).setChessPiece(Optional.of(chessPiece)));
    }

    public void display(){
        for(int row = 0; row < 8; row++){
            for(int col = 0; col < 8; col++){
                Pair pair = new Pair(row, col);
                Optional<ChessPiece> chessPiece=getCell(pair).getChessPiece();
                if(!chessPiece.isPresent()){
                    System.out.println("0 | ");
                }else{
                    System.out.println(chessPiece.get().getName() + " | ");
                }
            }
            System.out.println();
        }
    }

    public ChessCell getCell(Pair pair){
        return this.chessCells.get(pair.getX()).get(pair.getY());
    }

    public void removePiece(int row, int col) {
        chessCells.get(row).get(col).setChessPiece(Optional.empty());
    }
}
