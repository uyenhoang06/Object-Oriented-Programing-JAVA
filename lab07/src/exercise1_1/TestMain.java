package exercise1_1;

public class TestMain {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5.5, "red", false);
        System.out.println(shape1);
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimeter());
        System.out.println(shape1.getColor());
        System.out.println(shape1.isFilled());
        //System.out.println(shape1.getRadius()); // Shape khong co phuong thuc getRadius()

        Circle circle1 = (Circle) shape1;
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getColor());
        System.out.println(circle1.isFilled());
        System.out.println(circle1.getRadius());

        //Shape shape2 = new Shape(); Shape la abstract class, nen khong the du dung ham dung

        Shape shape3 = new Rectangle(1.0, 2.0, "red", false);
        System.out.println(shape3);
        System.out.println(shape3.getArea());
        System.out.println(shape3.getPerimeter());
        System.out.println(shape3.getColor());
        //System.out.println(shape3.getLength()); Shape khong co phuong thuc getColor()

        Shape shape4 = new Square(6.6);
        System.out.println(shape4);
        System.out.println(shape4.getArea());
        System.out.println(shape4.getColor());
        //System.out.println(shape4.getSize()); Shape khong co phuong thuc getSize()

        Rectangle rectangle2 = (Rectangle) shape4;
        System.out.println(rectangle2);
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getColor());
        //System.out.println(rectangle2.getSize()); // Rectangle khong co phuong thuc getSize()
        System.out.println(rectangle2.getLength());

        Square square1 = (Square) rectangle2;
        System.out.println(square1);
        System.out.println(square1.getArea());
        System.out.println(square1.getColor());
        System.out.println(square1.getSize());
        System.out.println(square1.getLength());
    }
}
