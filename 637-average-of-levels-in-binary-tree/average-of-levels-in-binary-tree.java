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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

    while(!queue.isEmpty()){
       int n = queue.size();
       double sum = 0;
       for(int i = 1; i <= n; i++){
        TreeNode front = queue.poll();
        sum += front.val;
       
       if(front.left != null) queue.add(front.left);
       if(front.right != null) queue.add(front.right);
       }
        ans.add(sum/n);
    }
    return ans;
   }
}