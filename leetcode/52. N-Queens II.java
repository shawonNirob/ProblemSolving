class Solution {
    public int ans;
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        ans = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        helper(0 , board);
        return ans;
    }

    public boolean isSafe(int row, int col, char[][] board){
        //upper corner
        int rowRe = row;
        int colRe = col;
        while(row >= 0 && col >= 0){
            if(board[row][col] == 'Q') return false;
            row--;
            col--;
        }
        //front Horizontal
        row = rowRe;
        col = colRe;
        while(col>=0){
            if(board[row][col]=='Q') return false;
            col--;
        }
        //Lower corner
        row = rowRe;
        col = colRe;
        while(col>=0 && row<board.length){
            if(board[row][col]=='Q') return false;
            row++;
            col--;
        }

        return true;
    }
    
    public void helper(int col, char[][] board){
        if(col==board.length){
            ans++;
            return;
        }
        
        for(int row=0; row<board.length; row++){
            if(isSafe(row,col,board)){
                board[row][col] = 'Q';
                helper(col+1, board);
                board[row][col] = '.';
            }
        }
    }
}
//
class Solution {
    public int ans;
    public int totalNQueens(int n) {
        ans = 0;
        char[][] board =  new char[n][n];
        for(int i=0; i< n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        int[] leftRow = new int[n];
        int[] upperDiagonal = new int[2*n - 1];
        int[] lowerDiagonal = new int[2*n - 1];

        helper(0, board,leftRow, upperDiagonal, lowerDiagonal);
        return ans;
    }

    public void helper(int col, char[][] board, int[] leftRow, int[] upperDiagonal, int[] lowerDiagonal){
        if(col == board.length){
            ans++;
            return;
        }
        for(int row=0; row< board.length; row++){
            if(leftRow[row]== 0 && upperDiagonal[board.length-1+col-row]==0 && lowerDiagonal[row+col]==0){
                board[row][col] = 'Q';
                leftRow[row]= 1;
                upperDiagonal[board.length-1+col-row] = 1;
                lowerDiagonal[row+col] = 1;
                helper(col+1, board, leftRow, upperDiagonal, lowerDiagonal);
                board[row][col] = '.';
                leftRow[row] = 0;
                upperDiagonal[board.length-1+col-row] = 0;
                lowerDiagonal[row+col] = 0;
            }
        }
    }
}
//
