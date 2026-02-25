package arrays;

public class AntiDiagonal {

    public static int[][] solve(int[][] A) {
        int N = A.length;

        int[][] result = new int[2 * N - 1][N];

        int d = 0; // index برای هر anti-diagonal

        // مرحله اول: شروع از ردیف 0
        for (int colStart = 0; colStart < N; colStart++) {
            int row = 0;
            int col = colStart;
            int index = 0;

            while (row < N && col >= 0) {
                result[d][index++] = A[row][col];
                row++;
                col--;
            }

            d++;
        }

        // مرحله دوم: شروع از ستون آخر
        for (int rowStart = 1; rowStart < N; rowStart++) {
            int row = rowStart;
            int col = N - 1;
            int index = 0;

            while (row < N && col >= 0) {
                result[d][index++] = A[row][col];
                row++;
                col--;
            }

            d++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] result = solve(matrix);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}