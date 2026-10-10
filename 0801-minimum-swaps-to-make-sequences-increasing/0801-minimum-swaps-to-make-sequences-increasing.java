class Solution {
    public int minSwap(int[] nums1, int[] nums2) {
        int n = nums1.length;

        int keep = 0;
        int swap = 1;
        for(int i=1;i<n;i++)
        {
            int keepnext = Integer.MAX_VALUE;
            int swapnext = Integer.MAX_VALUE;

            if(nums1[i] > nums1[i-1] && 
            nums2[i] > nums2[i-1])
            {
                keepnext = Math.min(keepnext,keep);
                swapnext = Math.min(swapnext,swap+1);
                
            }
             if(nums1[i] > nums2[i-1] && 
            nums2[i]> nums1[i-1])
            {
                keepnext = Math.min(keepnext,swap);
                swapnext = Math.min(swapnext,keep+1);
                
                
            }
            keep = keepnext;
             swap = swapnext;
        }
        return Math.min(keep,swap);
        
    }
}