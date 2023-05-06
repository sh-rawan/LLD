package Chess.game;

import java.util.Queue;

import Chess.board.Board;
import Chess.move.Move;
import Chess.player.Player;

public abstract class BoardGame {
    private final Board board;
    private final Queue<Player> players;

    public BoardGame(Board board, Queue<Player> players){
        this.board = board;
        this.players = players;
    }

    public void startGame() {
        while(true){
            Player currentPlayer = players.poll();
            Move move = currentPlayer.makMove();
            board.applyMove(move);
            if(isOver()){
                System.out.println("Game is over");
                break;
            }
            players.add(currentPlayer);
        }
    }

    public abstract boolean isOver();
}
