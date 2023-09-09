class Solution {
    public static int numIslands(char[][] grid) {
        int contador = 0; // contador de ilhas
        for (int i = 0; i < grid.length; i++) {
            for (int coluna = 0; coluna < grid[i].length; coluna++) {
                if (grid[i][coluna] == '1') {
                    contador = contador + 1;
                    buscaIlha(grid, i, coluna);
                }
            }
        }
        return contador;
    }

    public static void buscaIlha(char[][] grid, int linha, int coluna) {
        if (linha < 0 || linha >= grid.length || coluna < 0 || coluna >= grid[linha].length || grid[linha][coluna] == '0') {
            return;
        }
        
        grid[linha][coluna] = '0'; // Marcar como visitado
        
        buscaIlha(grid, linha - 1, coluna); // Vizinho acima
        buscaIlha(grid, linha + 1, coluna); // Vizinho abaixo
        buscaIlha(grid, linha, coluna - 1); // Vizinho à esquerda
        buscaIlha(grid, linha, coluna + 1); // Vizinho à direita
    }

    public static void main(String[] args) {
        char[][] grid = {
                { '1', '1', '1', '1', '0' },
                { '1', '1', '0', '1', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '0', '0', '0' }
        };
        System.out.println(numIslands(grid));
    }
}
