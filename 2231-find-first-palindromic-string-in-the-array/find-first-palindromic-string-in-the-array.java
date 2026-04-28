class Solution {
    public String firstPalindrome(String[] words) {
        int n = words.length;
        for(int i = 0; i < n; i++){
            String s = words[i];
            boolean ans = check(s);
            if(ans == true) return s;
        }
        return "";
    }
    public boolean check(String s){
        int j = 0, k = s.length()-1;
           while(j < k){
                if(s.charAt(j) == s.charAt(k)){
                    j++;k--;
                }
                else{
                    return false;
                }
            }
        return true;
    }
}