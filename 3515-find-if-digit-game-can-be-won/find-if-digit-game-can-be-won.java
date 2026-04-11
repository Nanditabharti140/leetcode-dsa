class Solution {
    public boolean canAliceWin(int[] nums) {
        int n = nums.length;
        int lowSum = 0;
        int highSum = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] > 0 && nums[i] < 10) lowSum += nums[i];
            else highSum += nums[i];
        }
        if(lowSum > highSum || highSum > lowSum) return true;
        return false;
    }
}