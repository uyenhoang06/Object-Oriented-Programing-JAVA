package exercise2.exercise2_7;

public class TestMyLine {
    public static void main(String[] args) {
        //first constructor way
        MyLine line1 = new MyLine(1, 2, 3, 4);
        System.out.println(line1); // test toString()

        //second constructor way
        MyPoint begin = new MyPoint(2, 2);
        MyPoint end = new MyPoint(2, 3);
        MyLine line = new MyLine(begin, end);
        System.out.println(line); // test toString()

        // test setters
        line1.setBegin(begin);
        line1.setEnd(end);
        line.setEndY(10);
        line.setEndX(20);
        line.setBeginX(1);
        line.setBeginY(2);

        // test getters
        System.out.println("line's begin: " + line.getBegin());
        System.out.println("line's end: " + line.getEnd());

        System.out.println("line's begin X: " + line.getBeginX());
        System.out.println("line's begin Y: " + line.getBeginY());
        System.out.println("line's begin XY: " + line.getBeginXY());

        line.setBeginXY(0, 0);
        line.setEndXY(1, 1);

        System.out.println("line's end X: " + line.getEndX());
        System.out.println("line's end Y: " + line.getEndY());
        System.out.println("line's end XY: " + line.getEndXY());

        // Test getLength() and getGradient()
        System.out.println("Line 1 length: " + line1.getLength());
        System.out.println("Line 1 gradient: " + line1.getGradient());

        System.out.println("Line 2 length: " + line.getLength());
        System.out.println("Line 2 gradient: " + line.getGradient());
    }
}
