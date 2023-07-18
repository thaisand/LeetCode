import java.util.Arrays;

class Solution {
    public static int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int square = (nums[i]*nums[i]);
            squares[i] = square;
            System.out.println(squares[i]);
        }
        Arrays.sort(squares);
        System.out.print("[");
        for(int i = 0; i < squares.length; i++) {
            if(i != squares.length - 1) {
                System.out.print(squares[i] + ",");
            }
            else {
                System.out.print(squares[i]);
            }
        }
        System.out.print("]");
        System.out.println();
        return squares;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        sortedSquares(nums);
        //System.out.println(sortedSquares(nums));

    }
}
