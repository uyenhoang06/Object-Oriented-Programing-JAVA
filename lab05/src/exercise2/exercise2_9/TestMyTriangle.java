package exercise2.exercise2_9;

public class TestMyTriangle {
    public static void main(String[] args) {
        // Test constructors
        MyTriangle t1 = new MyTriangle(0, 0, 4, 1, 1, 5);
        MyTriangle t2 = new MyTriangle(new MyPoint(0, 0), new MyPoint(0, 2), new MyPoint(2, 0));

        // Test toString()
        System.out.println(t1);
        System.out.println(t2);

        System.out.printf("%s %s %s %s %s %.2f\n", "Triangle", t1, "is", t1.getType(), "and has perimeter", t1.getPerimeter());
        System.out.printf("%s %s %s %s %s %.2f\n", "Triangle", t2, "is", t2.getType(), "and has perimeter", t2.getPerimeter());
    }
}
