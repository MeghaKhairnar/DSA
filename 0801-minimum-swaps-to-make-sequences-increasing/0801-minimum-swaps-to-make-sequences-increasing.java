
class Solution {
    public int minSwap(int[] nums1, int[] nums2) {
        int n = nums1.length;

        int keep = 0;
        int swap = 1;

        for (int i = 1; i < n; i++) {
            int keepNext = Integer.MAX_VALUE;
            int swapNext = Integer.MAX_VALUE;

            // Case 1: No crossing is needed
            if (nums1[i] > nums1[i - 1] &&
                nums2[i] > nums2[i - 1]) {

                keepNext = Math.min(keepNext, keep);
                swapNext = Math.min(swapNext, swap + 1);
            }

            // Case 2: Cross comparison
            if (nums1[i] > nums2[i - 1] &&
                nums2[i] > nums1[i - 1]) {

                keepNext = Math.min(keepNext, swap);
                swapNext = Math.min(swapNext, keep + 1);
            }

            keep = keepNext;
            swap = swapNext;
        }

        return Math.min(keep, swap);
    }
}
