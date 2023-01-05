import java.util.Scanner;

public class CaesarCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inStr = in.next();
        printTheCipherText(inStr);

        in.close();
    }

    public static void printTheCipherText(String str) {
        String inStr = str.toUpperCase();
        String cipherText = "";
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            if ('A' <= inStr.charAt(charIdx) && charIdx <= 'W') {
                cipherText += (char) (inStr.charAt(charIdx) + 3);
            } else if (inStr.charAt(charIdx) >= 'X' && inStr.charAt(charIdx) <= 'Z') {
                cipherText += Character.toString((char) (inStr.charAt(charIdx) - 23));
            }
        }
        System.out.println("The ciphertext string is: " + cipherText);
    }
}
