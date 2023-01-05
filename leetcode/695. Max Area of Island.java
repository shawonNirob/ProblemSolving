//
class Solution {
    private int area;
    public int maxAreaOfIsland(int[][] grid){
        int maxArea = 0;
        boolean[][] isVisited = new boolean[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(!isVisited[i][j] && grid[i][j]== 1){
                    area = 0;
                    dfs(i,j,grid,isVisited,grid.length,grid[0].length);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }
    public void dfs(int row,int col,int[][] grid,boolean[][] isVisited, int m, int n){
        if(row<0 || row>=m || col<0 ||col>=n || isVisited[row][col] || grid[row][col]!=1) return;
        
        isVisited[row][col] = true;
        area += 1;
        
        dfs(row+1,col,grid,isVisited,m,n);
        dfs(row-1,col,grid,isVisited,m,n);
        dfs(row,col+1,grid,isVisited,m,n);
        dfs(row,col-1,grid,isVisited,m,n);
    }
}

//
class Solution {

    public int maxAreaOfIsland(int[][] grid){
        boolean[][] isVisited = new boolean[grid.length][grid[0].length];
        int maxArea = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(!isVisited[i][j] && grid[i][j]== 1){
                    int area = 0;
                    area = dfs(i,j,grid,isVisited,grid.length,grid[0].length);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }
    public int dfs(int row,int col,int[][] grid,boolean[][] isVisited, int m, int n){
        if(row<0 || row>=m || col<0 ||col>=n || isVisited[row][col] || grid[row][col]!=1) return 0;
        
        isVisited[row][col] = true;
        
        return 1 + (dfs(row+1,col,grid,isVisited,m,n) + dfs(row-1,col,grid,isVisited,m,n) + dfs(row,col+1,grid,isVisited,m,n) + dfs(row,col-1,grid,isVisited,m,n));

    }
}
//
class Solution {

    public int maxAreaOfIsland(int[][] grid){
        boolean[][] isVisited = new boolean[grid.length][grid[0].length];
        int maxArea = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(!isVisited[i][j] && grid[i][j]== 1){
                    maxArea = Math.max(maxArea, dfs(i,j,grid,isVisited,grid.length,grid[0].length));
                }
            }
        }
        return maxArea;
    }
    public int dfs(int row,int col,int[][] grid,boolean[][] isVisited, int m, int n){
        if(row<0 || row>=m || col<0 ||col>=n || isVisited[row][col] || grid[row][col]!=1) return 0;
        
        isVisited[row][col] = true;
        
        return 1 + (dfs(row+1,col,grid,isVisited,m,n) + dfs(row-1,col,grid,isVisited,m,n) + dfs(row,col+1,grid,isVisited,m,n) + dfs(row,col-1,grid,isVisited,m,n));

    }
}
//
//BFS
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] r = new int[]{1,-1,0,0};
        int[] c = new int[]{0,0,-1,1};
        int maxArea = 0;
        boolean[][] isVisited = new boolean[m][n];
        
        for(int i=0; i<m; i++){
             for(int j=0; j<n; j++){
                 if(!isVisited[i][j] && grid[i][j]==1){
                     Queue<int[]> queue = new LinkedList();
                     queue.add(new int[]{i, j});
                     isVisited[i][j] = true;
                     
                     int area = 0;
                     
                     while(!queue.isEmpty()){
                         int[] node = queue.poll();
                         area++;
                         for(int k=0; k<4; k++){
                            int row = r[k]+node[0]; int col = c[k]+node[1];
                             
                            if(row >= 0 && row<m && col>=0 && col<n && !isVisited[row][col] && grid[row][col]==1){
                                isVisited[row][col] = true;
                                queue.add(new int[]{row, col});
                            }
                         }
                     }
                     maxArea = Math.max(maxArea, area);
                 }
             }
         }
        return maxArea;
    }
}



