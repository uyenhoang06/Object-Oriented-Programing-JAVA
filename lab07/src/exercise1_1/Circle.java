package exercise1_1;

public class Circle extends Shape {
    protected double radius = 1.0;

    public Circle(double v) {
        super();
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + getRadius() + ']';
    }
}
