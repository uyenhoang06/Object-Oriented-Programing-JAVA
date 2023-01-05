package exercise1.exercise1_4;

public class TestMain {
    public static void main(String[] args) {
        //shape
        Shape shape1 = new Circle(5.0, "BLUE", true);
        System.out.println(shape1);
        System.out.println(shape1.getColor());
        shape1.setFilled(false);
        System.out.println(shape1.isFilled());
        System.out.println(((Circle)shape1).getRadius());

        //Circle
        Circle circle = new Circle();
        circle.setColor("pink");
        circle.setRadius(2);
        System.out.println(circle);

        Circle circle0 = new Circle(2.0);
        System.out.println(circle0);

        Circle circle1 = (Circle)shape1;
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getColor());
        System.out.println(circle1.isFilled());
        System.out.println(circle1.getRadius());

        //Rectangle
        Shape s3 = new Rectangle(2.0, 4.0, "YELLOW", false);
        System.out.println(s3);
        System.out.println(s3.getColor());
        System.out.println(((Rectangle)s3).getLength());

        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        System.out.println(r1.getPerimeter());

        //square
        Shape s4 = new Square(5.0);
        System.out.println(s4);
        System.out.println(s4.getColor());
        System.out.println(((Square)s4).getWidth());

        Square s5 = new Square();
        s5.setSide(5);
        System.out.println(s5.getSide());

        Square s6 = new Square(4, "Pink", true);
        System.out.println(s6);

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(r2.getWidth());
        System.out.println(r2.getLength());

        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getWidth());
        System.out.println(sq1.getLength());
    }
}
