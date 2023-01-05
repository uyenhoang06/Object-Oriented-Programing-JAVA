import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        int numberIn;
        boolean isValid = false;

        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter a number between 0-10 or 90-100: ");
            numberIn = in.nextInt();

            if ((numberIn <= 10 && numberIn >= 0) || (numberIn <= 100 && numberIn >= 90)) {
                isValid = true;
                System.out.println("You have entered: " + numberIn);
            } else {
                System.out.println("Invalid input, try again...");
            }
        } while (!isValid);

        in.close();
    }
}
