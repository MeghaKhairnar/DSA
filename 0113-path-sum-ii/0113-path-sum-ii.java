/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(root,targetSum,ans,new ArrayList<>());
        return ans;
        
    }
    public void backtrack(TreeNode root, int targetSum,List<List<Integer>> ans ,List<Integer> temp)
    {
        if(root==null)
        {
            return;
        }
        temp.add(root.val);
        // check leaf node(here we are checking only leaf node) 
        if(root.left==null && root.right==null && targetSum - root.val== 0 )
        {
            ans.add(new ArrayList<>(temp));
        }
        // check intermediate nodes by recursively calling the function 
        backtrack(root.left,targetSum-root.val,ans,temp);
        backtrack(root.right,targetSum-root.val,ans,temp);

        // backtrack
        temp.remove(temp.size()-1);



    }
}