package exercise2.exercise2_1;

public class TestLineSub {
    public static void main(String[] args) {
        Point begin = new Point(1, 1);
        Point end = new Point(2, 2);
        LineSub lineSub1 = new LineSub(begin, end);
        System.out.println(lineSub1);
        System.out.println(lineSub1.getX());
        System.out.println(lineSub1.getY());
        System.out.println(lineSub1.getBeginX());
        System.out.println(lineSub1.getBeginY());
        System.out.println(lineSub1.getEndX());
        System.out.println(lineSub1.getEndY());
        System.out.println(lineSub1.getLength());

        LineSub lineSub2 = new LineSub(10, 10, 5, 5);
        System.out.println(lineSub2);
        System.out.println(lineSub2.getGradient());
        System.out.println(lineSub2.getBegin());
        System.out.println(lineSub2.getEnd());

        lineSub2.setBeginXY(100, 100);
        lineSub2.setEndXY(99, 99);
        System.out.println(lineSub2);
    }
}
