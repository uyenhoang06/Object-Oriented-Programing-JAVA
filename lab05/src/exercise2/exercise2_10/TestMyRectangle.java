package exercise2.exercise2_10;

public class TestMyRectangle {
    public static void main(String[] args) {
        // Test constructors
        MyRectangle triangle1 = new MyRectangle(0, 5, 3, 0);
        MyRectangle triangle2 = new MyRectangle(new MyPoint(-4, 2), new MyPoint(3, -5));

        // Test toString()
        System.out.println(triangle1);
        System.out.println(triangle2);

        // test setters
        triangle1.setV1(new MyPoint(0, 0));
        triangle1.setV1(new MyPoint(-1, 2));
        System.out.println(triangle1);

        // test getters
        System.out.println("bottom-right corner is: " + triangle1.getV2());
        System.out.println("top-left corner is: " + triangle1.getV1());
    }
}
