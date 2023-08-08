class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int dif = coordinates[0][1] - coordinates[0][0];
        boolean resp = true;
        for (int i = 0; i < coordinates.length; i++) {
            if(coordinates[i][1] - coordinates[i][0] != dif) {
                resp = false;
            }
        }

        return resp;
    }
}