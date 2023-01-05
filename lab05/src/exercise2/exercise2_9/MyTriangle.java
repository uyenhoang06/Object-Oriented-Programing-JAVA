package exercise2.exercise2_9;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[" + "v1 = " + v1 + ", v2 = " + v2 + ", v3 = " + v3 + ']';
    }

    public double getPerimeter() {
        double edge12 = v1.distance(v2);
        double edge23 = v2.distance(v3);
        double edge31 = v3.distance(v1);
        return edge12 + edge23 + edge31;
    }

    public String getType() {
        double edge12 = v1.distance(v2);
        double edge23 = v2.distance(v3);
        double edge31 = v3.distance(v1);
        if (edge12 > 0 && edge23 > 0 && edge31 > 0 && (edge12 + edge23 > edge31) && (edge31 + edge23 > edge12) && (edge31 + edge12 > edge23)) {
            if (edge12 == edge23 && edge23 == edge31) {
                return "equilateral";
            } else if (edge12 == edge23 || edge23 == edge31 || edge31 == edge12) {
                return "isosceles";
            } else {
                return "scalene";
            }
        }
        return "Not a triangle";
    }
}
