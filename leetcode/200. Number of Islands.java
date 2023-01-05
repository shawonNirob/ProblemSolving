//DFS
class Solution {
    public int numIslands(char[][] grid) {
        int island = 0;
        boolean[][] isVisited = new boolean[grid.length][grid[0].length];
      
      /*
      //do not need to set false in all isVisited 
        for(int i= 0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                isVisited[i][j] = false;
            }
        }
       */
        
        for(int i= 0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(!isVisited[i][j] && grid[i][j]=='1'){
                     island++;
                     dfs(i, j, grid.length, grid[0].length, grid, isVisited);
                }
            }
        }
        return island;
    }
    public void dfs(int row, int col, int m, int n, char[][] grid, boolean[][] isVisited){
        if(row<0 || row >= m || col<0 || col>=n || isVisited[row][col] || grid[row][col] != '1') return;
        isVisited[row][col] = true;
        
        dfs(row+1, col, m, n, grid, isVisited);
        dfs(row-1, col, m, n, grid, isVisited);
        dfs(row, col-1, m, n, grid, isVisited);
        dfs(row, col+1, m, n, grid, isVisited);
    }
}

//
//DFS Iterative (Bad solution)
class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int island = 0;
        boolean[][] isVisited = new boolean[m][n];
         for(int i=0; i<m; i++){
             for(int j=0; j<n; j++){
                 if(!isVisited[i][j] && grid[i][j]=='1'){
                     Stack<int[]> stack = new Stack();
                     stack.push(new int[]{i, j});
                     isVisited[i][j] = true;
                     
                     island++;
                     
                     while(!stack.isEmpty()){
                         int[] node = stack.pop();
                         
                         int row = node[0]; int col = node[1];
                         
                         if(row+1 < m && !isVisited[row+1][col] && grid[row+1][col]=='1'){
                             isVisited[row+1][col] = true;
                             stack.push(new int[]{row+1, col});
                         }
                         if(row-1 >= 0 && !isVisited[row-1][col] && grid[row-1][col]=='1'){
                             isVisited[row-1][col] = true;
                             stack.push(new int[]{row-1, col});
                         }
                         if(col-1 >= 0 && !isVisited[row][col-1] && grid[row][col-1]=='1'){
                             isVisited[row][col-1] = true;
                             stack.push(new int[]{row, col-1});
                         }
                         if(col+1 < n && !isVisited[row][col+1] && grid[row][col+1]=='1'){
                             isVisited[row][col+1] = true;
                             stack.push(new int[]{row, col+1});
                         }
                     }
                 }
             }
         }
        return island;
    }
}
//

//DFS Iterative 
class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] r = new int[]{1,-1,0,0};
        int[] c = new int[]{0,0,-1,1};
        int island = 0;
        boolean[][] isVisited = new boolean[m][n];
         for(int i=0; i<m; i++){
             for(int j=0; j<n; j++){
                 if(!isVisited[i][j] && grid[i][j]=='1'){
                     Stack<int[]> stack = new Stack();
                     stack.push(new int[]{i, j});
                     isVisited[i][j] = true;
                     
                     island++;
                     
                     while(!stack.isEmpty()){
                         int[] node = stack.pop();
                         
                         for(int k=0; k<4; k++){
                            int row = r[k]+node[0]; int col = c[k]+node[1];
                             
                            if(row >= 0 && row<m && col>=0 && col< n && !isVisited[row][col] && grid[row][col]=='1'){
                                isVisited[row][col] = true;
                                stack.push(new int[]{row, col});
                            }
                         }
                     }
                 }
             }
         }
        return island;
    }
}
//

//BFS(SC------>O(min(M,N))
class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] r = new int[]{1,-1,0,0};
        int[] c = new int[]{0,0,-1,1};
        int island = 0;
        boolean[][] isVisited = new boolean[m][n];
        
         for(int i=0; i<m; i++){
             for(int j=0; j<n; j++){
                 if(!isVisited[i][j] && grid[i][j]=='1'){
                     Queue<int[]> queue = new LinkedList();
                     queue.add(new int[]{i, j});
                     isVisited[i][j] = true;
                     
                     island++;
                     
                     while(!queue.isEmpty()){
                         int[] node = queue.poll();
                         
                         for(int k=0; k<4; k++){
                            int row = r[k]+node[0]; int col = c[k]+node[1];
                             
                            if(row >= 0 && row<m && col>=0 && col< n && !isVisited[row][col] && grid[row][col]=='1'){
                                isVisited[row][col] = true;
                                queue.add(new int[]{row, col});
                            }
                         }
                     }
                 }
             }
         }
        return island;
    }
}


//
