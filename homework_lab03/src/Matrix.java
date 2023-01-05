
public class Matrix {
    public static void createRandomMatrix(int[][] matrix) {
        int n = matrix.length * matrix[0].length;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                matrix[r][c] = (int) (Math.random() * n + 1);
            }
        }
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        int n = rows * cols;
        int[][] matrix = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = (int) (Math.random() * n + 1);
            }
        }
        return matrix;
    }

    public static void print(int[][] matrix) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[0].length; cols++) {
                System.out.print(matrix[rows][cols] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void print(double[][] matrix) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[0].length; cols++) {
                System.out.print(matrix[rows][cols] + "\t");
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            return false;
        }
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            return false;
        }
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] matrix = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = matrix1[r][c] + matrix2[r][c];
            }
        }
        return matrix;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        double[][] matrix = new double[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = matrix1[r][c] + matrix2[r][c];
            }
        }
        return matrix;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] matrix = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = matrix1[r][c] - matrix2[r][c];
            }
        }
        return matrix;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        double[][] matrix = new double[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = matrix1[r][c] - matrix2[r][c];
            }
        }
        return matrix;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            return null;
        }
        int rows = matrix1.length;
        int cols = matrix2[0].length;
        int count = matrix1[0].length;
        int[][] matrix = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = 0;
                for (int i = 0; i < count; i++) {
                    matrix[r][c] += matrix1[r][i] * matrix2[i][c];
                }
            }
        }
        return matrix;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            return null;
        }
        int rows = matrix1.length;
        int cols = matrix2[0].length;
        int count = matrix1[0].length;
        double[][] matrix = new double[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = 0;
                for (int i = 0; i < count; i++) {
                    matrix[r][c] += matrix1[r][i] * matrix2[i][c];
                }
            }
        }
        return matrix;
    }
}
