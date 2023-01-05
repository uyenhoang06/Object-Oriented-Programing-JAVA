import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[]{9, 6, 1, 4, 5, 2, 7};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        for (int idx = 1; idx < array.length; idx++) {
            int key = array[idx];
            int pos = idx - 1;
            while (pos >= 0 && array[pos] > key) {
                array[pos + 1] = array[pos];
                pos--;
            }
            array[pos + 1] = key;
        }
    }
}
