class Solution {
    public void reverse(int[] nums, int i , int j){
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        int n = nums.length;

        //Step 1. Find the pivot index
        for(int i = n-2 ; i >= 0; i-- ){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }

        // imp edge case
        if(pivot == -1){
            reverse(nums,0,n-1);
            return;
        }

        // Step 2. Reverse after pivot
        reverse(nums, pivot+1, n-1);

        // Step 3. Find next greator element after pivot index
        int idx = -1;
        for(int i = pivot+1; i < n; i++){
            if(nums[i] > nums[pivot]){
                idx = i;
                break;
            }
        }

        // Step 4. swap the pivot index and idx
        int temp = nums[pivot];
        nums[pivot] = nums[idx];
        nums[idx] = temp;
    }
}