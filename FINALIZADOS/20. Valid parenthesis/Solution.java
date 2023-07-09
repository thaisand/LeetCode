class Solution {
    public static void main(String[] args) {
        String entrada = "[([]])";
        isValid(entrada);
    }

    public static boolean isParClosed(String s, int pos) {
        boolean resp = false;
        if(s.charAt(pos + 1) == '(' || s.charAt(pos + 1) == '[' || s.charAt(pos + 1) == '{'){
            isParClosed(s, pos+1);
        }
        else if(s.charAt(pos + 1) == ')') {
            resp = true; 
        }
        else { 
            resp = false; 
        }
        return resp;
    }

    public static boolean isValid(String s) {
        int parentesis = 0, colchetes = 0, chaves = 0;
        boolean resp = true;
        int pos = 0, posOrdem = 0;
        char[] ordem = new char[10]; 
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                parentesis++;
                ordem[posOrdem++] = 'p';
                if (i != s.length() - 1) {
                    if (s.charAt(i + 1) == ']' || s.charAt(i + 1) == '}') {
                        resp = false;
                    }
                }
            } else if (s.charAt(i) == '[') {
                chaves++;
                ordem[posOrdem++] = 'a';
                if (i != s.length() - 1) {
                    if (s.charAt(i + 1) == ')' || s.charAt(i + 1) == '}') {
                        resp = false;
                    }
                }
            } else if (s.charAt(i) == '{') {
                colchetes++;
                ordem[posOrdem++] = 'o';
                if (i != s.length() - 1) {
                    if (s.charAt(i + 1) == ')' || s.charAt(i + 1) == ']') {
                        resp = false;
                    }
                }
            } else if (s.charAt(i) == ')') {
                if(parentesis < 1) {
                    resp = false;
                }
                parentesis--;
            } else if (s.charAt(i) == ']') {
                if(chaves < 1) {
                    resp = false;
                }
                chaves--;
            } else if (s.charAt(i) == '}') {
                if(colchetes < 1) {
                    resp = false;
                }
                colchetes--;
            }
        }
        for(int i = 0; i < (s.length() / 2); i++){
            
        }

        if (parentesis != 0 || chaves != 0 || colchetes != 0) {
            resp = false;
        }
        //System.out.println(resp);
        return resp;
    }
}