public class PrintArrays {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        double[] array2 = new double[]{1.1, 2.2, 3.3};
        float[] array3 = new float[]{1, 2, 4};

        print(array1);
        System.out.println();

        print(array2);
        System.out.println();

        print(array3);
    }

    public static void print(int[] array) {
        System.out.print("The value are: ");
        for (int idx = 0; idx < array.length; idx++) {
            if (idx == 0) {
                System.out.print("[" + array[idx] + ", ");
            } else if (idx == array.length - 1) {
                System.out.print(array[idx] + "]");
            } else {
                System.out.print(array[idx] + ", ");
            }
        }
    }

    public static void print(double[] array) {
        System.out.print("The value are: ");
        for (int idx = 0; idx < array.length; idx++) {
            if (idx == 0) {
                System.out.print("[" + array[idx] + ", ");
            } else if (idx == array.length - 1) {
                System.out.print(array[idx] + "]");
            } else {
                System.out.print(array[idx] + ", ");
            }
        }
    }

    public static void print(float[] array) {
        System.out.print("The value are: ");
        for (int idx = 0; idx < array.length; idx++) {
            if (idx == 0) {
                System.out.print("[" + array[idx] + ", ");
            } else if (idx == array.length - 1) {
                System.out.print(array[idx] + "]");
            } else {
                System.out.print(array[idx] + ", ");
            }
        }
    }
}
