import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49}
        };
        System.out.println(Arrays.toString(search(arr, 37)));
    }

    public static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col <= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }
            if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] {-1, -1};
    }

//    public static int[] search(int[][] matrix, int target) {
//        int rows = matrix.length;
//        int col = matrix[0].length; // be cautious, matrix may be empty
//
//        if(rows == 0) {
//            return binarySearch(matrix, 0, 0, col - 1, target);
//        }
//        int[][] arr = new int[0][1];
//        return arr[1];
//
//        // run the loops until 2 rows are remaining;
    }


