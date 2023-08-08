
class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int k = removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int k = nums.length;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i+1]) {
                for(int j = 0; j < nums.length - 1; j++) {
                    nums[j] = nums[j+1];
                    k = k - 1;
                }
            }
        }
        
        System.out.println(k + ", nums = [" + nums + "]");
        return k;
    }
}