class Solution {
    public int removeDuplicates(int[] nums) {
        int x=0;
        for(int i=1;i<nums.length;i++){
            if(nums[x] != nums[i]){
                x += 1;
                nums[x] = nums[i];
            }
        }
        return x+1;
    }
}