public class GreaterCommonDivisor {
    public static void main(String[] args) {
        System.out.println(gcd(-10,-5));
        System.out.println(gcd(10, 0));
        System.out.println(gcd(0, 10));
        System.out.println(gcd(100, 30));
    }

    public static int gcd(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
