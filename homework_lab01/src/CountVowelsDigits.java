import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String inStr = in.next();
        countVowelsDigits(inStr);

        in.close();
    }

    public static void countVowelsDigits(String inStr) {
        String inString = inStr.toLowerCase();
        int countVowels = 0;
        double percentagesVowels;
        int countDigits = 0;
        double percentagesDigits;

        for (int charIdx = 0; charIdx < inString.length(); charIdx++) {
            switch (inString.charAt(charIdx)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    countVowels++;
                    break;
            }
            if ('0' <= inString.charAt(charIdx) && inString.charAt(charIdx) <= '9') {
                countDigits++;
            }
        }

        percentagesDigits = (double) countDigits / inString.length();
        percentagesVowels = (double) countVowels / inString.length();

        System.out.printf("%s%d %s%.2f%%%s%n", "Number of vowels: ", countVowels, "(", percentagesVowels * 100, ")");
        System.out.printf("%s%d %s%.2f%%%s%n", "Number of digits: ", countDigits, "(", percentagesDigits * 100, ")");
    }
}
