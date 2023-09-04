import java.util.ArrayList;

class Solution {
    public static String reverseVowels(String s) {
        ArrayList<Integer> posicoesVogais = new ArrayList<Integer>();
        ArrayList<Character> listaVogais = new ArrayList<Character>();
        
        String vogais = "aeiouAEIOU";
        String resp = new String();
        for(int i = 0; i < s.length(); i++) {
            if (vogais.contains(Character.toString(s.charAt(i)))) {
                posicoesVogais.add(1);
                listaVogais.add(s.charAt(i));
            } else {
                posicoesVogais.add(0);
            }
        }
        int numVogais = listaVogais.size();
        numVogais--;
        for(int i = 0; i < s.length(); i++) {
            if(posicoesVogais.get(i) == 1) {
                resp += listaVogais.get(numVogais--);
            } else {
                resp += s.charAt(i);
            }
        }
        return resp;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }
}