public class Factorial {
    public static void main(String[] args) {
        System.out.println("Recursive: ");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Factorial (" + i + ") = " + i + " * " + factorial(i - 1) + " = " + factorial(i));
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
