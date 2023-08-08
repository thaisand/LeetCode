class Solution {
    public static int lengthOfLongestSubstring(String s) {
        boolean aux = true; 
        int resp = 0; 
        String maiorAteAgora = new String();
        int i = 0; 
        while(aux == true && i < s.length()) {
                       
            System.out.println(maiorAteAgora);
            if(s.contains(maiorAteAgora)) {
                if(maiorAteAgora.indexOf(s.charAt(i)) == -1) {
                    maiorAteAgora += s.charAt(i);
                    i++;
                    System.out.println(maiorAteAgora);
                }
                aux = true; 
            }
            else {
                aux = false; 
            }
        }
        resp = maiorAteAgora.length();
        System.out.println(resp);
        return resp; 
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int resp = lengthOfLongestSubstring(s);
    }

}