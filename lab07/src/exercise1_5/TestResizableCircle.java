package exercise1_5;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle resizableCircle = new ResizableCircle(10);
        System.out.println(resizableCircle);
        resizableCircle.resize(50);
        System.out.println(resizableCircle);
        System.out.println(resizableCircle.getArea());
        System.out.println(resizableCircle.getPerimeter());

        Resizable resizableCircle1 = new ResizableCircle(1);
        System.out.println(resizableCircle1);
        resizableCircle1.resize(200);
        System.out.println(resizableCircle1);
    }
}
