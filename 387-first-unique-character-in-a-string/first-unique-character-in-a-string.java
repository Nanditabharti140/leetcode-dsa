class Solution {
    public int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        int[] freq = new int[26];
    
      for(int i =0; i< arr.length; i++){
         char ch = arr[i];
         int idx = ch - 'a';
         freq[idx]++;
      }
      for(int i = 0; i<arr.length; i++){
          if(freq[arr[i] - 'a'] == 1){
              return i;
          }
      }
    return -1;
    }
}