class Solution {
    public List<List<Integer>> subsets(int[] nums)
       {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums,0,ans,new ArrayList<>());
        return ans;
        }

    public void backtrack(int [] nums, int start,List<List<Integer>>ans,List<Integer>temp)
    {
         // base case
         ans.add(new ArrayList<>(temp));
         // traverse 
         for(int i=start;i<nums.length;i++)
         {
            // pick
            temp.add(nums[i]);

            // explore
            backtrack(nums,i+1,ans,temp);

            // not pick
            temp.remove(temp.size()-1);

         }

         

    }
}