class Solution {
    public int arraySign(int[] nums) {
        int product = 1; 
        for(int i = 0; i < nums.length; i++) {
            product*=nums[i];
        }
        System.out.println(product);
        if(product >= 0) {
            if(product == 0) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return -1;
        }
    }
}