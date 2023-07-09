class Solution {
    public static int search(int[] nums, int target) {
        int esq = 0, dir = (nums.length - 1), meio = 0, resp = -1;
        while(esq <= dir) {
            meio = (esq + dir) /2;
            if(target < nums[meio]) {
                //System.out.println("menor, meio = " + nums[meio]);
                dir = meio - 1;
            } else if(target > nums[meio]) {
                esq = meio + 1;
                //System.out.println("maior, meio = " + nums[meio]);
            } else if (target == nums[meio]) { // target == meio
                resp = meio; 
                //System.out.println("igual, resp = " + nums[meio]);
                return resp;
            } 
        }
        return resp;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.print(search(nums, target));
    }
}