public class FibonacciInt {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);
        printFibonacci();
    }

    public static void printFibonacci() {
        int first = 1;
        int second = 1;
        System.out.println("F(0) = " + first);
        System.out.println("F(1) = " + second);
        int i = 2;
        while (Integer.MAX_VALUE - second >= first) {
            int tmp = second;
            second += first;
            first = tmp;
            System.out.println("F(" + (i++) + ") = " + second);
        }
        System.out.println("F(" + i + ") is out of range of int");
    }
}
