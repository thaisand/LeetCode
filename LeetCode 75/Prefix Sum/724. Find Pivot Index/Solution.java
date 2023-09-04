class Solution {
    public int pivotIndex(int[] nums) {
        int pivot = 0, tam = nums.length, leftSum = 0, rightSum = 0, j = 0;
        while (j < tam) {
            for (int i = 0; i < tam; i++) {
                if(i < j) {
                    leftSum += nums[i];
                } else if (i == j) {
                    pivot = nums[i];
                } else {
                    rightSum += nums[i];
                }
            }
            //System.out.println("j = " + j + " pivot = " + pivot + " leftSum = " + leftSum + " rightSum = " + rightSum);
            if(leftSum == rightSum) {
                return j;
            }
            leftSum = 0; 
            rightSum = 0;
            j++;
        }
        return -1;
    }
}