class Solution {
    public static String mergeAlternately(String word1, String word2) {
        String resp = new String();
        int maior, menor;
        if (word2.length() > word1.length()) {
            maior = word2.length();
            menor = word1.length();
            for (int i = 0; i < maior; i++) {
                if (i < menor) {
                    resp += word1.charAt(i);
                    resp += word2.charAt(i);
                } else {
                    resp += word2.charAt(i);
                }
            }
        } else {
            menor = word2.length();
            maior = word1.length();
            for (int i = 0; i < maior; i++) {
                if (i < menor) {
                    resp += word1.charAt(i);
                    resp += word2.charAt(i);
                } else {
                    resp += word1.charAt(i);
                }
            }
        }
        return resp;
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }
}