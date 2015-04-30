package com.games.insomnia.mindmaster.objects;

import com.games.insomnia.mindmaster.utils.BallEnum;
import com.games.insomnia.mindmaster.utils.BoardSettings;

import java.util.ArrayList;
import java.util.Random;

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
        for(int i = 0;i < size; i ++){
            pattern.add(generateBall());
        }
        return pattern;
    }

    private Ball generateBall(){
        Random rand = new Random();
        if(haveDuplicates){
            return combinationWithoutRepetition(rand);
        }else {
            return combinationWithRepetition(rand);
        }
    }

    private Ball combinationWithoutRepetition(Random rand){
        return null;
    }

    private Ball combinationWithRepetition(Random rand){
        return BallEnum.getBall(rand.nextInt(colorCount + 1));
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(Ball ball : pattern){
            builder.append(ball.toString()).append(" ");
        }
        return builder.toString();
    }


}
