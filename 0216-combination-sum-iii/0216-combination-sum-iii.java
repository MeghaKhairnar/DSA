class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(1, k, n, ans, new ArrayList<>());

        return ans;
    }

    public static void backtrack(
        int start,
        int k,
        int target,
        List<List<Integer>> ans,
        List<Integer> temp)
    {
        // Base case
        if(temp.size() == k && target == 0)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }

        // Stop condition
        if(temp.size() >= k || target < 0)
        {
            return;
        }

        for(int i = start; i <= 9; i++)
        {
            // Pick
            temp.add(i);

            // Explore
            backtrack(i + 1, k, target - i, ans, temp);

            // Backtrack
            temp.remove(temp.size() - 1);
        }
    }
}