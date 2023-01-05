package exercise2.exercise2_8;

import java.util.Arrays;

public class TestMyCircle {
    public static void main(String[] args) {
        // test constructors
        MyCircle circle = new MyCircle();
        MyCircle c1 = new MyCircle(0, 0, 1);
        MyCircle c2 = new MyCircle(new MyPoint(1, 1), 2);

        // test toString()
        System.out.println("Circle c1: " + c1);
        System.out.println("Circle c2: " + c2);

        // test getters and setters
        c1.setRadius(5);
        System.out.println("Radius of circle c1 now is " + c1.getRadius());

        c2.setCenterXY(3, 3);
        System.out.println("Center of circle c2 now is " + c2.getCenter());

        circle.setCenter(new MyPoint(4, 4));
        System.out.println("Center of circle c1 now is " + Arrays.toString(circle.getCenterXY()));

        System.out.printf("%s%.2f \n", "Area of circle c1 is: ", c1.getArea());
        System.out.printf("%s%.2f \n", "Circumference of circle c1 is: ", c1.getCircumference());
        System.out.printf("%s%.2f \n", "Area of circle c2 is: ", c2.getArea());
        System.out.printf("%s%.2f \n", "Circumference of circle c2 is: ", c2.getCircumference());
        System.out.printf("%s%.2f \n", "Distance between centers is: ", c1.distance(c2));
    }
}
