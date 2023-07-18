import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        boolean repetido = false;
        twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> resp = new ArrayList<>();
        ArrayList<Integer> respSemDuplicatas = new ArrayList<>();
        int tam = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && nums[i] != nums[j]) {
                    resp.add(i);
                    resp.add(j);
                }
            }
        }
        for (Integer resps : resp) {
            if (!respSemDuplicatas.contains(resps)) {
                respSemDuplicatas.add(resps);
            }
        }

        
        tam = respSemDuplicatas.size();
        int[] resposta = new int[tam];
        for (int i = 0; i < tam; i++) {
            // System.out.println("final " + resp.get(i));
            resposta[i] = respSemDuplicatas.get(i);
        }
        return resposta;
    }
}