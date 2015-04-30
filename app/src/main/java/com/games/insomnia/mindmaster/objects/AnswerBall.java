package com.games.insomnia.mindmaster.objects;

import android.graphics.Color;

/**
 * Created by askrobek on 30.04.15.
 * 14:48
 */
public class AnswerBall extends BaseObject {

    private int value;
    private Color color;

    public AnswerBall(int value, Color color) {
        this.value = value;
        this.color = color;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
