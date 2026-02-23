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
    public int rangeSumBST(TreeNode root, int l, int h) {
        if(root == null) return 0;
        if(root.val < l) return rangeSumBST(root.right, l ,h);
        else if(root.val > h) return rangeSumBST(root.left, l ,h);
        return root.val + rangeSumBST(root.left,l,h)+ rangeSumBST(root.right,l ,h);
    }
}