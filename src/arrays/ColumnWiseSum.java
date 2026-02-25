package arrays;

public class ColumnWiseSum {
    public static int[] solve(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;

        int[] result = new int[cols];

        for (int col = 0; col < cols; col++) {
            int sum = 0;
            for (int row = 0; row < rows; row++) {
                sum += A[row][col];
            }
            result[col] = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 2, 3, 4}
        };

        int[] result = solve(matrix);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}


