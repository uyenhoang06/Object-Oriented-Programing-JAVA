public class HarmonicSum {
    public static void main(String[] args) {
        //Define variables
        final int MAX_DENOMINATOR = 50000;
        double sumL2R = 0.0; //sum from left - to - right
        double sumR2L = 0.0; //sum from right - to left
        double absDiff;      //absolute difference between the two sum

        // for - loop summing from left - to - right
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator++) {
            sumL2R += (double) 1 / denominator;
        }
        System.out.println("The sum from left-to-right is: " + sumL2R);

        // for - loop for swimming from right-to-left
        for (int denominator = 50000; denominator >= 1; denominator--) {
            sumR2L += (double) 1 / denominator;
        }
        System.out.println("The sum form right-to-left is: " + sumR2L);

        // find the absolute difference and display
        if (sumL2R > sumR2L) {
            absDiff = sumL2R - sumR2L;
        } else {
            absDiff = sumR2L - sumL2R;
        }
        System.out.println("The absolute diffirence between the two sums is: " + absDiff);
    }
}
