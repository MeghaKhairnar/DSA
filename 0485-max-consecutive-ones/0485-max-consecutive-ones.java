class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = 0;
        int right = 0;
        int max = 0;
        while(right < nums.length)
        {
            if(nums[right]==1)
            {
                int count = right - left +1;
                max = Math.max(max,count);
                right++;
            }
            else
            {
                right++;
                left = right;
            }
        }
        return max;
    }
}