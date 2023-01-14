class Solution {
    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        for(int i = 0; i < (s.length)/2; i++) {
            s = swap(s, left, right);
            left++;
            right--;
        }

    }

    public static char[] swap(char[] s, int left, int right) {
        char copy = s[left];
        s[left] = s[right];
        s[right] = copy;
        return s;
    }
}
