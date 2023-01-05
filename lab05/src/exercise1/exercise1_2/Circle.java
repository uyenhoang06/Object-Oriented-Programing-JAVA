package exercise1.exercise1_2;

public class Circle {
    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getCircumference() {
        return Math.PI * 2 * this.radius;
    }

    @Override
    public String toString() {
        return "Circle[" + "radius = " + radius + ']';
    }
}
