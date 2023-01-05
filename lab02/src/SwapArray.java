public class SwapArray {
    public static boolean swap(int[] array1, int[] array2) {
        if (array1 == null) {
            if (array2 == null) {
                return true;
            }
            return false;
        }
        if (array2 == null) {
            return false;
        }
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            int tmp = array1[i];
            array1[i] = array2[i];
            array2[i] = tmp;
        }
        return true;
    }

    public static void printArray(int[] array) {
        for (int idx = 0; idx < array.length; idx++) {
            if (idx == 0) {
                System.out.print("[" + array[idx] + ", ");
            } else if (idx == array.length - 1) {
                System.out.println(array[idx] + "]");
            } else {
                System.out.print(array[idx] + ", ");
            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int[] array3 = {1, 2, 3};
        System.out.println(swap(array1, array3));
        System.out.println(swap(array1, array2));
        printArray(array1);
        printArray(array2);
        System.out.println(swap(null, null));
        System.out.println(swap(array1, null));
    }
}
