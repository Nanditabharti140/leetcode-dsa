class Solution {

    public List<List<Integer>> sub(int[] nums, int index) {
        List<List<Integer>> ans = new ArrayList<>();
        if (index == nums.length) {
            ans.add(new ArrayList<>()); // empty subset
            return ans;
        }
        List<List<Integer>> smallAns = sub(nums, index + 1);

        for (List<Integer> ss : smallAns) {

            // Case 1: exclude current element
            ans.add(new ArrayList<>(ss));

            // Case 2: include current element
            List<Integer> newSubset = new ArrayList<>(ss);
            newSubset.add(nums[index]);
            ans.add(newSubset);
        }

        return ans;
    }

    public List<List<Integer>> subsets(int[] nums) {
        return sub(nums, 0);
    }
}
