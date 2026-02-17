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
    public void flatten(TreeNode root) {
        ArrayList<TreeNode> arr = new ArrayList<>();
    
        dfs(root,arr);
        for(int i = 0; i<arr.size()-1; i++){
            TreeNode a = arr.get(i);
            TreeNode b = arr.get(i+1);
            a.right = b;
            a.left = null;
        }
        if(arr.size() > 1){
        TreeNode last = arr.get(arr.size() - 1);
        last.left = null;
        last.right = null;
        }
    }
    private static void dfs(TreeNode root,  ArrayList<TreeNode> arr){
        if(root == null) return;
        arr.add(root);
        dfs(root.left,arr);
        dfs(root.right,arr);
    }
}