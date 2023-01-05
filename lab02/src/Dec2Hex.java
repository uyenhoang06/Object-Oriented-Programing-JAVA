import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int dec = in.nextInt();
        in.close();
        System.out.print("The equivalent hexadecimal number is: " + dec2Hex(dec));
    }

    public static String dec2Hex(int dec) {
        String s = "";
        while (dec > 0) {
            int tmp = dec % 16;
            if (tmp < 10) {
                s = tmp + s;
            } else {
                s = (char) (tmp + 55) + s;
            }
            dec /= 16;
        }
        return s;
    }
}
