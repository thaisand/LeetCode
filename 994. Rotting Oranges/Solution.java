class Solution {
    public static int orangesRotting(int[][] grid) {
        int contador = 0, linhas = grid.length, colunas = grid[0].length;
        for(int i = 0; i < linhas; i++) {
            for(int j = 0; j < colunas; j++) {
                if(grid[i][j] == 2) {
                   System.out.println(buscaProf(grid, i, j, contador));
                }
            }
        }

        return contador;
    }

    private static int buscaProf(int[][] grid, int linha, int coluna, int contador) {
        if (linha < 0 || linha >= grid.length || coluna < 0 || coluna >= grid[linha].length || grid[linha][coluna] == '0') {
            return contador;
        } else if (linha < 0 || linha >= grid.length || coluna < 0 || coluna >= grid[linha].length || grid[linha][coluna] == '1') {
            grid[linha][coluna] = '0'; // Marcar como visitado
        } else {
            return contador;
        }       
         
        contador++;
        buscaProf(grid, linha - 1, coluna, contador); // Vizinho acima
        buscaProf(grid, linha + 1, coluna, contador); // Vizinho abaixo
        buscaProf(grid, linha, coluna - 1, contador); // Vizinho à esquerda
        buscaProf(grid, linha, coluna + 1, contador); // Vizinho à direita
        return contador;
    }

    public static void main(String[] args) {
        int[][] grid = {
                { 2,1,1 },
                { 1,1,0 },
                { 0,1,1 },
                
        };
        System.out.println(orangesRotting(grid));
    }
}