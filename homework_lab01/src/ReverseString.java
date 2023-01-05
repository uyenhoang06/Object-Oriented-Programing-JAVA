import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String inStr = in.next();
        reverseString(inStr);

        in.close();
    }

    public static void reverseString(String inStr) {
        int inStrLen = inStr.length();
        String revStr = "";

        for (int chaIdx = inStrLen - 1; chaIdx >= 0; chaIdx--) {
            revStr += inStr.charAt(chaIdx);
        }
        System.out.print("The reverse of the String " + inStr + " is " + revStr);
    }
}
