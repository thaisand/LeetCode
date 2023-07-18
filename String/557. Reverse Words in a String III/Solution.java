class Solution {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        String aux = new String();
        String resp = new String();
        for (String word : words) {
            aux = reverse(word);
            resp += (aux + " ");
        }
        resp = resp.substring(0, resp.length() - 1);
        System.out.println(resp);
        return resp;
    }

    public static String reverse(String word) {
        char[] wordToChar = word.toCharArray();
        int tam = word.length() - 1;
        for(int i = 0; i < (word.length() / 2); i++) {
            char tmp = wordToChar[i];
            wordToChar[i] = wordToChar[tam];
            wordToChar[tam] = tmp;
            tam--;
        }
        String resp = new String();
        for(int i = 0; i < wordToChar.length; i++) {
            resp += wordToChar[i];
        }
        return resp;
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        reverseWords(s);
    }
}
