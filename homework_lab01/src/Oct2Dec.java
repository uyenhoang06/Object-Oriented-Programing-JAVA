import java.util.Scanner;

public class Oct2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Octal string: ");
        String octal = sc.nextLine();
        int result = oct2Dec(octal);
        if (result != -1) {
            System.out.printf("The equivalent decimal number \u0027%s\u0027 is: %d", octal, result);
        } else {
            System.out.printf("String \u0027%s\u0027 is not a Octal string", octal);
        }
        sc.close();
    }

    public static boolean isOct(String octal) {
        for (int i = 0; i < octal.length(); i++) {
            char c = octal.charAt(i);
            if (c < '0' || c > '7') {
                return false;
            }
        }
        return true;
    }

    public static int oct2Dec(String octal) {
        if (isOct(octal)) {
            char temp;
            int result = 0;
            for (int power = 0; power < octal.length(); power++) {
                temp = octal.charAt(octal.length() - 1 - power);
                int tempInt = temp - '0';
                result += tempInt * Math.pow(8, power);
            }
            return result;
        }
        return -1;
    }
}