class Solution {

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int total = mat.length * mat[0].length;
        c = total / r;
        int[][] resp = new int[r][c];
        int[] aux = new int[r * c];
        int auxInt = 0;
        for (int i = 0; i < mat.length; i++) {
            System.out.println("max i=" + mat.length + " i = " + i);
            for (int j = 0; j < mat[0].length; j++) {
                System.out.println("max j=" + mat[0].length + " j = " + j);
                System.out.println(mat[i][j]);
                aux[auxInt++] = mat[i][j];
            }
        }
        auxInt = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                resp[i][j] = aux[auxInt++];
            }
        }
        return resp;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3, 4 } };
        System.out.println(matrixReshape(mat, 2, 4));
    }
}
