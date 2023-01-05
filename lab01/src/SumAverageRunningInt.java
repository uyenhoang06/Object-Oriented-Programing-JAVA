public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
            count++;
            sum += number;
        }

        average = (double) sum / count;
        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
        System.out.println("The average is: " + average);
    }
}
