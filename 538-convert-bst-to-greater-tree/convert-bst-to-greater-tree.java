class Solution {
    static int sum;
    public TreeNode convertBST(TreeNode root) {
        sum = 0;
       revInorder(root);
       return root;
    }
    public void revInorder(TreeNode root){
        if(root == null) return;
        revInorder(root.right);
        sum += root.val;
        root.val = sum;
        revInorder(root.left);
    }
}