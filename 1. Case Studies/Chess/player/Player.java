package Chess.player;

import Chess.move.Move;

public abstract class Player {

    private final String name;

    protected Player(String name) {
        this.name = name;
    }

    public abstract Move makMove();

    public String getName(){
        return name;
    }
}
