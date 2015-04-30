package com.games.insomnia.mindmaster;

import com.games.insomnia.mindmaster.objects.AnswerRow;
import com.games.insomnia.mindmaster.objects.GameMode;
import com.games.insomnia.mindmaster.utils.BoardSettings;

/**
 * Created by askrobek on 30.04.15.
 * 12:09
 */
public class Game {

    private GameMode currentMode;
    private AnswerRow pattern;

    public Game(GameMode mode){
        newGame(mode);
        pattern = new AnswerRow();
    }

    private void newGame(GameMode mode){
        BoardSettings.getInstance().setMode(mode);
        this.currentMode = BoardSettings.getInstance().getMode();
    }

    public GameMode getCurrentMode() {
        return currentMode;
    }

    public AnswerRow getPattern() {
        return pattern;
    }

    public void setPattern(AnswerRow pattern) {
        this.pattern = pattern;
    }
}
