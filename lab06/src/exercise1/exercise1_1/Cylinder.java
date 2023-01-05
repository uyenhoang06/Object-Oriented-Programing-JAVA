package exercise1.exercise1_1;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.getHeight();
    }

    public double getArea() {
        return 2 * Math.PI * super.getRadius() * getHeight() + 2 * super.getArea();
    }

    public String toString() {
        String var10000 = super.toString();
        return "Cylinder: subclass of" + var10000 + " height=" + this.height;
    }
}
