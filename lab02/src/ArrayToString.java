import java.util.Scanner;

public class ArrayToString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int numb_items = in.nextInt();

        System.out.print("Enter the value of all items (separated by space): ");
        int[] items = enterArray(numb_items, in);

        System.out.println(arrayToString(items));

        in.close();
    }

    public static int[] enterArray(int num_items, Scanner in) {
        if (num_items > 0) {
            int[] items = new int[num_items];

            for (int idx = 0; idx < items.length; idx++) {
                items[idx] = in.nextInt();
            }
            return items;
        }
        return null;
    }

    public static String arrayToString(int[] array) {
        if (array == null) {
            return "null";
        }
        String s = "[";
        for (int i = 0; i < array.length - 1; i++) {
            s += array[i] + ", ";
        }
        if (array.length > 0) {
            s += array[array.length - 1];
        }
        s += "]";
        return s;
    }
}
