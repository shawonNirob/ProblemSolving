//TLE
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        return lCS(0,0 , text1, text2);
    }
    public int lCS(int i, int j, String text1, String text2){
        if(i==text1.length() || j==text2.length()){
            return 0;
        }else if(text1.charAt(i) == text2.charAt(j)){
            return 1+lCS(i+1, j+1, text1, text2);
        }else{
            return Math.max(lCS(i+1, j, text1, text2), lCS(i, j+1, text1, text2));
        }
    }
}

//Memoization - Array
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] arr = new int[text1.length()][text2.length()];
        for(int i=0; i<text1.length(); i++){
            for(int j=0; j<text2.length(); j++){
                arr[i][j] = 0;
            }
        }
        return lCS(0,0 , text1, text2, arr);
    }
    public int lCS(int i, int j, String text1, String text2, int[][] arr){
        if(i<text1.length() && j<text2.length() && arr[i][j] != 0) return arr[i][j];

        if(i==text1.length() || j==text2.length()){
            return 0;
        }else if(text1.charAt(i) == text2.charAt(j)){
            arr[i][j] = 1+lCS(i+1, j+1, text1, text2, arr);
            return arr[i][j];
        }else{
            arr[i][j] = Math.max(lCS(i+1, j, text1, text2, arr), lCS(i, j+1, text1, text2, arr));
            return arr[i][j];
        }
    }
}

//


