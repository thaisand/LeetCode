class Solution {
    public int[] runningSum(int[] nums) {
        int[] resp = new int[nums.length];
        int soma = 0; 
        int j = 0;
        while (j < nums.length) {
            for (int i = 0; i <= j; i++) {
                soma += nums[i];
            }
            resp[j] = soma;
            soma = 0;
            j++;
        }
        return resp;
    }
}