public class TribonacciInt {
    public static void main(String[] args) {
        //khong dung de quy:
        findAndPrintTribonacci();

        //de quy
        printTribonacci();
    }

    public static void findAndPrintTribonacci() {
        int fn;             // F(n) to be computed
        int fnMinus1 = 1;   // F(n-1), init to F(2)
        int fnMinus2 = 0;   // F(n-2), init to F(1)
        int fnMinus3 = 0;
        int n = 3;
        System.out.println("F(" + 0 + ") is " + fnMinus3);
        System.out.println("F(" + 1 + ") is " + fnMinus2);
        System.out.println("F(" + 2 + ") is " + fnMinus1);

        while (true) {
            // n = 4, 5, 6, ...,nMax
            // Compute F(n), print it
            fn = fnMinus1 + fnMinus2 + fnMinus3;
            if (Integer.MAX_VALUE - fnMinus1 - fnMinus2 < fnMinus3) {
                System.out.println("F(" + n + ") is out of the range of int.");
                break;
            } else {
                System.out.println("F(" + n + ") is " + fn);
            }
            // Increment the index n and shift the numbers for the next iteration
            n++;
            fnMinus3 = fnMinus2;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
        }
    }

    public static int tribonacci(int n) {
        if (n < 2) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        }
    }

    public static void printTribonacci() {
        System.out.println("F(" + 0 + ") is " + tribonacci(0));
        System.out.println("F(" + 1 + ") is " + tribonacci(1));
        System.out.println("F(" + 2 + ") is " + tribonacci(2));
        int n = 3;
        while (true) {
            if (Integer.MAX_VALUE - tribonacci(n - 1) - tribonacci(n - 2) < tribonacci(n - 3)) {
                System.out.println("F(" + n + ") is out of the range of int.");
                break;
            } else {
                System.out.println("F(" + n + ") is " + tribonacci(n));
            }
            n++;
        }
    }
}
