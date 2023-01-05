import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperNum = in.nextInt();

        printPrimeFactor(upperNum);
        in.close();
    }

    public static boolean isProductOfPrimeFactorList(int aPosInt) {
        if (aPosInt == 1) {
            return false;
        }
        int product = 1;
        for (int i = 2; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0 && isPrime(i)) {
                product *= i;
            }
        }
        return product == aPosInt;
    }

    public static void printPrimeFactor(int n) {
        System.out.println("These numbers are equal to the product of prime factor:");
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isProductOfPrimeFactorList(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.printf("%s%d %s%.2f%%%s", "[", count, "primes found (", 100.0 * count / n, ")]");
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
