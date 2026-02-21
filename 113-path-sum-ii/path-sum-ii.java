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
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        if(root == null) return result;
        helper(root,result,ans,targetSum);
        return result;
    }
    public void helper(TreeNode root, List<List<Integer>> result, List<Integer> ans, int targetSum){
        if(root == null) return;
        ans.add(root.val);
        if(root.left == null && root.right == null){
            if(targetSum == root.val){
                result.add(new ArrayList<>(ans));
            }
        }
        helper(root.left ,result, ans, targetSum-root.val);
        helper(root.right, result, ans, targetSum-root.val);
        ans.remove(ans.size() - 1);
    }
}