class Solution {
    public String multiply(String num1, String num2) {
        
        long resp = Long.parseLong(num1) * Long.parseLong(num2);
        System.out.println(resp);
        return String.valueOf(resp);
    }

    public static void main(String[] args) {
        long num1 = 498828660196L, num2 = 840477629533L;
        long num3 = num1 * num2;
        System.out.println(num3);
    }
}