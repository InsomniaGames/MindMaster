package com.games.insomnia.mindmaster.utils;

import com.games.insomnia.mindmaster.objects.GameMode;

/**
 * Created by askrobek on 30.04.15.
 * 12:37
 */
public enum GameModesEnum {
    CLASSIC(new GameMode(4, 6, true, 10)),
    EASY(new GameMode()),
    MEDIUM(new GameMode()),
    HARD(new GameMode()),
    ULTRA(new GameMode()),
    CUSTOM(new GameMode());

    GameModesEnum(GameMode mode){
        this.mode=mode;
    }

    protected GameMode mode;

    public GameMode getMode() {
        return mode;
    }
}
