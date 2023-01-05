import java.util.Scanner;

public class HillPatternX {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int numOfRow = input.nextInt();
        HillPatternA(numOfRow);
        HillPatternB(numOfRow);
        HillPatternC(numOfRow);
        HillPatternD(numOfRow);
    }

    static void HillPatternA(int numOfRow) {
        int numOfCol = 1 + 2 * (numOfRow - 1);
        for (int row = 1; row <= numOfRow; row++) {
            for (int col = 1; col <= numOfCol; col++) {
                if ((row + col >= numOfRow + 1) && (row >= col - numOfRow + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.printf("%10s\n", "(a)");
    }

    static void HillPatternB(int numOfRow) {
        int numOfCol = 1 + 2 * (numOfRow - 1);
        for (int row = 1; row <= numOfRow; row++) {
            for (int col = 1; col <= numOfCol; col++) {
                if ((col <= row - 1) || (col > numOfCol + 1 - row)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.printf("%10s\n", "(b)");
    }

    static void HillPatternC(int numOfRow) {
        int numOfCol = 1 + 2 * (numOfRow - 1);
        //upper part
        for (int row = 1; row <= numOfRow; row++) {
            for (int col = 1; col <= numOfCol; col++) {
                if ((row + col >= numOfRow + 1) && (row >= col - numOfRow + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //lower part
        for (int row = 2; row <= numOfRow; row++) {
            for (int col = 1; col <= numOfCol; col++) {
                if ((col <= row - 1) || (col > numOfCol + 1 - row)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.printf("%10s\n", "(c)");
    }

    static void HillPatternD(int numOfRow) {
        int numOfCol = 1 + 2 * (numOfRow - 1);

        for (int i = 1; i <= numOfCol; i++) {
            System.out.print("# ");
        }
        System.out.println();
        //upper part
        for (int row = 1; row < numOfRow; row++) {
            for (int col = 1; col <= numOfCol; col++) {
                if ((row + col >= numOfRow + 1) && (row >= col - numOfRow + 1)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            while (row != numOfRow) {  //khong xuong dong o luot chay cuoi
                System.out.println();
                break;
            }
        }
        //lower part
        for (int row = 3; row <= numOfRow; row++) {
            for (int col = 1; col <= numOfCol; col++) {
                if ((col <= row - 1) || (col > numOfCol + 1 - row)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= numOfCol; i++) {
            System.out.print("# ");
        }
        System.out.printf("\n%10s\n", "(d)");
    }

}

