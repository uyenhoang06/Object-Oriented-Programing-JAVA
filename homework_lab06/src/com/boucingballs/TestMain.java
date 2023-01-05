package com.boucingballs;

public class TestMain {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 5, 100, 30);
        System.out.println(ball);

        Container containerBox = new Container(0, 0, 100, 100);
        System.out.println(containerBox);

        for (int i = 0; i < 100; i++) {
            ball.move();
            containerBox.collidesWith(ball);
            System.out.println(ball);
        }
    }
}

