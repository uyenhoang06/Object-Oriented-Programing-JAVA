public class SumOddEven {
    public static void main(String[] args) {
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }

        if (sumEven > sumOdd) {
            absDiff = sumEven - sumOdd;
        } else {
            absDiff = sumOdd - sumEven;
        }

        System.out.println("The sum of odd numbers is: " + sumOdd);
        System.out.println("The sum of even numbers is: " + sumEven);
        System.out.println("The absolute diffirence is: " + absDiff);
    }
}
