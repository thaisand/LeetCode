
class Solution {
    public int removeElement(int[] nums, int val) {
        boolean aux = true; 
        int k = 0; 
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) { 
                k++;
                nums[i] = nums[i+1];    
            }
        }
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        //System.out.println(nums.length - k);
        return nums.length - k;
    }


}