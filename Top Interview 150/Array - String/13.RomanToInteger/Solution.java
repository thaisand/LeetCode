class Solution {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int resp = romanToInt(s);
    }

    public static int romanToInt(String s) {
        int soma = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                if (i != (s.length() - 1)) {
                    if (s.charAt(i + 1) == 'V') {
                        i++;
                        soma += 4;
                    } else if (s.charAt(i + 1) == 'X') {
                        i++;
                        soma += 9;
                    } else if ((s.charAt(i + 1) == 'L')) {
                        i++;
                        soma += 49;
                    } else if ((s.charAt(i + 1) == 'C')) {
                        i++;
                        soma += 99;
                    } else if ((s.charAt(i + 1) == 'D')) {
                        i++;
                        soma += 499;
                    } else if ((s.charAt(i + 1) == 'M')) {
                        i++;
                        soma += 999;
                    } else {
                        soma += 1;
                    }
                } else {
                    soma += 1;
                }
            } else if (s.charAt(i) == 'V') {
                if (i != (s.length() - 1)) {
                    if (s.charAt(i + 1) == 'X') {
                        i++;
                        soma += 5;
                    } else if ((s.charAt(i + 1) == 'L')) {
                        i++;
                        soma += 45;
                    } else if ((s.charAt(i + 1) == 'C')) {
                        i++;
                        soma += 95;
                    } else if ((s.charAt(i + 1) == 'D')) {
                        i++;
                        soma += 495;
                    } else if ((s.charAt(i + 1) == 'M')) {
                        i++;
                        soma += 995;
                    } else {
                        soma += 5;
                    }
                } else {
                    soma += 5;
                }
            } else if (s.charAt(i) == 'X') {
                if (i != (s.length() - 1)) {
                    if ((s.charAt(i + 1) == 'L')) {
                        i++;
                        soma += 40;
                    } else if ((s.charAt(i + 1) == 'C')) {
                        i++;
                        soma += 90;
                    } else if ((s.charAt(i + 1) == 'D')) {
                        i++;
                        soma += 490;
                    } else if ((s.charAt(i + 1) == 'M')) {
                        i++;
                        soma += 990;
                    } else {
                        soma += 10;
                    }
                } else {
                    soma += 10;
                }
            } else if (s.charAt(i) == 'L') {
                if (i != (s.length() - 1)) {
                    if ((s.charAt(i + 1) == 'C')) {
                        i++;
                        soma += 50;
                    } else if ((s.charAt(i + 1) == 'D')) {
                        i++;
                        soma += 450;
                    } else if ((s.charAt(i + 1) == 'M')) {
                        i++;
                        soma += 950;
                    } else {
                        soma += 50;
                    }
                } else {
                    soma += 50;
                }
            } else if (s.charAt(i) == 'C') {
                if (i != (s.length() - 1)) {
                    if ((s.charAt(i + 1) == 'D')) {
                        i++;
                        soma += 400;
                    } else if ((s.charAt(i + 1) == 'M')) {
                        i++;
                        soma += 900;
                    } else {
                        soma += 100;
                    }
                } else {
                    soma += 100;
                }
            } else if (s.charAt(i) == 'D') {
                if (i != (s.length() - 1)) {
                    if ((s.charAt(i + 1) == 'M')) {
                        i++;
                        soma += 500;
                    } else {
                        soma += 500;
                    }
                } else {
                    soma += 500;
                }
            }
            else if (s.charAt(i) == 'M') {
                soma += 1000;
            }
        }

        System.out.println(soma);
        return soma;
    }
}
