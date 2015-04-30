package com.games.insomnia.mindmaster;

import com.games.insomnia.mindmaster.objects.GameMode;

/**
 * Created by askrobek on 30.04.15.
 * 12:09
 */
public class Game {

    private GameMode currentMode;

    public Game(GameMode mode){
        newGame(mode);
    }

    private void newGame(GameMode mode){
        this.currentMode = mode;
    }

    public GameMode getCurrentMode() {
        return currentMode;
    }
}
