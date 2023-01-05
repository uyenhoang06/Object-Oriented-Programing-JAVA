import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = in.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = in.nextInt();
        System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
    }

    public static int exponent(int base, int exp) {
        int res = base;
        while (--exp > 0) {
            res *= base;
        }
        return res;
    }
}
