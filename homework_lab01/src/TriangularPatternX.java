import java.util.Scanner;

public class TriangularPatternX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = in.nextInt();
        TriangularPatternA(size);
        TriangularPatternB(size);
        TriangularPatternC(size);
        TriangularPatternD(size);
    }

    public static void TriangularPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.printf("%8s\n", "(a)");
    }

    public static void TriangularPatternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= (size - row + 1); col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.printf("%8s\n", "(b)");
    }

    public static void TriangularPatternC(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row <= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.printf("%8s\n", "(c)");
    }

    public static void TriangularPatternD(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col > (size - row)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.printf("%8s\n", "(d)");
    }
}


