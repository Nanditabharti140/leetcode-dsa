import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int c = nums.length/2;
        int i = 0;
        int count = 0;
        int ans = nums[0];
        for(int j = 0; j < nums.length; j++){
            if(nums[i] == nums[j]){
                count++;
                if(count > c)  return nums[i];
            }
            else{
                count = 1;
                i = j;
            }
        }
        return ans;
    }
}