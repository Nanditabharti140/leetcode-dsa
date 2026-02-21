class Solution {
    //there is a another optimised solution using stringbuilder
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) return result;
        
        helper(root, "", result);
        return result;
    }
    
    public void helper(TreeNode root, String path, List<String> result) {
        if (root == null) return;
        
        // If leaf node
        if (root.left == null && root.right == null) {
            result.add(path + root.val);
            return;
        }
        
        // Add current node to path and go deeper
        helper(root.left, path + root.val + "->", result);
        helper(root.right, path + root.val + "->", result);
    }
}