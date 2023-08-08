import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> countSmaller(int[] nums) {
        List<Integer> resp = new ArrayList<>();
        int[] count = new int[nums.length];
        int[] indexes = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            indexes[i] = i;
        }

        mergeSort(nums, indexes, count, 0, nums.length - 1);

        for (int i = 0; i < count.length; i++) {
            resp.add(count[i]);
        }

        return resp;
    }

    private static void mergeSort(int[] nums, int[] indexes, int[] count, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        mergeSort(nums, indexes, count, start, mid);
        mergeSort(nums, indexes, count, mid + 1, end);
        merge(nums, indexes, count, start, mid, end);
    }

    private static void merge(int[] nums, int[] indexes, int[] count, int start, int mid, int end) {
        int[] mergedIndexes = new int[end - start + 1];
        int left = start;
        int right = mid + 1;
        int rightCount = 0;
        int mergeIndex = 0;

        while (left <= mid && right <= end) {
            if (nums[indexes[right]] < nums[indexes[left]]) {
                mergedIndexes[mergeIndex] = indexes[right];
                rightCount++;
                right++;
            } else {
                mergedIndexes[mergeIndex] = indexes[left];
                count[indexes[left]] += rightCount;
                left++;
            }
            mergeIndex++;
        }

        while (left <= mid) {
            mergedIndexes[mergeIndex] = indexes[left];
            count[indexes[left]] += rightCount;
            left++;
            mergeIndex++;
        }

        while (right <= end) {
            mergedIndexes[mergeIndex++] = indexes[right++];
        }

        System.arraycopy(mergedIndexes, 0, indexes, start, end - start + 1);
    }

}