package exercise1.exercise1_3;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        //Point2D
        Point2D point2D1 = new Point2D(); // test constructors
        point2D1.setX(1); // test setter
        point2D1.setY(2);
        System.out.println("Point2D1 x: " + point2D1.getX()); // test getter
        System.out.println("Point2D1 y: " + point2D1.getY());
        System.out.println(point2D1); // test toString()

        Point2D point2D2 = new Point2D(10, 10); // test constructor
        point2D2.setXY(5f, 5.5f); // test setter: setXY
        System.out.println("Point2D2: " + Arrays.toString(point2D2.getXY())); // test getter: getXY
        System.out.println(point2D2); // test toString()


        //Point3D
        Point3D point3D1 = new Point3D(); // test constructors
        point3D1.setXY(4f, 10.1f); // test setter
        point3D1.setZ(5.5f);
        System.out.println("Point3D1 x: " + point3D1.getX()); // test getters
        System.out.println("Point3D1 y: " + point3D1.getY());
        System.out.println("Point3D1 z: " + point3D1.getZ());
        System.out.println("Point3D1: " + Arrays.toString(point3D1.getXYZ()));

        Point3D point3D2 = new Point3D(1.1f, 2.2f, 3.3f); // test constructors
        point3D2.setXYZ(4.4f, 4.4f, 4.4f); // test setter
        System.out.println("Point3D2 xy: " + Arrays.toString(point3D2.getXY()));
        System.out.println(point3D2); // test toString()
    }
}
