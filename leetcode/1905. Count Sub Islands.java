//DFS
class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m = grid1.length;
        int n = grid1[0].length;
        int[] r = new int[]{1,-1,0,0};
        int[] c = new int[]{0,0,-1,1};
        boolean[][] isVisited = new boolean[m][n];
        
        int result = 0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(isVisited[i][j] || grid2[i][j]==0){
                    continue;
                }

                 Stack<int[]> stack = new Stack();
                 stack.push(new int[]{i,j});
                 isVisited[i][j]=true;
                 boolean flag = true;

                 while(!stack.isEmpty()){
                    int node[] = stack.pop();

                     if(grid1[node[0]][node[1]]==0) flag = false;

                     for(int k=0; k<4; k++){
                            int row = r[k]+node[0]; int col = c[k]+node[1];


                            if(row>=0 && row<m && col>=0 && col<n && !isVisited[row][col] && grid2[row][col]==1){
                                isVisited[row][col] = true;
                                stack.push(new int[]{row, col});
                            }
                        }
                    }
                 if(flag) ++result;
            }
        }
        return result;
    }
}

//
class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m = grid1.length;
        int n = grid1[0].length;
        int[] r = new int[]{1,0,-1,0,1};
        boolean[][] isVisited = new boolean[m][n];
        
        int result = 0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(isVisited[i][j] || grid2[i][j]==0){
                    continue;
                }

                 Stack<int[]> stack = new Stack();
                 stack.push(new int[]{i,j});
                 isVisited[i][j]=true;
                 boolean flag = true;

                 while(!stack.isEmpty()){
                    int node[] = stack.pop();

                     if(grid1[node[0]][node[1]]==0) flag = false;

                     for(int k=0; k<4; k++){
                            int row = r[k]+node[0]; int col = r[k+1]+node[1];


                            if(row>=0 && row<m && col>=0 && col<n && !isVisited[row][col] && grid2[row][col]==1){
                                isVisited[row][col] = true;
                                stack.push(new int[]{row, col});
                            }
                        }
                    }
                 if(flag) ++result;
            }
        }
        return result;
    }
}
//
class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m = grid1.length;
        int n = grid1[0].length;
        int[] r = new int[]{1,0,-1,0,1};
        boolean[][] isVisited = new boolean[m][n];
        
        int result = 0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(!isVisited[i][j] && grid2[i][j]==1){
                    
                 Stack<int[]> stack = new Stack();
                 stack.push(new int[]{i,j});
                 isVisited[i][j]=true;
                 boolean flag = true;

                 while(!stack.isEmpty()){
                    int node[] = stack.pop();

                     if(grid1[node[0]][node[1]]==0) flag = false;

                     for(int k=0; k<4; k++){
                            int row = r[k]+node[0]; int col = r[k+1]+node[1];


                            if(row>=0 && row<m && col>=0 && col<n && !isVisited[row][col] && grid2[row][col]==1){
                                isVisited[row][col] = true;
                                stack.push(new int[]{row, col});
                            }
                        }
                    }
                 if(flag) ++result;
                }
            }
        }
        return result;
    }
}


//DFS Recursive
class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m = grid2.length;
        int n = grid2[0].length;
        boolean[][] isVisited = new boolean[m][n];
        
        int result = 0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                
                if(!isVisited[i][j] && grid2[i][j]==1){
                    if(dfs(i,j,grid1,grid2,m,n,isVisited)) result++;
                }
            }
        }
        return result;
    }
                            
    public boolean dfs(int r, int c, int[][] grid1, int[][] grid2, int m, int n, boolean[][] isVisited){
        if(r<0 || r>=m || c<0 || c>=n || isVisited[r][c] || grid2[r][c]==0) return true;
            
        isVisited[r][c] = true;
        boolean isTrue = true;
        if(grid1[r][c]==0) isTrue = false;
        
        isTrue = dfs(r+1, c, grid1, grid2, m, n, isVisited) && isTrue;
        isTrue = dfs(r-1, c, grid1, grid2, m, n, isVisited) && isTrue;
        isTrue = dfs(r, c-1, grid1, grid2, m, n, isVisited) && isTrue;
        isTrue = dfs(r, c+1, grid1, grid2, m, n, isVisited) && isTrue;
        
        return isTrue;
    }
}

//
//1. remove all non-common Island
//2. count the island
class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m = grid2.length;
        int n = grid2[0].length;
        
        int result = 0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                
                if(grid1[i][j]==0 && grid2[i][j]==1){
                    dfs(i, j, grid2, m, n);
                }
            }
        }
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){         
                if(grid2[i][j]==1){
                    result++;
                    dfs(i, j, grid2, m, n);
                }
            }
        }
        
        return result;
    }
                            
    public void dfs(int r, int c, int[][] grid2, int m, int n){
        if(r<0 || r>=m || c<0 || c>=n || grid2[r][c]==0) return;
        
        grid2[r][c] = 0;
        
        dfs(r+1, c, grid2, m, n);
        dfs(r-1, c, grid2, m, n);
        dfs(r, c-1, grid2, m, n);
        dfs(r, c+1, grid2, m, n);
    }
}
//
