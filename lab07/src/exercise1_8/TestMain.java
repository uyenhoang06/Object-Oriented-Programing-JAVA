package exercise1_8;

public class TestMain {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 6, 10, 15);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);

        Movable m2 = new MovableCircle(1, 2, 3, 4, 20);
        System.out.println(m2);
        m2.moveRight();
        m2.moveUp();
        System.out.println(m2);

        Movable m3 = new MovableRectangle(0, 0, 5, 5, 2, 2);
        System.out.println(m3);
        m3.moveUp();
        m3.moveRight();
        System.out.println(m3);

        Movable m4 = new MovableRectangle(1,1, 6, 6, 2, 2);
        System.out.println(m4);
        m4.moveDown();
        m4.moveLeft();
        System.out.println(m4);
    }
}
