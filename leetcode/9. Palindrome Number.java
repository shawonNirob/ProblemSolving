class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int index = 0;
        while(index <= s.length()/2){
            if(s.charAt(index) != s.charAt(s.length()-1-index)){
                return false;
            }
            index++;
        }
        return true;
    }
}

//

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int y = x;
        int rem = 0, num=0;
        while(x!= 0){
            rem = x%10;
            num = num*10 + rem;
            x = x/10;
        }
        
        if(y == num) return true;
        else return false;
    }
}

//
