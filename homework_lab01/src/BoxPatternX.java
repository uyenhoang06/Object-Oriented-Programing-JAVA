import java.util.Scanner;

public class BoxPatternX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = in.nextInt();
        BoxPatternA(size);
        BoxPatternB(size);
        BoxPatternC(size);
        BoxPatternD(size);
    }

    public static void BoxPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == 1 || col == size) {
                    System.out.printf("%3.5s", "# ");
                } else {
                    System.out.printf("%3.5s", "  ");
                }
            }
            System.out.println();
        }
        System.out.printf("%14s\n", "(a)");
    }

    public static void BoxPatternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row == col) {
                    System.out.printf("%3.5s", "# ");
                } else {
                    System.out.printf("%3.5s", "  ");
                }
            }
            System.out.println();
        }
        System.out.printf("%14s\n", "(b)");
    }

    public static void BoxPatternC(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row == (size - col + 1)) {
                    System.out.printf("%3.5s", "# ");
                } else {
                    System.out.printf("%3.5s", "  ");
                }
            }
            System.out.println();
        }
        System.out.printf("%14s\n", "(c)");
    }

    public static void BoxPatternD(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row == col || row == (size - col + 1)) {
                    System.out.printf("%3.5s", "# ");
                } else {
                    System.out.printf("%3.5s", "  ");
                }
            }
            System.out.println();
        }
        System.out.printf("%14s\n", "(d)");
    }
}

