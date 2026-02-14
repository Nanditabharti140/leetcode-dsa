class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left+right)/2;
        if(target == nums[mid]) return mid;
        while(left<right && nums[mid] != target){
            mid = (left+right)/2;
            if(nums[mid] == target) return mid;
            else if(target > nums[mid]) left++;
            else right--;
        }
        if(target > nums[left] && target < nums[right]) return right;
        if(target > nums[right]) return right+1;
        return right;
        
    }
}