class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int tam1 = nums1.length, tam2 = nums2.length;
        int[] merged = new int[tam1+tam2];

        int pos1 = 0, pos2 = 0, posMerged = 0; 
        boolean aux = true;
        while(aux) {
            if(pos1 < nums1.length && pos2 < nums2.length) {
                if (nums1[pos1] < nums2[pos2]) {
                    merged[posMerged++] = nums1[pos1++];
                } else if (nums1[pos1] > nums2[pos2]) {
                    merged[posMerged++] = nums2[pos2++];
                } else {
                    merged[posMerged++] = nums1[pos1++];
                    merged[posMerged++] = nums2[pos2++];
                }
            } else if(pos1 < nums1.length && pos2 >= nums2.length) {
                merged[posMerged++] = nums1[pos1++];
            } else if(pos1 >= nums1.length && pos2 < nums2.length) {
                merged[posMerged++] = nums2[pos2++]; 
            } else {
                aux = false;
            }
        }
        double resp = 0;
        if(merged.length%2 == 0) {      
            int auxResp = merged[merged.length/2] + merged[(merged.length/2 - 1)];
            resp = (double)auxResp / 2;
        } else {
            resp = merged[merged.length/2];
        }
        return resp;

    }

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}