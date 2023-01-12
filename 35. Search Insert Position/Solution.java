class Solution {
    public static int searchInsert(int[] nums, int target) {
        int esq = 0, meio = 0, dir = 0, resp = 0;
        dir = nums.length - 1;

        while (esq <= dir) {
            meio = (esq + dir) / 2;
            if (target < nums[meio]) {
                dir = meio - 1;
            } else if (target > nums[meio]) {
                esq = meio + 1;
            } else if (target == nums[meio]) {
                resp = meio;
                return resp;
            }
        }
        if(target < nums[meio]) {
            resp = meio;
        }
        else {
            resp = meio + 1;
        }
        return resp;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 2;
        System.out.print(searchInsert(nums, target));
    }
}
