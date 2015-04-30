package com.games.insomnia.mindmaster.utils;

import com.games.insomnia.mindmaster.objects.GameMode;

/**
 * Created by askrobek on 30.04.15.
 * 15:12
 */
public class BoardSettings {

    private static BoardSettings instance = null;
    private GameMode mode;

    private BoardSettings(){
    }

    public static BoardSettings getInstance() {
        if(instance == null) {
            instance = new BoardSettings();
        }
        return instance;
    }

    public GameMode getMode() {
        return mode;
    }

    public void setMode(GameMode mode) {
        this.mode = mode;
    }
}
