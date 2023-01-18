class Solution {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int resp[] = new int[nums.length];
        int j = 0; 
        for(int i = nums.length - k; i < nums.length; i++){
            resp[j] = nums[i];
            j++;
        }
        for(int i = 0; i < nums.length - k; i++) {
            resp[j] = nums[i];
            j++;
        }
        for (int i = 0; i < resp.length; i++) {
            nums[i] = resp[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
    }
}
