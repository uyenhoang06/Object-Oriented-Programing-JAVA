public class LengthOfARunningNumberSequence {
    public static void main(String[] args) {
        System.out.println(numOfDigit(99));
        System.out.println(numOfDigit(100));
        System.out.println(len(10));
        System.out.println(len(4));
    }

    public static int len(int n) {
        if (n == 1) {
            return 1;
        }
        return len(n - 1) + numOfDigit(n);
    }

    public static int numOfDigit(int n) {
        if (n == 0) {
            return 1;
        }
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}
