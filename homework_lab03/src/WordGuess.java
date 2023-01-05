import java.util.Scanner;

public class WordGuess {
    public static void main(String[] args) {
        String guessWord = args[0];
        guessWord.toLowerCase();
        Scanner in = new Scanner(System.in);
        guessWord(guessWord, in);
        in.close();
    }
    public static void guessWord(String inString, Scanner in) {
        boolean correct = true;
        int count = 0;
        int length = inString.length();
        boolean[] array = new boolean[length];
        for (int idx = 0; idx < length; idx++) {
            array[idx] = false;
        }
        while (correct) {
            System.out.print("Key in one character or your guess word: ");
            String c = in.next();
            c = c.toLowerCase();
            count++;
            if (c.equals(inString)) {
                System.out.println("Congratulation!");
                System.out.println("You got in " + count + " trials.");
                correct = false;
            } else if (c.length() == 1) {
                char ch = c.charAt(0);
                for (int idx = 0; idx < length; idx++) {
                    if (ch == inString.charAt(idx)) {
                        array[idx] = true;
                    }
                }
                System.out.print("Trial " + count + ": ");
                for (int j = 0; j < length; j++) {
                    if (array[j]) {
                        System.out.print(inString.charAt(j));
                    } else {
                        System.out.print("_");
                    }
                }
                System.out.println();
            }
        }
    }
}
