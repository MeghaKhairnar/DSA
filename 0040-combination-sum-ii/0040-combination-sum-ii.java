class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates,0,target,ans,new ArrayList<>());
        return ans;

        
    }
    public static void backtrack(int[] candidates,int start,int target,List<List<Integer>> ans,List<Integer>temp)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(temp));
        }
        if(target < 0)
        {
            return;
        }
        for(int i=start;i<candidates.length;i++)
        {
             if(i>start && candidates[i]==candidates[i-1])
             {
                continue;
             }
             if(candidates[i] > target)
             {
                break;
             }
             // pick
             temp.add(candidates[i]);
             // recursively call function
             backtrack(candidates,i+1,target-candidates[i],ans,temp);
             // not pick
             temp.remove(temp.size()-1);
        }

    }
}