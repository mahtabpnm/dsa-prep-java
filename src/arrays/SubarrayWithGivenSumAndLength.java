package arrays;

public class SubarrayWithGivenSumAndLength {

    public int solve(int[] A, int B, int C) {
        int sum = 0;
        for(int i = 0 ; i < A.length ; i++){
            sum += A[i];
            if(i >= B){
                sum -= A[i - B];
            }
            if(sum == C && i >= B - 1){
                return 1;
            }
        }
        return 0;
    }
}
