package arrays;

        public class MinorDiagonal {

            public static int solve(int[][] A) {
                int N = A.length;
                int sum = 0;

                for (int i = 0; i < N; i++) {
                    sum += A[i][N - 1 - i];
                }

                return sum;
            }

            public static void main(String[] args) {
                int[][] matrix = {
                        {1, -2, -3},
                        {-4, 5, -6},
                        {-7, -8, 9}
                };

                int result = solve(matrix);
                System.out.println(result);  // Output: -5
            }
        }
