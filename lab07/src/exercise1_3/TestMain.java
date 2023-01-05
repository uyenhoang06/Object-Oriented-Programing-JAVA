package exercise1_3;

public class TestMain {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(0, 0, 1, 1);
        System.out.println(point1);
        point1.moveUp();
        System.out.println(point1);
        point1.moveLeft();
        System.out.println(point1);

        MovablePoint point2 = new MovablePoint(5, 5, 2, 2);
        System.out.println(point2);
        point2.moveDown();
        System.out.println(point2);
        point2.moveRight();
        System.out.println(point2);
    }
}
