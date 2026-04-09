class Solution {
    public int uniquePaths(int m, int n) {
       // Method 1 
        // if(m == 1 || n == 1) return 1;
        // return uniquePaths(m-1,n) + uniquePaths(m,n-1);
        
        //Method 2
        //return paths(m-1,n-1,0,0);

        // Method 3.
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || j == 0) dp[i][j] = 1;
                else dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
    
        }
        return dp[m-1][n-1];
    }
    // public int paths(int row, int col, int start, int end){
    //     if(start > row && end > col) return 0;   //imp step
    //     if(start == row || end == col) return 1;
    //     return paths(row, col, start+1, end) + paths(row, col, start , end+1);
    // }
}