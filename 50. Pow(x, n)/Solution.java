class Solution {
    public double myPow(double x, int n) {
        double resp = 1;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                resp = resp * x;
            }
        } else if (n == 0) {
            resp = 1;
        } else {
            for (int i = -1; i >= n; i--) {
                resp = resp / x;
            }
        }
        return resp;
    }



}