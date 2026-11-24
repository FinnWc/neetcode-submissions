class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int heightHi = matrix.length - 1;
        int heightLo = 0;
        int row = -1;
        int mid;
        while (heightLo <= heightHi) {
            mid = heightLo + (heightHi-heightLo) / 2;
            if(matrix[mid][0] <= target && 
            matrix[mid][matrix[0].length-1] >= target) {
                row = mid;
                break;
            } else if(target < matrix[mid][0]){
                heightHi = mid-1;
            } else if(target > matrix[mid][matrix[0].length-1]) {
                heightLo = mid+1;
            }
        }
        if(row == -1) {
            return false;
        }
        int rowHi = matrix[0].length-1;
        int rowLo = 0;
        while(rowLo <= rowHi) {
            mid = rowLo + (rowHi - rowLo) / 2;
            if(matrix[row][mid] == target) {
                return true;
            } else if(matrix[row][mid] > target) {
                rowHi = mid-1;
            } else if(matrix[row][mid] < target) {
                rowLo = mid+1;
            }
        }
        return false;
    }
}
