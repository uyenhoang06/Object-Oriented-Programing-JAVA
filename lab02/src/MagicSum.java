import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SENTINEL = -1;
        System.out.print("Enter a positive integer (-1 to end): ");
        int number = in.nextInt();
        int sum = 0;
        while (number != SENTINEL) {
            if (hasEight(number)) {
                sum += number;
            }
            System.out.print("Enter a positive integer (-1 to end): ");
            number = in.nextInt();
        }
        System.out.print("The magic sum is: " + sum);

        in.close();

    }

    public static boolean hasEight(int number) {
        String num = String.valueOf(number);
        for (int charIdx = 0; charIdx < num.length(); charIdx++) {
            if (num.charAt(charIdx) == '8') {
                return true;
            }
        }
        return false;
    }
}
