public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(10, -5));
        System.out.println(gcd(20, 10));
        System.out.println(gcd(0, 10));
        System.out.println(gcd(10, 0));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
