class Solution {
    public HashMap<Character, Integer> makeFreqMap(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }
            else{
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }
        return map;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> map = makeFreqMap(s);
        //HashMap<Character, Integer> mp2 = makeFreqMap(t);
        //return mp1.equals(mp2);

        // Second method - first make map of String s and then check for t if the key of t is not present then return false
        // else reduce the value of that key by one and last step is check the map has all value equal to 0

        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            if(!map.containsKey(ch)) return false;
            map.put(ch, map.get(ch) - 1);
        }

        for(Integer i : map.values()){
            if(i != 0) return false;
        }
        return true;
    }
}