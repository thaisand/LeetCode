class Solution {
    public static boolean increasingTriplet(int[] nums) {
        boolean tem3 = false, aux = true;
        int menor = -999999, pos = 0, y = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < menor) {
                menor = nums[i];
                pos = i;
            }
        }
        if (pos < nums.length) {
            while (aux) {
                if (nums[pos] > menor) {
                    menor = nums[pos];
                    y++;
                }
                pos++;
                if (y == 2) {
                    aux = false;
                    tem3 = true;
                }
            }
        }
        return tem3;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(increasingTriplet(nums));
    }
}