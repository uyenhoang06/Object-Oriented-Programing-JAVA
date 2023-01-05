public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] array = {2, 4, 10, 17, 21, 25, 32};
        System.out.println(binarySearch(array, 12));
        System.out.println(binarySearch(array, 10));
        System.out.println(binarySearch(array, 1));
        System.out.println(binarySearch(array, 4));
    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx == toIdx - 1) {
            if (array[fromIdx] == key) {
                return true;
            } else {
                return false;
            }
        } else {
            int midIdx = (fromIdx + toIdx) / 2;
            if (array[midIdx] == key) {
                return true;
            } else if (key < array[midIdx]) {
                toIdx = midIdx;
            } else {
                fromIdx = midIdx + 1;
            }
        }
        return binarySearch(array, key, fromIdx, toIdx);
    }

    public static boolean binarySearch(int[] array, int key) {
        return binarySearch(array, key, 0, array.length - 1);
    }
}
