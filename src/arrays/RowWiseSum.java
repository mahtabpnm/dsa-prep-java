package arrays;

public class RowWiseSum {
    public static int [] RowSum(int [] []A){
        int rows = A.length;
        int cols = A[0].length;

        int [] result = new int [rows];

        for (int row = 0; row< rows; row++){
            int sum = 0;
            for (int col = 0; col<cols; col++){
                sum += A[row][col];
            }
            result[row] = sum; // it gives back as a row
    }
        return result;
}
public static void main(String[] args) {
    int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 2, 3, 4}
    };

    int[] result = RowSum(matrix);

    for (int num : result) {
        System.out.print(num + " ");
    }
}
}



