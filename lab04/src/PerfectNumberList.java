import java.util.Scanner;

public class PerfectNumberList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperNum = in.nextInt();

        printPerfectList(upperNum);
        printNumbersList(upperNum);

        in.close();
    }

    public static boolean isPerfect(int n) {
        int sumDigits = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumDigits += i;
            }
        }
        return sumDigits == n;
    }

    public static boolean isDeficient(int n) {
        int sumDigits = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumDigits += i;
            }
        }
        return sumDigits < n;
    }

    public static void printPerfectList(int n) {
        System.out.println("These numbers are perfect:");
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPerfect(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.printf("%s%d %s%.2f%%%s\n\n", "[", count, "perfect numbers found (", 100.0 * count / n, ")]");
    }

    public static void printNumbersList(int n) {
        System.out.println("These numbers are neither deficient not perfect:");
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!isDeficient(i) && !isPerfect(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.printf("%s%d %s%.2f%%%s", "[", count, "numbers found (", 100.0 * count / n, ")]");
    }

}
