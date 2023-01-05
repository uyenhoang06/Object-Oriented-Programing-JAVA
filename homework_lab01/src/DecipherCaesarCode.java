import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a ciphertext string: ");
        String inStr = in.next();
        printTheDecipher(inStr);

        in.close();
    }

    public static void printTheDecipher(String str) {
        String inStr = str.toUpperCase();
        String plainText = "";
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            if ('D' <= inStr.charAt(charIdx) && charIdx <= 'Z') {
                plainText += (char) (inStr.charAt(charIdx) - 3);
            } else if (inStr.charAt(charIdx) == 'A') {
                plainText += 'X';
            } else if (inStr.charAt(charIdx) == 'B') {
                plainText += 'Y';
            } else if (inStr.charAt(charIdx) == 'C') {
                plainText += 'Z';
            }
        }
        System.out.println("The plaintext string is: " + plainText);
    }

}
