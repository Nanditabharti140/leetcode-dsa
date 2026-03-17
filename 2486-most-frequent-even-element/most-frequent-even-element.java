class Solution {
    public int mostFrequentEven(int[] nums) {
        int max1 = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= max1){
                max1 = nums[i];
            }
        }
        int[] freq = new int[max1+2];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                freq[nums[i]]++;
            }
        }
        int index = -1;
        int max2 = -1;
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 0 && freq[i] > max2 ){
                max2 = freq[i];
                index = i;
            }
        }
        return index;
    }
}