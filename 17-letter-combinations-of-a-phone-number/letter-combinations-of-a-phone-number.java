class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> ans = new ArrayList<>();
        if (digits.length() == 0) return ans;

        String[] kp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        combinations(digits, 0, "", kp, ans);
        return ans;
    }

    public void combinations(String digits, int index, String path,String[] kp, ArrayList<String> ans) {

        if (index == digits.length()) {
            ans.add(path);
            return;
        }

        int currNum = digits.charAt(index) - '0';
        String choices = kp[currNum];

        for (int i = 0; i < choices.length(); i++) {
            combinations(digits, index + 1,
                         path + choices.charAt(i), kp, ans);
        }
    }
}
