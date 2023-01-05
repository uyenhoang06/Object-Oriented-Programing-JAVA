import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int numb_items = in.nextInt();

        System.out.print("Enter the value of all items (separated by space): ");
        int[] items = readArray(numb_items, in);

        printArrayInStars(items);

        in.close();
    }

    public static int[] readArray(int num_items, Scanner in) {
        if (num_items > 0) {
            int[] items = new int[num_items];
            for (int idx = 0; idx < items.length; idx++) {
                items[idx] = in.nextInt();
            }
            return items;
        }
        return null;
    }

    public static void printArrayInStars(int[] items) {
        for (int idx = 0; idx < items.length; idx++) {
            System.out.print(idx + ": ");
            for (int starNo = 1; starNo <= items[idx]; starNo++) {
                System.out.print("*");
            }
            System.out.println("(" + items[idx] + ")");
        }
    }

}
