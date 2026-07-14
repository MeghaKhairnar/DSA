class Solution {
    public int maxSum(int[] nums) {
        int ans = -1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (largestDigit(nums[i]) == largestDigit(nums[j])) {
                    ans = Math.max(ans, nums[i] + nums[j]);
                }
            }
        }

        return ans;
    }

    public int largestDigit(int num) {
        int max = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit > max) {
                max = digit;
            }

            num = num / 10;
        }

        return max;
    }
}