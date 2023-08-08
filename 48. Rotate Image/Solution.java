class Solution {
    public void rotate(int[][] matrix) {
        int[][] resp = new int[matrix.length][matrix.length];
        for (int j = 0, y = 0; j < matrix.length; y++, j++) {
            for (int i = matrix.length - 1, x = 0; i >= 0; i--, x++) {

                // System.out.println("i = " + i + ", j = " + j + ", x = " + x + ", y = " + y);
                resp[y][x] = matrix[i][j];
                // System.out.println(matrix[i][j] );
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                // System.out.print(resp[i][j]);
                matrix[i][j] = resp[i][j];
            }
            // System.out.println();
        }
    }
}