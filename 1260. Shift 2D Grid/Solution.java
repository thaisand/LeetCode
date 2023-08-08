import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int[] nums = new int[grid.length * grid[0].length];
        int posNums = 0; 
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                nums[posNums++] = grid[i][j];
            }
        }
        nums = shift(nums, k);
        List<List<Integer>> matrix = new ArrayList<>();
        List<Integer> aux = new ArrayList<>();
        posNums = 0; 
        for(int i = 0; i < grid.length; i++) {
            aux = new ArrayList<>();
            for(int j = 0; j < grid[0].length; j++) {
                aux.add(nums[posNums++]);
            }
            matrix.add(aux);
        }
        return matrix; 
    }

    private int[] shift(int[] nums, int k) {
        int[] shifted = new int[nums.length];
        int posShifted = 0; 
        
        for(int i = nums.length - k; i < nums.length; i++ ) {
            shifted[posShifted++] = nums[i];
        }
        for(int i = 0; i < nums.length - k; i++) {
            shifted[posShifted++] = nums[i];
        }
        for(int i = 0; i < nums.length; i++) {
            System.out.print(shifted[i] + " ");
        }
        return shifted;
    }
}