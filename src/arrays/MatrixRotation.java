package arrays;

public class MatrixRotation {
    public void solve (int[][] A){
        int n = A.length;

        //transpose the matrix
        for ( int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        //reverse each row
        for (int i = 0; i < n; i++){
            int left = 0;
            int right = n -1;

            while(left < right){
                int temp = A[i][left];
                A[i][left] = A[i][right];
                A[i][right] = temp;
                left ++;
                right --;
            }
        }
    }
}

