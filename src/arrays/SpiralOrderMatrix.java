package arrays;

public class SpiralOrderMatrix {

    public static int[][] generate(int A) {

        int[][] matrix = new int[A][A];
        int num = 1;

        int top = 0;
        int bottom = A - 1;
        int left = 0;
        int right = A - 1;

        while (top <= bottom && left <= right) {

            // 1️⃣ left → right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // 2️⃣ top → bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // 3️⃣ right → left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }

            // 4️⃣ bottom → top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }

        return matrix;
    }
}