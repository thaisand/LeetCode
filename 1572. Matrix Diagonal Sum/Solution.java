class Solution {
    public int diagonalSum(int[][] mat) {
        int aux = mat.length - 1;
        int sum = 0;
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (j == aux) {
                    sum += mat[i][j];
                    System.out.println("j == aux, j = " + j + ", aux = " + aux);
                    System.out.println("sum = " + sum);
                    aux--;
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j || j == aux) {
                    System.out.println("j == i, j = " + j + ", i = " + i);
                    sum += mat[i][j];
                    System.out.println("sum = " + sum);
                    aux--;
                }
            }
        }
        if(mat.length % 2 != 0) {
            sum -= mat[mat.length/2][mat.length/2];
        }
        return sum;
    }
}