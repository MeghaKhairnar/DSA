class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minWindow = Integer.MAX_VALUE;
        int currSum = 0;

        int low = 0;
        int high = 0;

        while(high<nums.length)
        {
            currSum += nums[high];
            high++;

            while(currSum >= target)
            {
            // Update the minimum window
            int currWindow = high-low;

            minWindow = Math.min(minWindow,currWindow);

            // if the sum is greater and we can reduce the window size start eliminating elements from left (low)

            currSum -= nums[low];
            low++;
            }

        }


        return minWindow == Integer.MAX_VALUE ? 0 : minWindow;
    }
}