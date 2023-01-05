public class LinearSearch {
    public static void main(String[] args) {
        int[] array = new int[]{5, 1, 4, 6, 7, 8, 8, 19, 20, 11, 34};
        System.out.println(linearSearch(array, 6));
        System.out.println(linearSearch(array, 3));
        System.out.println(linearSearchIndex(array, 8));
        System.out.println(linearSearchIndex(array, 100));
    }

    public static boolean linearSearch(int[] array, int key) {
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] == key) {
                return idx;
            }
        }
        return -1;
    }
}
