class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, 0 , target, result , new ArrayList<>());
        return result;
    }
    public void helper(int[] nums , int idx , int target , List<List<Integer>> result , ArrayList<Integer> curr){
        if(target == 0){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i = idx; i < nums.length; i++){
            if(i > idx && nums[i] == nums[i-1]) continue;
            if(target < nums[i]) break;
            curr.add(nums[i]);
            helper(nums , i+1, target-nums[i], result, curr);
            curr.remove(curr.size() - 1);
        }
    }
}