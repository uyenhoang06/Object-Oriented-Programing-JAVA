package exercise2.exercise2_2;

public class TestMain {
    public static void main(String[] args) {
        //Circle
        Circle circle1 = new Circle();
        circle1.setColor("red");
        circle1.setRadius(1.0);
        System.out.println(circle1);

        Circle circle2 = new Circle(1.0);
        System.out.println(circle2.getColor());
        System.out.println(circle2.getRadius());
        System.out.println(circle2.getArea());
        System.out.println(circle2);

        Circle circle3 = new Circle(10, "green");
        System.out.println(circle3);

        //Cylinder
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);

        Cylinder cylinder2 = new Cylinder(2.0);
        System.out.println(cylinder2.getHeight());
        System.out.println(circle2);

        Cylinder cylinder3 = new Cylinder(10, 10);
        System.out.println(cylinder3.getArea());
        System.out.println(cylinder3.getVolume());
        cylinder3.setHeight(20);
        System.out.println(cylinder3);

        Cylinder cylinder4 = new Cylinder(5, "black", 5);
        System.out.println(cylinder4);
    }
}
