package exercise1_1;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double size) {
        super(size, size);
    }

    public Square(double size, String color, boolean filled) {
        super(size, size, color, filled);
    }

    public double getSize() {
        return width;
    }

    public void setSize(double size) {
        width = size;
        length = size;
    }

    @Override
    public void setLength(double size) {
        setLength(size);
    }

    @Override
    public void setWidth(double size) {
        setWidth(size);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
