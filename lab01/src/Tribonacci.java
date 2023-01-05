public class Tribonacci {
    public static void main(String[] args) {
        int n = 4;

        int fn;
        int fnMinus1 = 0;
        int fnMinus2 = 0;
        int fnMinus3 = 1;
        int nMax = 20;
        int sum = fnMinus1 + fnMinus2 + fnMinus3;
        double average;

        System.out.println("The first " + nMax + " Tribonacci numbers are: ");
        while (n <= nMax) {
            // n = 4, 5, 6, ...,nMax
            // Compute F(n), print it and add to sum
            fn = fnMinus1 + fnMinus2 + fnMinus3;
            System.out.print(fn + " ");
            sum += fn;

            // Increment the index n and shift the numbers for the next iteration
            ++n;
            fnMinus3 = fnMinus2;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
        }

        // Compute and display the average (= sum/nMax)
        average = (double) sum / nMax;
        System.out.println();
        System.out.println("The average is " + average);
    }
}
