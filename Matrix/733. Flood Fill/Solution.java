class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int cor = image[sr][sc];
        fill(image, sr, sc, color, cor);
        return image;
    }

    public void fill(int[][] image, int r, int c, int color, int cor) {
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length || image[r][c] != cor || image[r][c] == color) {
            return;
        }

        image[r][c] = color;

        fill(image, r - 1, c, color, cor); // Up
        fill(image, r + 1, c, color, cor); // Down
        fill(image, r, c - 1, color, cor); // Left
        fill(image, r, c + 1, color, cor); // Right
    }
}
