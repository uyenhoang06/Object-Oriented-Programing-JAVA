import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = in.next();
        printPhoneKeyPadNestedIf(inStr);
        System.out.println();
        System.out.println("__________________________________________________________");
        printPhoneKeyPadSwitchCase(inStr);

        in.close();
    }

    //use Nested - if
    public static void printPhoneKeyPadNestedIf(String str) {
        String inStr = str.toLowerCase();
        System.out.println("Use Nested - if");
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            char checkChar = inStr.toLowerCase().charAt(charIdx);
            if (checkChar == 'a' || checkChar == 'b' || checkChar == 'c') {
                System.out.print("(2)");
            }
            if (checkChar == 'd' || checkChar == 'e' || checkChar == 'f') {
                System.out.print("(3)");
            }
            if (checkChar == 'g' || checkChar == 'h' || checkChar == 'i') {
                System.out.print("(4)");
            }
            if (checkChar == 'j' || checkChar == 'k' || checkChar == 'l') {
                System.out.print("(5)");
            }
            if (checkChar == 'm' || checkChar == 'n' || checkChar == 'o') {
                System.out.print("(6)");
            }
            if (checkChar == 'p' || checkChar == 'q' || checkChar == 'r' || checkChar == 's') {
                System.out.print("(7)");
            }
            if (checkChar == 't' || checkChar == 'u' || checkChar == 'v') {
                System.out.print("(8)");
            }
            if (checkChar == 'w' || checkChar == 'x' || checkChar == 'y' || checkChar == 'z') {
                System.out.print("(9)");
            }
        }
    }

    //use Switch case
    public static void printPhoneKeyPadSwitchCase(String str) {
        String inStr = str.toLowerCase();
        System.out.println("Use Switch - case");
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            switch (inStr.charAt(charIdx)) {
                case 'a':
                case 'b':
                case 'c':
                    System.out.print("(2)");
                    break;
                case 'd':
                case 'e':
                case 'f':
                    System.out.print("(3)");
                    break;
                case 'g':
                case 'h':
                case 'i':
                    System.out.print("(4)");
                    break;
                case 'j':
                case 'k':
                case 'l':
                    System.out.print("(5)");
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    System.out.print("(6)");
                    break;
                case 't':
                case 'u':
                case 'v':
                    System.out.print("(7)");
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    System.out.print("(8)");
                    break;
            }
        }
    }
}
