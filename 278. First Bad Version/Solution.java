/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int resp = 0;
            for (int i = 0; i < n; i++) {
                if(isBadVersion(n) == true){
                    resp = i;
                    return resp;
                }
            }
            return resp + 1;
        }

        public static void main(String[] args) {
             
        }
    }