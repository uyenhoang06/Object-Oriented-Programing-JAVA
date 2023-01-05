import java.util.Scanner;

public class TestPalindromicWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string(word/phrase): ");
        String inStr = in.nextLine();
        testPalindrome(inStr);
    }

    public static void testPalindrome(String str) {
        String inStr = str.toLowerCase().replaceAll(" ","");
        String reverseStr = "";
        for(int charIdx = inStr.length() - 1 ; charIdx >= 0; charIdx--) {
            if('a' <= inStr.charAt(charIdx) && inStr.charAt(charIdx) <= 'z') {
                reverseStr += inStr.charAt(charIdx);
            }
        }

        if (!str.equals(reverseStr)) {
            System.out.println(str + " is not a palindrome word");
        } else {
            System.out.println(str + " is a palindrome word");
        }
    }

}
