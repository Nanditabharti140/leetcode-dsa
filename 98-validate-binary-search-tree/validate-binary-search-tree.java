class Solution {
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        boolean flag = true;
        for(int i =0; i<ans.size()-1; i++){
            if(ans.get(i) >= ans.get(i+1)) flag = false;
        }
        return flag;
    }
    public void inorder(TreeNode root, ArrayList<Integer> ans){
        if(root == null) return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
}