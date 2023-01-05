import java.util.Scanner;

public class CheckerPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = in.nextInt();

        for(int row = 1; row <= size; row++) {
            for (int column = 1; column <= size; column++) {
                if (row % 2 == 0) {
                    System.out.print(" #");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}
