import java.util.Scanner;

public class PrimeList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the upper bound: ");
        int n = in.nextInt();
        printPercentageOfPrimeList(n);
        in.close();
    }

    public static boolean isPrime(int posInt) {
        if (posInt < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(posInt); i++) {
            if (posInt % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPercentageOfPrimeList(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.printf("%s%d %s%.2f%%%s", "[", count, "primes found (", 100.0 * count / n, ")]");
    }
}
