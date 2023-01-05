import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        //System.out.println(SECRET_NUMBER);
        Scanner in = new Scanner(System.in);
        int key;
        int count = 0;
        boolean correct = true;
        System.out.println("Key in your guess: ");
        while (correct) {
            key = in.nextInt();
            count++;
            if (key == SECRET_NUMBER) {
                correct = false;
                System.out.println("You got it in " + count + " trials!");
            } else if (key > SECRET_NUMBER) {
                System.out.println("Try lower.");
            } else {
                System.out.println("Try higher.");
            }
        }
        in.close();
    }
}
