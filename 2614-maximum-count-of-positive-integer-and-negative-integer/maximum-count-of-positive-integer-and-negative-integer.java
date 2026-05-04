class Solution {
    public int maximumCount(int[] nums) {
        // Method 1.
        int n = nums.length;
        // int pos = 0;
        // int neg = 0;
        // for(int i = 0; i<n; i++){
        //     if(nums[i] > 0) pos++;
        //     if(nums[i] < 0) neg++;
        // }
        // return Math.max(pos,neg);
        int neg = 0 , pos = 0;
        int lo = 0 , hi = n-1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(nums[mid] >= 0) hi = mid-1;
            else lo = mid+1;
        }
        neg = lo;;
        
        lo = 0;
        hi = n-1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(nums[mid] <= 0) lo = mid+1;
            else hi = mid-1;
        }
        pos = n - lo;
        return Math.max(neg,pos);
    }
}