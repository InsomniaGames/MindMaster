package com.games.insomnia.mindmaster.objects;

/**
 * Created by askrobek on 30.04.15.
 * 13:53
 */
public class Ball extends BaseObject {

    private int value;
    private int color;

    public Ball(int value, int color) {
        this.value = value;
        this.color = color;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String toString(){
        return "Ball: " + this.hashCode() + "Value: " + value + " color: " + color;
    }
}
