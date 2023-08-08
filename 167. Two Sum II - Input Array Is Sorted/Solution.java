class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int[] resp = new int[2];
        int esq = 0, dir = numbers.length - 1; 
        while (esq < dir) {
            if (numbers[esq] + numbers[dir] == target) {
                    resp[0] = esq + 1;
                    resp[1] = dir + 1;
                    return resp;
            } else if(numbers[esq] + numbers[dir] < target) {
                esq++;
            } else if(numbers[esq] + numbers[dir] > target) {
                dir--;
            }
            //System.out.println("esq = " + esq + " dir = " + dir);
        }
        return resp;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 9;
        twoSum(numbers, target);
    }
}