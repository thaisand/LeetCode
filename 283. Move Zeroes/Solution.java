class Solution {
    public static void moveZeroes(int[] nums) {
        // swap everytime it finds a non-zero value
        int left = 0, right = 0; 
        for (int i = 0; i < nums.length; i++) {
            right = i;
            if(nums[i] != 0) {
                nums = swap(nums, left, right);
                left++;
            }
        }
        
    }

    public static int[] swap(int[] nums, int left, int right) {
        int copy = nums[left];
        nums[left] = nums[right];
        nums[right] = copy;
        return nums;
    }
}
