package exercise2.exercise2_1;

public class TestPoint {
    public static void main(String[] args) {
        Point point1 = new Point(10, 20);
        System.out.println(point1);

        point1.setXY(100, 10);
        System.out.println(point1);
        System.out.println(point1.getX());
        System.out.println(point1.getY());
    }
}
