class Solution {
    public static boolean lemonadeChange(int[] bills) {
        int tens = 0, fives = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 10) {
                tens++;
                if (fives > 0) {
                    fives--;
                } else {
                    return false;
                }
            } else if (bills[i] == 20) {
                if (fives > 2 && tens == 0) {
                    fives -= 3;
                } else if (fives > 0 && tens > 0) {
                    fives--;
                    tens--;
                } else {
                    return false;
                }
            } else if (bills[i] == 5) {
                fives++;
            }
        }
        return true;
    }
}