package exercise1_4;

public class TestMain {
    public static void main(String[] args) {
        MovableCircle movableCircle1 = new MovableCircle(0, 0, 1, 1, 5);
        System.out.println(movableCircle1);
        movableCircle1.moveDown();
        System.out.println(movableCircle1);
        movableCircle1.moveLeft();
        System.out.println(movableCircle1);

        MovableCircle movableCircle2 = new MovableCircle(1, 1, 2, 2, 4);
        System.out.println(movableCircle2);
        movableCircle2.moveUp();
        System.out.println(movableCircle2);
        movableCircle2.moveRight();
        System.out.println(movableCircle2);
    }
}
