import java.util.ArrayList;
import java.util.List;

class Solution {
    public char findTheDifference(String s, String t) {
        List<Character> chars = new ArrayList<>();
        for(int i = 0; i < t.length(); i++) {
            chars.add(t.charAt(i));
        }
        for(int i = 0; i < s.length(); i++) {
            chars.remove(Character.valueOf(s.charAt(i)));
        }
        return chars.get(0);
    }
}