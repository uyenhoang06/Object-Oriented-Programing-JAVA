package exercise1_5;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        GeometricObject circle1 = new Circle(2);
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
    }
}
