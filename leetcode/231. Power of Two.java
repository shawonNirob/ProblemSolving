Approach 01
  //
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        while(n!=1){
            if(n%2!=0){
                return false;
            }
            n=n/2;
        }
        return true;
    }
}
Approach 02
//
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        if(n==1){
            return true;
        }
        if(n%2!=0){
            return false;
        }
        n=n/2;
        return isPowerOfTwo(n);
    }
}
//
Approach 03
//
  
