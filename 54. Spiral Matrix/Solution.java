import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> nums = new ArrayList<>();
        int linhas = matrix.length, colunas = matrix[0].length;
        readLine(nums, matrix, 0, colunas - 1, 0, linhas - 1);
        return nums;
    }

    public static void readLine(List<Integer> nums, int[][] matrix, int left, int right, int row, int endRow) {
        if (row > endRow || left > right) return;
        for (int i = left; i <= right; i++) {
            nums.add(matrix[row][i]);
        }
        readColumn(nums, matrix, left, right, row + 1, endRow);
    }

    public static void readColumn(List<Integer> nums, int[][] matrix, int left, int right, int column, int endColumn) {
        if (column > endColumn || left > right) return;
        for (int i = column; i <= endColumn; i++) {
            nums.add(matrix[i][right]);
        }
        readLineBackwards(nums, matrix, left, right - 1, column, endColumn);
    }

    public static void readLineBackwards(List<Integer> nums, int[][] matrix, int left, int right, int row, int endRow) {
        if (row > endRow || left > right) return;
        for (int i = right; i >= left; i--) {
            nums.add(matrix[endRow][i]);
        }
        readColumnBackwards(nums, matrix, left, right, row, endRow - 1);
    }

    public static void readColumnBackwards(List<Integer> nums, int[][] matrix, int left, int right, int column, int endColumn) {
        if (column > endColumn || left > right) return;
        for (int i = endColumn; i >= column; i--) {
            nums.add(matrix[i][left]);
        }
        readLine(nums, matrix, left + 1, right, column, endColumn);
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> result = spiralOrder(matrix);
        System.out.println(result);
    }
}
