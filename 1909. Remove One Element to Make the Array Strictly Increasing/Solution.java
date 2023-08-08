class Solution {
    public boolean canBeIncreasing(int[] nums) {
        boolean resp = false; 
        int aux = 0, remover = 0; 
        for(int i = 0; i < nums.length; i++) {
            aux = nums[i];
            if(nums[i+1] < aux) {
                remover = i; 
                
            }
        }
        return resp; 
    }
}