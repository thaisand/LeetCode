class Solution {
    public static String reverseWords(String s) {
        String resp = new String();
        s = s.replaceAll("\\s+", " ");
        System.out.println(s);
        String[] partes = s.split(" ");
        for (int i = partes.length - 1; i >= 0; i--) {
            resp += partes[i]; 
            resp += " ";
        }
        resp = resp.trim();
        return resp;
    }

    public static void main(String[] args) {
        String word1 = "the sky is blue";
        System.out.println(reverseWords(word1));
    }
}