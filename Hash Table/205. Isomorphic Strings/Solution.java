class Solution {
    public static boolean isIsomorphic(String s, String t) {
        boolean resp = true;
        char cs = ' ', ct = ' ';
        if (s.length() != t.length()) {
            resp = false;
        } else {
            HashMap<Character, Character> letters = new HashMap<Character, Character>();

            for (int i = 0; i < s.length(); i++) {
                cs = s.charAt(i);
                ct = t.charAt(i);
                if (letters.containsKey(cs)) {
                    if (letters.get(cs) != ct) {
                        resp = false;
                    }
                }  
                else if(letters.containsValue(ct)){
                    resp = false; 
                } else{
                        letters.put(cs, ct);
                }
            }
            //System.out.println(letters);
        }
        return resp;
    }
}
