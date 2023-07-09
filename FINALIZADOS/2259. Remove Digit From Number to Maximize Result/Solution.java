class Solution {

    public String removeDigit(String number, char digit) {
        int last = number.lastIndexOf(digit);
        int index = 0, i = 0; 
        while (index != last) {
            index = number.indexOf(digit, i++);
        }
        String[] aux = new String[i+1];
        for(int j = 1; j <= i+1; j++) {
            for(int x = 0; x < )
        }

        return "resp";
    }


    public static void main(String[] args) {

    }
}