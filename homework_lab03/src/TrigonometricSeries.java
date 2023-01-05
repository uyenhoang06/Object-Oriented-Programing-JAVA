import java.util.Scanner;

public class TrigonometricSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //0
        System.out.println("x = 0");
        System.out.println(sin(0, 5));
        System.out.println(Math.sin(0));
        System.out.println(cos(0, 5));
        System.out.println(Math.cos(0));

        // PI / 6
        System.out.println("x = PI / 6");
        System.out.println(sin(Math.PI / 6, 8));
        System.out.println(Math.sin(Math.PI / 6));
        System.out.println(cos(Math.PI / 6, 8));
        System.out.println(Math.cos(Math.PI / 6));

        // PI / 4
        System.out.println("x = PI / 4");
        System.out.println(sin(Math.PI / 4, 6));
        System.out.println(Math.sin(Math.PI / 4));
        System.out.println(cos(Math.PI / 4, 6));
        System.out.println(Math.cos(Math.PI / 4));

        // PI / 3
        System.out.println("x = PI / 3");
        System.out.println(sin(Math.PI / 3, 10));
        System.out.println(Math.sin(Math.PI / 3));
        System.out.println(cos(Math.PI / 3, 10));
        System.out.println(Math.cos(Math.PI / 3));

        // PI / 2
        System.out.println("x = PI / 2");
        System.out.println(sin(Math.PI / 2, 4));
        System.out.println(Math.sin(Math.PI / 2));
        System.out.println(cos(Math.PI / 2, 4));
        System.out.println(Math.cos(Math.PI / 2));

        in.close();
    }

    // sinx  = (-1)^n / (2n+1)! * x^(2n+1)
    public static double sin(double x, int numTerms) {
        double sin = x;
        double term = x;
        for (int i = 1; i <= numTerms; i++) {
            term = -term / (2 * i) / (2 * i + 1) * x * x;
            sin += term;
        }
        return sin;
    }

    //cosx = (-1) ^ n / (2n)! * x^(2n)
    public static double cos(double x, int numTerms) {
        double cos = 1;
        double term = 1;
        for (int i = 1; i <= numTerms; i++) {
            term = -term / (2 * i) / (2 * i - 1) * x * x;
            cos += term;
        }
        return cos;
    }
}
