//TLE Solution
//Brute Force
class Solution {
    public String longestPalindrome(String s) {
        String str = "";
        for(int i=0; i<s.length(); i++){
            for(int j=i;j<s.length(); j++){
                if(check(s, i, j)){
                    if(s.substring(i,j+1).length() > str.length()){
                        str = s.substring(i,j+1);
                    }
                }
            }
        }
        return str;
    }
    public boolean check(String s, int start, int end){
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }  
        return true;
    }
}


//
