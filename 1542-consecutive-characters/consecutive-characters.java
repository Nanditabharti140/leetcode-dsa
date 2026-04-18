class Solution {
    public int maxPower(String s) {
        int i = 0 , j = 0, count = 0, maxCount = 0;
        while(j < s.length()){
            if(s.charAt(i) == s.charAt(j)){
                count++;
                maxCount = Math.max(count , maxCount);
            }
            else{
                count = 1;
                i = j;
            }
            j++;
        }
        return maxCount;
    }
}
