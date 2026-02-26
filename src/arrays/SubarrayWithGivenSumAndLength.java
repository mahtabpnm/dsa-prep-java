package arrays;

public class SubarrayWithGivenSumAndLength {

    public int solve(int[] A, int B, int C) {

        int N = A.length;

        // Step 1: initial window sum (size B)
        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }

        if (sum == C) {
            return 1;
        }

        // Step 2: sliding window
        for (int i = B; i < N; i++) {
            sum -= A[i - B];   // remove left element
            sum += A[i];       // add new right element

            if (sum == C) {
                return 1;
            }
        }

        return 0;
    }
}