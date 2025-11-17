class Solution {
    public int[][] generateMatrix(int n) {

        int[][] matrix = new int[n][n];

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        int total = n * n;
        int count = 1;

        while (count <= total) {

            // Left → Right
            for (int i = left; i <= right && count <= total; i++) {
                matrix[top][i] = count++;
            }
            top++;

            // Top → Bottom
            for (int i = top; i <= bottom && count <= total; i++) {
                matrix[i][right] = count++;
            }
            right--;

            // Right → Left
            for (int i = right; i >= left && count <= total; i--) {
                matrix[bottom][i] = count++;
            }
            bottom--;

            // Bottom → Top
            for (int i = bottom; i >= top && count <= total; i--) {
                matrix[i][left] = count++;
            }
            left++;
        }

        return matrix;
    }
}
