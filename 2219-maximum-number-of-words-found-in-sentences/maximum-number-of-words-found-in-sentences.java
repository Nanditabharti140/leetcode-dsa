class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for (String sentence : sentences) {
            int words = sentence.split(" ").length;
            maxWords = Math.max(maxWords, words);
        }

        return maxWords; 
    }
}