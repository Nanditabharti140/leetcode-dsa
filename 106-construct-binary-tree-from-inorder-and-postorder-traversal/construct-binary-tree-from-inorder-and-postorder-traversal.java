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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return build(0,n-1,0,n-1,inorder,postorder);
    }
    public TreeNode build(int ilo, int ihi, int plo, int phi, int[] inorder, int[] postorder){
        if(ilo > ihi || plo > phi) return null;
        int val = postorder[phi];
        TreeNode root = new TreeNode(val);
        int r = 0;
        for(int i =ilo; i<=ihi; i++){
            if(inorder[i] == val){
                r = i;
                break;
            }
        }
        int cnt = r  - ilo;
        root.left = build(ilo, r-1, plo, plo+cnt-1, inorder, postorder);
        root.right = build(r+1, ihi, plo+cnt, phi-1, inorder, postorder);
        return root;
    }
}