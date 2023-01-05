import java.util.Scanner;

public class RadixN2Dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radix = Integer.parseInt(in.nextLine());
        System.out.print("Enter the string: ");
        String s = in.nextLine();

        if (radix <= 16) {
            String result = toDec(s, radix);
            System.out.printf("The equivalent decimal number %s is: %s", s, result);
        }

        in.close();
    }

    public static String toDec(String in, int inRadix) {
        in = in.toUpperCase();
        int res = 0;
        for (int i = 0; i < in.length(); i++) {
            char c = in.charAt(i);
            if (c >= '0' && c <= '9') {
                int d = c - '0';
                res = res * inRadix + d;
            } else if (c >= 'A' && c <= 'F') {
                int d = c - 'A' + 10;
                res = res * inRadix + d;
            }
        }
        return res + "";
    }
}