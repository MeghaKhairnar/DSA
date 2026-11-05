class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 1;
        // start from beginning there is no element before the first element so we considet first element as 1
        for(int i=1; i<nums.length;i++)
        {
            // left to right
            left[i]=left[i-1]*nums[i-1];

        }

        // start from end as there is no element after the last element we consider last element as 1
        right[nums.length-1] =1;
        for(int i=nums.length-2;i>=0;i--)
        {
            right[i] = right[i+1]*nums[i+1];
        }

        // create answer array
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i] = left[i]*right[i];
        }
        
        return ans;
    }
}