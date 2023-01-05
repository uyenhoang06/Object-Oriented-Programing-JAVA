public class Contains {
    public static boolean contains(int[] array, int key) {
        if (array == null) {
            return false;
        }
        for (int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(contains(array, 1));
        System.out.println(contains(array, 0));
    }
}
