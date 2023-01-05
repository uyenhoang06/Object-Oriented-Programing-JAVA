import java.util.Scanner;

public class TestPalindromicPhrase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string(word/phrase): ");
        String phrase = in.nextLine();
        testPalindrome(phrase);

        in.close();
    }

    public static void testPalindrome(String phrase) {
        String phraseLeftToRight = sanitizeString(phrase);
        String phraseRightToLeft = "";
        for (int i = phraseLeftToRight.length() - 1; i >= 0; i--) {
            phraseRightToLeft += phraseLeftToRight.charAt(i);
        }

        if (phraseLeftToRight.toLowerCase().equals(phraseRightToLeft.toLowerCase())) {
            System.out.printf("\"%1$s\" is a palindrome.\n", phrase);
        } else {
            System.out.printf("\"%1$s\" is not a palindrome.\n", phrase);
        }
    }

    public static String sanitizeString(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '.':
                case ',':
                case ' ':
                case '-':
                case '\'':
                case '!':
                case '?':
                    break;
                default:
                    str += s.charAt(i);
                    break;
            }
        }
        return str;
    }
}
