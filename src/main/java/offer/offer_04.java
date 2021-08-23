package offer;

public class offer_04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {
            if (findNumberInArray(matrix[i], target)) {
                return true;
            }
        }
        return false;
    }

    public boolean findNumberInArray(int[] matrix, int target) {
        int left = 0, right = matrix.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[mid] > target) {
                right = mid - 1;
            } else if (matrix[mid] < target) {
                left = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
