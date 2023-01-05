public class ComputePI {
    public static void main(String[] args) {

        // use MAX_DENOMINATOR
        double sum = 0.0;
        int MAX_DENOMINATOR = 1000;

        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
            if (denominator % 4 == 1) {
                sum += (double) 1 / denominator;
            } else if (denominator % 4 == 3) {
                sum -= (double) 4 / denominator;
            } else {
                System.out.println("Impossible!!!");
            }
        }
        System.out.println("PI by MAX_DENOMINATOR is: " + 4 * sum);


        //use MAX_TERM
        int MAX_TERM = 10000;
        double sum1 = 0.0;
        for (int term = 1; term <= MAX_TERM; term++) {
            if (term % 2 == 1) {
                sum1 += 1.0 / (term * 2 - 1);
            } else {
                sum1 -= 1.0 / (term * 2 - 1);
            }
        }
        System.out.println("PI by MAX_TERM is: " + 4 * sum1);
    }
}
