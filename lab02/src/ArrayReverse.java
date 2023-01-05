public class ArrayReverse {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4};
        System.out.println("The original array1 is: ");
        print(array1);

        reverse(array1);
        System.out.println("The reverse array1 is: ");
        print(array1);

        int[] array2 = new int[]{1, 2, 3, 4, 5};
        System.out.println("The original array2 is: ");
        print(array2);

        reverse(array2);
        System.out.println("The reverse array2 is: ");
        print(array2);
    }

    public static void reverse(int[] array) {
        if (array == null) {
            return;
        }
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
    }

    public static void print(int[] array) {
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
}
