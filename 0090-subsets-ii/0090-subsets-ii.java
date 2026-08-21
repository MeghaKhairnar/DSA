class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       Arrays.sort(nums);
       List<List<Integer>> ans = new ArrayList<>();
       helper(nums,0,ans,new ArrayList<>());
       return ans;
    }

    public static void helper(int[] nums, int i,  List<List<Integer>> ans, List<Integer> partial){
        if(i==nums.length){
         ans.add(new ArrayList<>(partial));
         return;
        }

        //choose 
        partial.add(nums[i]);
        helper(nums,i+1,ans,partial);
        partial.remove(partial.size()-1);


        // not pick
        int k = i+1;
        while(k < nums.length && nums[k] == nums[i]){
            k++;
        }

        helper(nums,k,ans,partial);
    }
}