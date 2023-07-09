import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        String line = new String();
        boolean resp = true; 

        num = sc.nextInt();
        line = Integer.toString(num);
        resp = isPalindrome(line);
        if(resp == true) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    public static boolean isPalindrome(String line) {
        boolean resp = true; 
        int j = line.length() - 1;

        for(int i = 0; i < line.length(); i++, j--) {
            if(line.charAt(i) != line.charAt(j)) {
                resp = false;
            }
        }
        return resp;
    }
}