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
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}

