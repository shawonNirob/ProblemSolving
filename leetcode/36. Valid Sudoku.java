class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row=0; row<board.length; row++){
            for(int col=0; col<board[0].length; col++){
                if(board[row][col]=='.') continue;
                if(!check(board[row][col], row, col, board)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean check(char c, int row, int col, char[][] board){
        for(int i=0; i<9; i++){
            if(i!=col && board[row][i]== c) return false;
            if(i!=row && board[i][col]== c) return false;
            if(3*(row/3)+i/3 != row && 3*(col/3)+i%3 != col && board[3*(row/3)+i/3][3*(col/3)+i%3]==c)return false; 
        }
        return true;
    } 
}

