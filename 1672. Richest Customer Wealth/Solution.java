class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] ammounts = new int[accounts.length];
        for(int i = 0; i < accounts.length; i++) {
            for(int j = 0; j < accounts[0].length; j++) {
                ammounts[i] += accounts[i][j];
            }
        }
        int max = 0; 
        for(int i = 0; i < ammounts.length; i++) {
            if(ammounts[i] > max) {
                max = ammounts[i];
            }
        }
        return max; 
    }
}