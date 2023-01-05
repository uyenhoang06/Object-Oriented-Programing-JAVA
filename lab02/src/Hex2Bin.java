import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"};
        System.out.print("Enter a Hexadecimal string: ");
        String inString = in.next();
        convertHex2Bin(inString, HEX_BITS);
        in.close();
    }

    public static void convertHex2Bin(String inString, final String[] HEX_BITS) {
        String hexInLower = inString.toLowerCase();
        System.out.print("The equivalent binary for hexadecimal ''" + inString + "'' is: ");
        for (int i = 0; i < hexInLower.length(); i++) {
            char c = hexInLower.charAt(i);
            if (c >= '0' && c <= '9') {
                System.out.print(HEX_BITS[c - '0'] + " ");
            } else {
                System.out.print(HEX_BITS[c - 'a' + 10] + " ");
            }
        }
    }
}
