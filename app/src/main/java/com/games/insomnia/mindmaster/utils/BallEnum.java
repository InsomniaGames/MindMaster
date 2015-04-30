package com.games.insomnia.mindmaster.utils;

import com.games.insomnia.mindmaster.R;
import com.games.insomnia.mindmaster.objects.Ball;

/**
 * Created by askrobek on 30.04.15.
 * 12:37
 */
public enum BallEnum {
    RED(new Ball(0, R.color.red)),
    GREEN(new Ball(1, R.color.green)),
    BLUE(new Ball(2, R.color.blue)),
    YELLOW(new Ball(3, R.color.yellow)),
    PURPLE(new Ball(4, R.color.purple)),
    CYAN(new Ball(5, R.color.cyan)),
    ORANGE(new Ball(6, R.color.orange)),
    BROWN(new Ball(7, R.color.brown)),
    PINK(new Ball(8, R.color.pink)),
    GREY(new Ball(9, R.color.grey)),
    TEAL(new Ball(10, R.color.teal)),
    OLIVE(new Ball(11, R.color.olive));

    BallEnum(Ball ball){
        this.ball=ball;
    }

    protected Ball ball;

    public static Ball getBall(int value) {
        return BallEnum.values()[value].getBall();
    }

    public Ball getBall(){
        return ball;
    }
}
