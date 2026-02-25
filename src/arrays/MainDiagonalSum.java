package arrays;

public class MainDiagonalSum {
    public static int MainSum(int[][] A){
        int n = A.length;
        int sum = 0;

        for (int i = 0; i < n; i++){
            sum += A[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, -2, -3},
                {-4, 5, -6},
                {-7, -8, 9}
        };

        int result = MainSum(matrix);
        System.out.println(result);  // Output: 15
    }
}
