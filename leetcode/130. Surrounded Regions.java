//DFS
class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] isVisited = new boolean[m][n];
        for(int row=0; row<m; row++){
            for(int col=0; col<n; col++){
                if(row == 0 || col ==0 || row == m-1 || col == n-1){
                    if(!isVisited[row][col] && board[row][col] == 'O'){
                        dfs(row,col,board,isVisited,m,n);
                    }
                }
            }
        }
        for(int row=0; row<m; row++){
            for(int col=0; col<n; col++){
                if(!isVisited[row][col] && board[row][col] == 'O') board[row][col] = 'X';
            }
        }
    }
    
    public void dfs(int row,int col,char[][] board,boolean[][] isVisited,int m,int n){
        if(row<0 || row>=m || col<0 || col>=n || isVisited[row][col] || board[row][col] != 'O') return;
        
        isVisited[row][col] = true;
        
        dfs(row+1,col,board,isVisited,m,n);
        dfs(row-1,col,board,isVisited,m,n);
        dfs(row,col+1,board,isVisited,m,n);
        dfs(row,col-1,board,isVisited,m,n);
    }
}

//BFS
class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[] r = new int[]{1,-1,0,0};
        int[] c = new int[]{0,0,-1,1};
        boolean[][] isVisited = new boolean[m][n];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i == 0 || j ==0 || i == m-1 || j == n-1){
                    if(!isVisited[i][j] && board[i][j] == 'O'){
                        Queue<int[]> queue = new LinkedList();
                        queue.add(new int[]{i, j});
                        isVisited[i][j] = true;
                     
                        while(!queue.isEmpty()){
                            int[] node = queue.poll();
                         
                            for(int k=0; k<4; k++){
                                int row = r[k]+node[0]; int col = c[k]+node[1];
                             
                                if(row >= 0 && row<m && col>=0 && col< n && !isVisited[row][col] && board[row][col]=='O'){
                                    isVisited[row][col] = true;
                                    queue.add(new int[]{row, col});
                                }
                            }
                         }
                    }
                }
            }
        }
        
        for(int row=0; row<m; row++){
            for(int col=0; col<n; col++){
                if(!isVisited[row][col] && board[row][col] == 'O') board[row][col] = 'X';
            }
        }
    }
}

