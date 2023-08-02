import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void setZeroes(int[][] matrix) {
        List<Integer> is = new ArrayList<>();
        List<Integer> js = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    is.add(i);
                    js.add(j);
                }
            }
        }
        for (int i : is) {
            zeroLine(matrix, i);
        }
        for (int j : js) {
            zeroColumn(matrix, j);
        }
    }

    private static int[][] zeroLine(int[][] matrix, int linha) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[linha][j] = 0;
        }

        return matrix;
    }

    private static int[][] zeroColumn(int[][] matrix, int coluna) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][coluna] = 0;
        }

        return matrix;
        
    }

    public static void main(String[] args) {
        int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        setZeroes(matrix);
    }
}