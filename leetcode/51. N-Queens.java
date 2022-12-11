class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        helper(0 , board, ans);
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
    
    public void helper(int col, char[][] board, List<List<String>> ans){
        if(col==board.length){
            ans.add(construct(board));
            return;
        }
        
        for(int row=0; row<board.length; row++){
            if(isSafe(row,col,board)){
                board[row][col] = 'Q';
                helper(col+1, board, ans);
                board[row][col] = '.';
            }
        }
    }
    public List<String> construct(char[][] board){
        List<String> list = new LinkedList();
        for(int i=0; i<board.length; i++){
            String s = new String(board[i]);
            list.add(s);
        }
        return list;
    }
}
