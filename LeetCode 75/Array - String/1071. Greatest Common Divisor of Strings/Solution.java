class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        // Encontra o comprimento mínimo entre str1 e str2
        int minLen = Math.min(len1, len2);

        // Itera de trás para frente até 1
        for (int i = minLen; i > 0; i--) {
            // Verifica se uma substring de tamanho i divide ambos str1 e str2
            if (len1 % i == 0 && len2 % i == 0) {
                String substring = str1.substring(0, i);
                
                // Verifica se a substring divide str1 e str2 corretamente
                if (substring.repeat(len1 / i).equals(str1) && substring.repeat(len2 / i).equals(str2)) {
                    return substring;
                }
            }
        }

        // Caso não haja uma substring que divide ambos os strings
        return "";
    }
}
