import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter rows and columns for matrices:");
            int rows = sc.nextInt();
            int cols = sc.nextInt();

            int[][] mat1 = new int[rows][cols];
            int[][] mat2 = new int[rows][cols];

            System.out.println("Enter elements of Matrix 1:");
            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++)
                    mat1[i][j] = sc.nextInt();

            System.out.println("Enter elements of Matrix 2:");
            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++)
                    mat2[i][j] = sc.nextInt();

            System.out.println("Addition:");
            printMatrix(add(mat1, mat2, rows, cols));

            System.out.println("Subtraction:");
            printMatrix(subtract(mat1, mat2, rows, cols));

            System.out.println("Multiplication:");
            printMatrix(multiply(mat1, mat2, rows, cols));
        }
    }

    // ✅ Helper methods should be outside the main method

    public static int[][] add(int[][] a, int[][] b, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = a[i][j] + b[i][j];
        return result;
    }

    public static int[][] subtract(int[][] a, int[][] b, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = a[i][j] - b[i][j];
        return result;
    }

    public static int[][] multiply(int[][] a, int[][] b, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < cols; k++)
                    result[i][j] += a[i][k] * b[k][j];
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
