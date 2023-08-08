import java.util.HashMap;
import java.util.Objects;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashS = new HashMap<>();
        HashMap<Character, Integer> hashT = new HashMap<>();
        if (s.length() == t.length()) {
            for (int i = 0; i < s.length(); i++) {
                char currentChar = s.charAt(i);
                hashS.put(currentChar, hashS.getOrDefault(currentChar, 1) + 1);
                currentChar = t.charAt(i);
                hashT.put(currentChar, hashT.getOrDefault(currentChar, 1) + 1);
            }
            boolean resp = areEqual(hashS, hashT);
            return resp;
        } else {
            return false;
        }

    }

        public static boolean areEqual(HashMap<?, ?> map1, HashMap<?, ?> map2) {
        if (map1.size() != map2.size()) {
            return false;
        }

        for (Object key : map1.keySet()) {
            if (!map2.containsKey(key)) {
                return false;
            }

            if (!Objects.equals(map1.get(key), map2.get(key))) {
                return false;
            }
        }

        return true;
    }
}