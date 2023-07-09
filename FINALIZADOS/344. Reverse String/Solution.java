
class Solution {
    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        for(int i = 0; i < (s.length - 1)/2; i++) {
            s = swap(s, left, right);
            left++;
            right--;
        }

        for(int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }

    public static char[] swap(char[] s, int left, int right) {
        char copy = s[left];
        s[left] = s[right];
        s[right] = copy;
        return s;
    }

    public static void main(String[] args) {
        char[] s = {'H','a','n','n','a','h'};
        reverseString(s);
    }
}