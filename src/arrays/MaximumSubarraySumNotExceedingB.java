package arrays;

public class MaximumSubarraySumNotExceedingB {
    public static int solve(int[] A, int B) {
        int left = 0;
        int sum = 0;
        int maxSum = 0;

        for (int right = 0; right < A.length; right++) {
            sum += A[right];

            while (sum > B) {
                sum -= A[left];
                left++;
            }

            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}



