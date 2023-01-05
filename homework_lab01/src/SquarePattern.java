import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = in.nextInt();

        // for loops
        System.out.println("use for loops:");
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= size; column++) {
                System.out.print("#");
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------");

        // while-do loops
        System.out.println("use while-do loops:");
        int row = 1;
        while (row <= size) {
            int column = 1;
            while (column <= size) {
                System.out.print("# ");
                column++;
            }
            row++;
            System.out.println();
        }
    }
}
