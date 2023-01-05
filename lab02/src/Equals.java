public class Equals {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] array2 = new int[]{1, 2, 3, 4, 5, 6};
        int[] array3 = new int[]{2, 3, 4, 5, 6, 7, 8, 9};
        int[] array4 = new int[]{1, 2, 4, 3, 4, 6};

        System.out.println("array1 and array2: " + equals(array1, array2));
        System.out.println("array1 and array3: " + equals(array1, array3));
        System.out.println("array1 and array4: " + equals(array1, array4));
    }

    public static boolean equals(int[] array1, int[] array2) {
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
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
