package com.games.insomnia.mindmaster.objects;

import java.util.ArrayList;

/**
 * Created by askrobek on 30.04.15.
 * 14:35
 */
public class BoardRow extends BaseObject {

    private int rowSize;
    private ArrayList<Ball> ballInRow;
    private boolean currentRow;
    private ArrayList<AnswerBall> answerBalls;

    public BoardRow(int rowSize) {
        this.rowSize = rowSize;
    }

    public int getRowSize() {
        return rowSize;
    }

    public void setRowSize(int rowSize) {
        this.rowSize = rowSize;
    }

    public ArrayList<Ball> getBallInRow() {
        return ballInRow;
    }

    public void setBallInRow(ArrayList<Ball> ballInRow) {
        this.ballInRow = ballInRow;
    }

    public boolean isCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(boolean currentRow) {
        this.currentRow = currentRow;
    }

    public ArrayList<AnswerBall> getAnswerBalls() {
        return answerBalls;
    }

    public void setAnswerBalls(ArrayList<AnswerBall> answerBalls) {
        this.answerBalls = answerBalls;
    }


}
