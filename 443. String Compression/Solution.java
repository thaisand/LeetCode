import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
    public int compress(char[] chars) {
        HashMap<Character, Integer> mapa = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (!mapa.containsKey(chars[i])) {
                mapa.put(chars[i], 1);
            } else {
                int getQuant = mapa.get(chars[i]);
                mapa.put(chars[i], getQuant + 1);
            }
        }

        StringBuilder resp = new StringBuilder();
        for (Entry<Character, Integer> entry : mapa.entrySet()) {
            char chave = entry.getKey();
            int valor = entry.getValue();
            resp.append(chave);
            resp.append(valor);
        }

        System.out.println(resp.toString()); // Imprime a string comprimida
        return resp.length(); // Retorna o tamanho da string comprimida
    }

    public static void main(String[] args) {
        Solution  exemplo = new Solution();
        char[] chars = {'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c', 'c'};
        int tamanhoComprimido = exemplo.compress(chars);
        System.out.println("Tamanho comprimido: " + tamanhoComprimido);
    }
}
