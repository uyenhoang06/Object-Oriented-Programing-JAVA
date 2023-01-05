import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        if (n < 0) {
            System.out.println("Fibonacci (" + n + ") is not valid.");
        }
        System.out.println("Fibonacci (" + n + ") = " + fibonacci(n));
        in.close();
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
