public class FactorialLong {
    public static void main(String[] args) {
        printLongFactorials();
    }
    public static void printLongFactorials() {
        long i = 1;
        long factorial = 1;
        while (true) {
            System.out.printf("The factorial of %1$d is is %2$d.\n", i, factorial);
            if (Long.MAX_VALUE / factorial < (i + 1)) {
                System.out.printf("The factorial of %d is out of range.\n", (i + 1));
                break;
            }
            i++;
            factorial *= i;
        }
    }
}
