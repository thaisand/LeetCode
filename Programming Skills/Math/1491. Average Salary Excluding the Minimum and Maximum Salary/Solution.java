class Solution {
    public double average(int[] salary) {
        int min = 999999, max = 0; 
        double sum = 0.00;
        for(int i = 0; i < salary.length; i++) {
            sum += salary[i];
            if(salary[i] < min) {
                min = salary[i];
            } 
            if(salary[i] > max) {
                max = salary[i];
            }
            //System.out.println("min = " + min + " max = " + max);
            
        }
        sum = sum - min - max; 
        sum = sum / (salary.length - 2);
        return sum;
    }
}