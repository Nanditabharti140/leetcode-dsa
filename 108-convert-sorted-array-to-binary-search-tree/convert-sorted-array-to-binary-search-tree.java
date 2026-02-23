class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        return bst(nums,0,n-1);
    }
    public TreeNode bst(int[] nums, int low, int high){
        if(low > high) return null;
        int mid = (low+high)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = bst(nums,low,mid-1);
        root.right = bst(nums,mid+1,high);
        return root;
    }
}