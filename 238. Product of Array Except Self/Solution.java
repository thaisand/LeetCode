class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int[] resp = new int[nums.length]; 
        
        for(int i = 0; i < nums.length; i++) {
            int aux = 1; 
            for(int j = 0; j < nums.length; j++) {
                if (i != j) {
                    //System.out.println("i = " + i + " // j = " + j + " // aux = " + aux + " // nums[j] = " + nums[j]);
                    aux *= nums[j];
                }
            }
            resp[i] = aux; 
            //System.out.println("aux = " + aux);
        }
        return resp; 
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(productExceptSelf(nums));
    }
}