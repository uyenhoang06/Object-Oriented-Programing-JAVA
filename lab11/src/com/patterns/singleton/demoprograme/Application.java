package com.patterns.singleton.demoprograme;

public class Application {
    public static void main(String[] args) {
        Ball ball = Ball.getInstance("red");
        System.out.println(ball.getColor());

        ball = Ball.getInstance("green");
        System.out.println(ball.getColor());

        ball = Ball.getInstance("red");
        System.out.println(ball.getColor());
    }
}
