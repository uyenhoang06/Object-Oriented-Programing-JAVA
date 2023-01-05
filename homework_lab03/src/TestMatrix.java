import java.util.Scanner;

public class TestMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("rows = ");
        int rows = in.nextInt();
        System.out.print("column = ");
        int cols = in.nextInt();

        int[][] mat1 = new int[rows][cols];
        Matrix.createRandomMatrix(mat1);
        System.out.println("Integer matrix 1: ");
        Matrix.print(mat1);

        int[][] mat2 = Matrix.createRandomMatrix(rows, cols);
        System.out.println("Integer matrix 2: ");
        Matrix.print(mat2);

        int[][] sumMat = Matrix.add(mat1, mat2);
        System.out.println("Sum of the integer matrices is: ");
        Matrix.print(sumMat);

        int[][] subMat = Matrix.subtract(mat1, mat2);
        System.out.println("Subtract of the integer matrices is: ");
        Matrix.print(subMat);

        int[][] mulMat = Matrix.multiply(mat1, mat2);
        System.out.println("Multiply of the integer matrices is: ");
        Matrix.print(mulMat);

        in.close();
    }
}
