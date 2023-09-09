class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        //System.out.println(s);
        for(int i = 0, j = s.length() - 1; i < (s.length()/2); i++, j--) {
          //System.out.print(" i: " + i + " " + s.charAt(i) + " j: " + j + " " + s.charAt(j));
          if (s.charAt(i) != s.charAt(j)) {
            return false;
          }
        }
        return true; 
    }
}