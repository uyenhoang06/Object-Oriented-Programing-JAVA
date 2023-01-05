import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int numb_items = in.nextInt();

        System.out.print("Enter the value of all items (separated by space): ");
        int[] items = readArray(numb_items, in);

        printArray(items);
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

    public static void printArray(int[] array) {
        System.out.print("The value are: ");
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            System.out.print(array[i]);
            if (i == array.length - 1) {
                System.out.print("]");
            } else {
                System.out.print(", ");
            }
        }
    }
}
