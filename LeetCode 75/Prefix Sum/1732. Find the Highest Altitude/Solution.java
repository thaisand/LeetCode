class Solution {
    public int largestAltitude(int[] gain) {
        int[] alt = new int[gain.length + 1];
        alt[0] = 0;
        int altitude = 0, highest = 0;  
        for(int i = 0; i < gain.length; i++) {
            altitude += gain[i];
            alt[i+1] = altitude;
            if(altitude > highest) {
                highest = altitude;
            }
        }
        return highest;
    }
}