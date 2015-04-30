package com.games.insomnia.mindmaster.objects;

import com.games.insomnia.mindmaster.utils.BoardSettings;

import java.util.ArrayList;

/**
 * Created by askrobek on 30.04.15.
 * 15:06
 */
public class AnswerRow {

    private ArrayList<Ball> pattern;
    private int size;
    private int colorCount;
    private boolean haveDuplicates;

    public AnswerRow(){
        this.size = BoardSettings.getInstance().getMode().getBallInRowCount();
        this.colorCount = BoardSettings.getInstance().getMode().getColorCount();
        this.haveDuplicates = BoardSettings.getInstance().getMode().isHaveDuplicates();
        this.pattern = generatePattern();
    }

    private ArrayList<Ball> generatePattern(){
        ArrayList<Ball> pattern = new ArrayList<>();
        return pattern;
    }



}
