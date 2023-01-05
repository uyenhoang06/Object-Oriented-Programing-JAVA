public class CopyArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 4, 7, 9, 10};
        System.out.println("The original array is: ");
        printArray(array);

        int[] copiedArray1 = copyOf(array);
        System.out.println("The copied array 1 is: ");
        printArray(copiedArray1);

        int[] copiedArray2 = copyOf(array, 4);
        System.out.println("The copied array 2 is: ");
        printArray(copiedArray2);
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

    public static int[] copyOf(int[] array) {
        if (array == null) {
            return null;
        }
        int[] arr = new int[array.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = array[i];
        }
        return arr;
    }

    public static int[] copyOf(int[] array, int newLength) {
        if (array == null) {
            return null;
        }
        int[] arr = new int[newLength];
        for (int i = 0; i < Math.min(newLength, array.length); i++) {
            arr[i] = array[i];
        }
        return arr;
    }
}
