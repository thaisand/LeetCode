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
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int[] swap(int[] nums, int left, int right) {
        nums[left] = nums[right];
        nums[right] = 0;
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}