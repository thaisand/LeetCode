import java.util.Arrays;

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        int diff = arr[1] - arr[0];
        boolean resp = true; 
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i+1] - arr[i] != diff) {
                resp= false;
            }
        }
        return resp;
    }
}