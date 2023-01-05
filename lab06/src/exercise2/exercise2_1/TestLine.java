package exercise2.exercise2_1;

public class TestLine {
    public static void main(String[] args) {
        Line line1 = new Line(0, 0, 3, 4);
        System.out.println(line1);
        System.out.println(line1.getLength());
        System.out.println(line1.getGradient());
        System.out.println(line1.getBeginX());
        System.out.println(line1.getEndX());
        System.out.println(line1.getBeginY());
        System.out.println(line1.getEndY());
        System.out.println(line1.getBegin());
        System.out.println(line1.getEnd());

        Point point1 = new Point(2, 2);
        Point point2 = new Point(3, 3);
        Line line2 = new Line(point1, point2);
        System.out.println(line2);
        line2.setBeginXY(4, 4);
        line2.setEndXY(5, 5);
        System.out.println(line2);

        Point point3 = new Point(10, 10);
        Point point4 = new Point(5, 5);
        line2.setBegin(point3);
        line2.setEnd(point4);
        System.out.println(line2);
    }
}
