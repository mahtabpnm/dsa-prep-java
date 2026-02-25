package arrays;

public class MatrixTranspose {

    public static int[][] solve(int[][] A) {

        int rows = A.length;
        int cols = A[0].length;

        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = A[i][j];
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------");
    }

    public static void main(String[] args) {

        // Test 1 (Square Matrix)
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix 1:");
        printMatrix(matrix1);

        int[][] result1 = solve(matrix1);

        System.out.println("Transposed Matrix 1:");
        printMatrix(result1);


        // Test 2 (Rectangular Matrix)
        int[][] matrix2 = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        System.out.println("Original Matrix 2:");
        printMatrix(matrix2);

        int[][] result2 = solve(matrix2);

        System.out.println("Transposed Matrix 2:");
        printMatrix(result2);
    }
}