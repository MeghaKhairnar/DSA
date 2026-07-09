class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target)
     {

        List<List<Integer>> ans = new ArrayList<>();
        backtrack(candidates,target,0,new ArrayList<>(),ans);
        return ans;

        
    }

    public void backtrack(int[] candidates,int target,int index,List<Integer> temp,List<List<Integer>> ans)
    {
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        if( target < 0|| index==candidates.length)
        {
            return;
        }
       // in temp list elements are added
        temp.add(candidates[index]);

        // include element
        backtrack(candidates,target-candidates[index],index,temp,ans);
        temp.remove(temp.size()-1);

        // exclude element
        backtrack(candidates,target,index+1,temp,ans);

        


    }
}