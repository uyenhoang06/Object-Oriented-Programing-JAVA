import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[]{1, 2, 4, 5, 6, 9, 9};
        System.out.print("Enter the key: ");
        int key = in.nextInt();
        int idx = search(array, key);
        if (idx != -1) {
            System.out.println("The index of array contains the key is: " + idx);
        } else {
            System.out.println("Array doesn't contain the key.");
        }
        in.close();
    }

    public static int search(int[] array, int key) {
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] == key) {
                return idx;
            }
        }
        return -1;
    }
}
