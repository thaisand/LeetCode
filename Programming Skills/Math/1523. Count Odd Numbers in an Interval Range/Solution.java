class Solution {
    public int countOdds(int low, int high) {
        int sum = 0;
        while(low <= high) 
        if(low%2 == 0 && high%2 == 0) {
            low++;
            while(low < high) {
                sum++; 
                low = low + 2;
            }
        } else if (low%2 == 0 && high%2 == 1){
            low++;
            while(low <= high) {
                sum++; 
                low = low + 2;
            }
        } else if (low%2 == 1 && high%2 == 1){
            while(low <= high) {
                sum++; 
                low = low + 2;
            }
        } else if (low%2 == 1 && high%2 == 0){
            while(low < high) {
                sum++; 
                low = low + 2;
            }
        }
        return sum;
    }
}