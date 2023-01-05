public class Fibonacci {
    public static void main(String[] args) {
        int n = 3;

        int fn;             // F(n) to be computed
        int fnMinus1 = 1;   // F(n-1), init to F(2)
        int fnMinus2 = 1;   // F(n-2), init to F(1)
        int nMax = 20;
        int sum = fnMinus1 + fnMinus2;
        double average;

        System.out.println("The first " + nMax + " Fibinanci numbers are: ");
        while (n <= nMax) {
            // n = 3, 4, 5, ...,nMax
            // Compute F(n), print it and add to sum
            fn = fnMinus1 + fnMinus2;
            System.out.print(fn + " ");
            sum += fn;

            // Increment the index n and shift the numbers for the next iteration
            ++n;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
        }

        // Compute and display the average (= sum/nMax)
        average = (double) sum / nMax;
        System.out.println();
        System.out.println("The average is " + average);
    }
}
