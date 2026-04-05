class Solution {
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public long countPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        long pairs = 0;
        for(int ele : nums){
            int g = gcd(ele , k);
            for(int prevkey : map.keySet()){
                if((long) g*prevkey % k == 0){
                    pairs += map.get(prevkey);
                }
            }
            map.put(g, map.getOrDefault(g,0)+1);
        }
        return pairs;
    }
}