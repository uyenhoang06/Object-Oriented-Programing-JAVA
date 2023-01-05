import java.util.Scanner;

public class Bin2Dec {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        String binary = in.nextLine();
        if (!isBinary(binary)) {
            System.out.printf("error: invalid binary string \u0027%d\u0027", binary);
        } else {
            System.out.printf("The equivalent decimal number for binary \u0027%s\u0027 is: %d", binary, bin2Dec(binary));
        }
        in.close();
    }

    public static boolean isBinary(String binary) {
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                continue;
            }
            if (binary.charAt(i) == '1') {
                continue;
            }
            return false;
        }
        return true;
    }

    public static int bin2Dec(String binary) {
        int number = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                continue;
            }
            number += Math.pow(2, (binary.length() - 1 - i));
        }
        return number;
    }
}