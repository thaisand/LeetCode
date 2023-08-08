class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean resp = true;
        int dif = 0;
        dif = nums[1] - nums[0];
        
        if (dif > 0) {
            for (int i = 0; i < nums.length - 1; i++) {
               
                    if (!(nums[i + 1] >= nums[i])) {
                        resp = false;
                    }
                
            }
        } else if (dif < 0) {
            for (int i = 0; i < nums.length - 1; i++) {
               
                    if (!(nums[i + 1] <= nums[i])) {
                        resp = false;
                    }
                
            }
        }

        return resp;
    }
}