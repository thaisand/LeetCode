import java.util.ArrayList;
import java.util.List;

class Solution {
 public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;
        int i = 0;
        
        while (i < length) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
            
            if (count >= n) {
                return true;
            }
            
            i++;
        }
        
        return false;
    }

    public static void main(String[] args) {
        int[] flowerbed = { 0, 0, 0, 0, 1 };
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}