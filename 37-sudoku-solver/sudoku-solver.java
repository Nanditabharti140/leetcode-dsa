class Solution {
    static boolean flag = true;
    public boolean isValid(char[][] board , int row , int col, char num){
        //check the entire col
        for(int i = 0 ; i < 9 ; i++){
            if(board[i][col] == num) return false;
        }

        //check the entire row
        for(int j = 0 ; j < 9 ; j++){
            if(board[row][j] == num) return false;
        }

        //check the entire grid of 3x3 matrix
        int sr = row/3*3;
        int sc = col/3*3;
        for(int i = sr; i < sr+3; i++){
            for(int j = sc; j < sc+3; j++){
                if(board[i][j] == num) return false;
            }
        }
        return true;
    }
    public void solve(char[][] board, int row , int col){
        if(row == 9){
            flag = false;
            return;
        }
        else if(board[row][col] != '.'){
            if(col != 8)solve(board, row , col+1);
            else solve(board , row+1 , 0);
        }
        else{
            // board[row][col] == '.'
            for(char ch = '1'; ch <= '9'; ch++){
                if(isValid(board, row , col , ch)){
                    board[row][col] = ch;
                    if(col != 8)solve(board, row , col+1);
                    else solve(board , row+1 , 0);
                    if(flag == false) return;
                    board[row][col] = '.';
                }
            }
        }
    }
    public void solveSudoku(char[][] board) {
      solve(board , 0 , 0);  
      flag = true;
    }
}