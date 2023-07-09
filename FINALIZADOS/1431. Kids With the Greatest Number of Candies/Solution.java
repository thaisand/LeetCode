import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int[] extras = new int[candies.length];
        int maior = 0; 
        for(int i = 0; i < candies.length; i++) {
            extras[i] = candies[i] + extraCandies;
            if (candies[i] > maior) {
                maior = candies[i];
            }
        }
        List<Boolean> resp = new  ArrayList<>();
        for(int i = 0; i < candies.length; i++) {
            if(extras[i] >= maior) {
                resp.add(i, true); 
            } else {
                resp.add(i, false); 
            }
        }
        return resp;
    }
}