class Solution {
    public static void main(String[] args) {
        String entrada = "()";
        isValid(entrada);
    }

    public static boolean isValid(String s) {
        int parentesis = 0, colchetes = 0, chaves = 0;
        boolean resp = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                parentesis++;
                if (i != s.length() - 1) {
                    if (s.charAt(i + 1) == ']' || s.charAt(i + 1) == '}') {
                        resp = false;
                    }
                }
            } else if (s.charAt(i) == '[') {
                chaves++;
                if (i != s.length() - 1) {
                    if (s.charAt(i + 1) == ')' || s.charAt(i + 1) == '}') {
                        resp = false;
                    }
                }
            } else if (s.charAt(i) == '{') {
                colchetes++;
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
        if (parentesis != 0 || chaves != 0 || colchetes != 0) {
            resp = false;
        }
        //System.out.println(resp);
        return resp;
    }
}