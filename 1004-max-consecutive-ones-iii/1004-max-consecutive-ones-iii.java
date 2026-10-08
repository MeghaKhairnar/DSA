class Solution {
    public int longestOnes(int[] nums, int k) {
        int left =0;
        int right = 0;
        int zero = 0;
        int max = 0;
        while(right < nums.length)
        {
            if(nums[right]==0)
            {
                zero++;
            }
            while(zero > k)
         {
            if (nums[left]==0)
            {
                zero--;
            }
            left++;
           }
           int count = right - left +1;
            max =Math.max(max,count);
            right++;
        }
         return max;
    }
   
}