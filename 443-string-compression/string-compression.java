class Solution {
    public int compress(char[] chars) {
        int i=0 ,j=0 ,k = 0;
        int n = chars.length;
        while(j < n){
            while(j < n && chars[i] == chars[j]) j++;
            int count = j - i;
            chars[k++] = chars[i];
            if(count > 1){
                String cnt = String.valueOf(count);
                for(int l = 0; l< cnt.length(); l++){
                    chars[k++] = cnt.charAt(l);
                }
            }
            i = j;
        }
        return k;
    }
}