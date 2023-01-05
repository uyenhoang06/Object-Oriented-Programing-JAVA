package exercise2.exercise2_2;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double radius) {
        base = new Circle(radius);
    }

    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        base = new Circle(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return base.getArea() * this.getHeight();
    }

    public double getArea() {
        return 2 * Math.PI * base.getRadius() * getHeight() + 2 * base.getArea();
    }

    public String toString() {
        return "Cylinder[" + base.toString() + ", height=" + this.height + "]";
    }
}
