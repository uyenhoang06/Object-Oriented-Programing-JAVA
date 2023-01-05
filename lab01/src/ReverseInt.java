import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        System.out.print("Enter the positive integer: ");
        Scanner in = new Scanner(System.in);
        int inNumber = in.nextInt();
        int inDigit;
        int reverseNumber = 0;

        while (inNumber > 0) {
            inDigit = inNumber % 10;
            reverseNumber = reverseNumber * 10 + inDigit;
            inNumber /= 10;
        }

        System.out.println("The reverse is: " + reverseNumber);
        in.close();
    }
}
