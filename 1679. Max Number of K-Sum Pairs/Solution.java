import java.util.ArrayList;
import java.util.List;

class Solution {
    public static int maxOperations(int[] nums, int k) {
        List<Integer> newNums = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    newNums.add(nums[i]);
                    newNums.add(nums[j]);
                    System.out.println("nums[i] = " + nums[i] + ", nums[j] = " + nums[j]);
                    if (nums[i] + nums[j] == k) {
                        System.out.println("i = j = k, " + nums[i] + " + " + nums[j] + " = " + k);
                        newNums.remove(nums[i]);
                        newNums.remove(nums[j]);
                        count++;
                    } 
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
       System.out.println(maxOperations(nums, 5));
    }
}