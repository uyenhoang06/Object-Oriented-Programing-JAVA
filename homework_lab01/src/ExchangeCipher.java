import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inString = in.next();

        printCipherText(inString);
        in.close();
    }

    public static void printCipherText(String str) {
        String cipherText = "";
        String inString = str.toUpperCase();
        for (int charIdx = 0; charIdx < inString.length(); charIdx++) {
            cipherText += (char) ('A' + 'Z' - inString.charAt(charIdx));
        }
        System.out.println("The cipher text string is: " + cipherText);
    }
}
