class Solution {
    public int lengthOfLastWord(String s) {
        String[] palavras = s.split(" ");
        return palavras[palavras.length - 1].length();
    }
}