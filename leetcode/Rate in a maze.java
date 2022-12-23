//simplified version
class Solution {
    public ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
     
   ArrayList < String > ans = new ArrayList < > ();
        int[][] visit = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                visit[i][j] = 0;
            }
        }
        int[] rowArr = {1,0,0,-1};
        int[] colArr = {0,-1,1,0};
        if(m[0][0]==1) helper(0,0,visit,m,n,ans,"", rowArr, colArr);
        return ans;
        
    }
    public void helper(int row, int col,int[][] visit, int[][] m, int n, ArrayList<String> ans, String str, int[] rowArr, int[] colArr){
        if(row==n-1 && col==n-1){
            ans.add(str);
            return;
        }
        
        String s = "DLRU";
        for(int i=0; i<4; i++){
            int r = row + rowArr[i];
            int c = col + colArr[i];
            
            if(r>=0 && c >=0 && r<n && c<n && visit[r][c]==0 && m[r][c]==1){
                visit[row][col]=1;
                helper(r, c, visit, m, n, ans, str+s.charAt(i), rowArr, colArr);
                visit[row][col]=0;
            }
        }
    }
}



//the ultimate four
class Solution {
    public ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList < String > ans = new ArrayList < > ();
        int[][] visit = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                visit[i][j] = 0;
            }
        }
        if(m[0][0]==1) helper(0,0,visit,m,n,ans,"");
        return ans;
        
    }
    public void helper(int row, int col,int[][] visit, int[][] m, int n, ArrayList<String> ans, String str){
        if(row==n-1 && col==n-1){
            ans.add(str);
            return;
        }
        
        //Downward
        if(row+1<n && visit[row+1][col]==0 && m[row+1][col]==1){
            visit[row][col] = 1;
            helper(row+1,col,visit,m,n,ans,str+'D');
            visit[row][col] = 0;
        }
        
        //Left
        if(col-1>=0 && visit[row][col-1]==0 && m[row][col-1]==1){
            visit[row][col] = 1;
            helper(row,col-1,visit,m,n,ans,str+'L');
            visit[row][col] = 0;
        }
        
        //Right
        if(col+1<n && visit[row][col+1]==0 && m[row][col+1]==1){
            visit[row][col] = 1;
            helper(row,col+1,visit,m,n,ans,str+'R');
            visit[row][col] = 0;
        }
        
        //Up
        if(row-1>=0 && visit[row-1][col]==0 && m[row-1][col]==1){
            visit[row][col] = 1;
            helper(row-1,col,visit,m,n,ans,str+'U');
            visit[row][col] = 0;
        }
    }
}


//
