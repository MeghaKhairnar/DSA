class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,0,ans,new ArrayList<>());
        return ans;

        
    }
    public static void backtrack(int [] nums,int start,List<List<Integer>>ans,List<Integer> temp)
    {
        ans.add(new ArrayList<>(temp));
        
        for(int i=start;i<nums.length;i++)
        {
            if(i > start && nums[i]==nums[i-1])
        {
            continue;
        }
            // pick
            temp.add(nums[i]);
            // explore
            backtrack(nums,i+1,ans,temp);
            // not pick
            temp.remove(temp.size()-1);
        }
    }
}