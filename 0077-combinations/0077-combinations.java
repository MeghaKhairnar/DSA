class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(n,k,ans,new ArrayList<>());
        return ans;
        
    }
    public void backtrack(int n,int k,List<List<Integer>>ans,List<Integer>temp)
    {
        // base case
        if(k==0)
        {
            ans.add(new ArrayList<>(temp));
            return ;
        }
        if(n==0)
        {
            return;
        }
        // pick
        temp.add(n);
        backtrack(n-1,k-1,ans,temp);
        // not pick
        temp.remove(temp.size()-1);
        backtrack(n-1,k,ans,temp);


    }
}