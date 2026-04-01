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
class pair{
    TreeNode node;
    int level;
    pair(TreeNode node, int level){
        this.node = node;
        this.level = level;
    }
 }
class Solution {
    static TreeNode target;
    static HashMap<TreeNode,TreeNode> parent;
    public int amountOfTime(TreeNode root, int start) {
        target = null;
        parent = new HashMap<>();
        dfs(root,start);
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(target,0));
        HashSet<TreeNode> burned = new HashSet<>();
        burned.add(target);
        int time = 0;
        while(q.size() > 0){
            pair front = q.remove();
            int level = front.level;
            time = Math.max(time,level);
            TreeNode node = front.node;
            if(node.left != null && !burned.contains(node.left)){
                q.add(new pair(node.left,level+1));
                burned.add(node.left);
            }
            if(node.right != null && !burned.contains(node.right)){
                q.add(new pair(node.right,level+1));
                burned.add(node.right);
            }
            if(parent.containsKey(node) && !burned.contains(parent.get(node))){
                q.add(new pair(parent.get(node), level+1));
                burned.add(parent.get(node));
            }
        }
        return time;
    }
    private static void dfs(TreeNode root, int start){
        if(root == null) return;
        if(root.val == start) target = root;
        if(root.left != null) parent.put(root.left,root);
        if(root.right != null) parent.put(root.right,root);
        dfs(root.left,start);
        dfs(root.right,start);
    }
}