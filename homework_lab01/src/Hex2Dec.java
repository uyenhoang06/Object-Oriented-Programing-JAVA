import java.util.Scanner;

public class Hex2Dec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String hex = sc.nextLine();

        hex2Dex(hex);
        sc.close();
    }

    public static boolean isHexString(String hex) {
        String hex2 = hex.toUpperCase();
        for (int i = 0; i < hex.length(); i++) {
            char c = hex2.charAt(i);
            if ((c < '0' || c > '9') && (c < 'A' || c > 'F')) {
                return false;
            }
        }
        return true;
    }

    public static void hex2Dex(String hex) {
        if (isHexString(hex)) {
            String digits = "0123456789ABCDEF";
            hex = hex.toUpperCase();
            int val = 0;
            for (int i = 0; i < hex.length(); i++) {
                char c = hex.charAt(i);
                if ((c < '0' || c > '9') && (c < 'A' || c > 'F')) {
                    System.out.println("error: invalid hexadecimal string '" + hex.toLowerCase() + "'");
                    return;
                }
                int d = digits.indexOf(c);
                val = 16 * val + d;
            }
            System.out.println("The equivalent decimal number for hexadecimal '" + hex + "' is: " + val);
        } else {
            System.out.println("Can't convert because the string is not a Hex String.");
        }
    }
}
