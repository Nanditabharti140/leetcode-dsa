class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        boolean[] check = new boolean[n];
        helper(nums , n , result , new ArrayList<Integer>() , check);
        return result;
    }
    public void helper(int[] nums,int n , List<List<Integer>> result, ArrayList<Integer> ans , boolean[] check){
        if(ans.size() == n){
            result.add(new ArrayList<>(ans));
            return;
        }
        for(int i = 0 ; i < n ; i++){
            if(!check[i]){
                ans.add(nums[i]);
                check[i] = true;
                helper(nums , n , result , ans , check);
                ans.remove(ans.size() - 1);
                check[i] = false;
            }
        }
    }
}