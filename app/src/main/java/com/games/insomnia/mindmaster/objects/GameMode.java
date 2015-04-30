package com.games.insomnia.mindmaster.objects;

/**
 * Created by askrobek on 30.04.15.
 * 12:11
 */
public class GameMode {

    private int ballInRowCount;
    private int colorCount;
    private boolean haveDuplicates;
    private int chances;

    public GameMode(){

    }

    public GameMode(int ballInRowCount, int colorCount, boolean haveDuplicates, int chances) {
        this.ballInRowCount = ballInRowCount;
        this.colorCount = colorCount;
        this.haveDuplicates = haveDuplicates;
        this.chances = chances;
    }

    public int getBallInRowCount() {
        return ballInRowCount;
    }

    public void setBallInRowCount(int ballInRowCount) {
        this.ballInRowCount = ballInRowCount;
    }

    public int getColorCount() {
        return colorCount;
    }

    public void setColorCount(int colorCount) {
        this.colorCount = colorCount;
    }

    public boolean isHaveDuplicates() {
        return haveDuplicates;
    }

    public void setHaveDuplicates(boolean haveDuplicates) {
        this.haveDuplicates = haveDuplicates;
    }

    public int getChances() {
        return chances;
    }

    public void setChances(int chances) {
        this.chances = chances;
    }

    public String toString(){
        return "GameMode: " + this.hashCode() + "\nBall in row count: " + ballInRowCount + ", color count: " +  colorCount + ", have duplicates: " + haveDuplicates + ", chances count: " + chances;
    }
}
