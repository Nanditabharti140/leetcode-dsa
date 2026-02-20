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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        return build(0,n-1,0,n-1,inorder,preorder);
    }
    public TreeNode build(int ilo, int ihi, int plo, int phi, int[] inorder, int[] preorder){
        if(ilo > ihi || plo > phi) return null;
        int val = preorder[plo];
        TreeNode root = new TreeNode(val);
        int r = 0;
        for(int i =ilo; i<=ihi; i++){
            if(inorder[i] == val){
                r = i;
                break;
            }
        }
        int cnt = r  - ilo;
        root.left = build(ilo, r-1, plo+1, plo+cnt, inorder, preorder);
        root.right = build(r+1, ihi, plo+cnt+1, phi, inorder, preorder);
        return root;
    
    }
}