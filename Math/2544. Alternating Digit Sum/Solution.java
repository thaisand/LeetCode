class Solution {
    public int alternateDigitSum(int n) {
        String aux = Integer.toString(n);
        String aux2;
        int resp = 0; 
        for(int i = 0; i < aux.length(); i++) {
            aux2 = String.valueOf(aux.charAt(i));
            if(i%2 == 0) {
                resp += Integer.parseInt(aux2);
            } else {
                resp -= Integer.parseInt(aux2);
            }
        }
        return resp;
    }
}
