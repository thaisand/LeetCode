class Solution {
    public static int totalMoney(int n) {
        int resp = 0, segunda = 0, feiras = 0;
        for (int i = 0; i < n; i++) {
            if (((i % 7) == 0) || (i == 0)) {
                segunda++;
                resp += segunda;
                feiras = segunda;
                //System.out.println("segunda, resp: " + segunda + " " + resp);
            }
            else { 
                feiras++;
                resp += feiras;
                //System.out.println("feiras, resp: " + feiras + " " + resp);
            }
        }
        return resp;
    }

    public static void main(String[] args) {
        int n = 20;
        //System.out.println(totalMoney(n));
    }
}