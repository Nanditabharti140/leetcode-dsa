
import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0) return result;

        int top = 0;
        int m = matrix.length;
        int left = 0;
        int n = matrix[0].length;
        int bottom = m-1;
        int right = n-1;
        int total = m*n;
        int count = 0;

        while (count < total) {

            // Traverse from Left → Right
            for (int i = left; i <= right && count < total; i++) {
                result.add(matrix[top][i]);
                count++;
            }
            top++;

            // Traverse from Top → Bottom
            for (int i = top; i <= bottom && count < total; i++) {
                result.add(matrix[i][right]);
                count++;
            }
            right--;

                // Traverse Right → Left
                for (int i = right; i >= left && count < total; i--) {
                    result.add(matrix[bottom][i]);
                    count++;
                }
                bottom--;

                // Traverse Bottom → Top
                for (int i = bottom; i >= top && count < total; i--) {
                    result.add(matrix[i][left]);
                    count++;
                }
                left++;
        }

        return result;
    }
}
