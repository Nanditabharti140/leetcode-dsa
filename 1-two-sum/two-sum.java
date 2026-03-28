class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //               return new int[] {i,j};
        //         }
        //     }
        // }
        // return new int[] {};
        int n = nums.length;
        int[] ans = {-1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int partner = target - nums[i];
            if(map.containsKey(partner)){
                ans = new int[]{i , map.get(partner)};
                return ans;
            }
            else{
                map.put(nums[i], i);
            }
        }
        return ans;
    }
    
}