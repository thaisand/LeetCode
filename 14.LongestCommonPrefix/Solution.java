import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String entradas[] = { "aaa", "aa", "aaa" };
        longestCommonPrefix(entradas);
    }

    public static String longestCommonPrefix(String[] strs) {
        int tam = strs.length;
        String copy = new String();
        if (tam == 0) {
            return "";
        } else if (tam == 1) {
            return strs[0];
        } else {
            Arrays.sort(strs);
            int length = strs[0].length();
            StringBuilder res = new StringBuilder();
            // Comapre the first and the last strings character
            // by character.
            for (int i = 0; i < length; i++) {
                // If the characters match, append the character to the result.
                if (strs[0].charAt(i) == strs[tam - 1].charAt(i)) {
                    res.append(strs[0].charAt(i));
                }
                // Else, stop the comparison.
                else {
                    break;
                }
            }
            copy = res.toString();
        }
        System.out.println(copy);
        return copy;
    }

}