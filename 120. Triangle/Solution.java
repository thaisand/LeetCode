import java.util.List;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int sum = 0;
        for (int i = 0; i < triangle.size(); i++) {
            int min = 999999, index = 0;
            List<Integer> aux = triangle.get(i);
            System.out.println("linha " + i);
            if (aux.size() > 1) {
                for (int j = index; j <= index + 1; j++) {
                    if (aux.get(j) < min) {
                        min = aux.get(j);
                        index = j;
                        System.out.println("min = " + min + ", index = " + index);
                    }
                }
            } else {
                min = aux.get(0);
            }

            sum += min;
        }
        return sum;
    }
}