package arrays;

public class SumOfAllSubarraySums {

    public static long subarraySum(int[] A) {

        long total = 0;
        int n = A.length;

        for (int i = 0; i < n; i++) {

            // Contribution of A[i]
            long contribution = (long) A[i] * (i + 1) * (n - i);

            total += contribution;
        }

        return total;
    }

    // Optional: main method for testing
    public static void main(String[] args) {

        int[] A1 = {1, 2, 3};
        System.out.println(subarraySum(A1));  // Expected: 20

        int[] A2 = {2, 1, 3};
        System.out.println(subarraySum(A2));  // Expected: 19
    }
}