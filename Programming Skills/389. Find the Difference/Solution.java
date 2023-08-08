import java.util.ArrayList;
import java.util.List;

class Solution {
    public char findTheDifference(String s, String t) {
        List<Character> arrayT = new ArrayList<>();
        if (s.length() > 1) {
            
            for (char c : t.toCharArray()) {
                arrayT.add(c);
            }
            for (int i = 0; i < s.length(); i++) {
                
                    System.out.println("s.charAt(i)= " + s.charAt(i) + " , i= " + i);
                    if (arrayT.contains(s.charAt(i))) {
                        arrayT.remove(s.charAt(i));
                    }
                
            }
        }
        return arrayT.get(0);
    }
}