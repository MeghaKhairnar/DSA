class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0)
        {
            return 0;
        }
        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        int count = 0;
        int n = nums.length;
        // traverse right upto the end 
        while(right < n)
        { 
            if(left==right)
            {
                right++;
                continue;
            }
            int diff = nums[right] - nums[left];
            if(diff==k)
            {
                left++;
                right++;
                count++;

                // skip duplicates 
                while(right < n && nums[right]==nums[right-1])
                right++;

                while(left < n && nums[left]==nums[left-1])
                left++;
            }
            else if(diff < k)
            {
                right++;
            }
            else
            {
                left++;
            }


        }
        return count;
        
    }
}