//Brute Force
class Solution {
    public boolean judgeSquareSum(int c) {
        double val = Math.sqrt(c);
        int sqrtC = (int)val;

        
        for(int a=0; a<=sqrtC; a++){
            for(int b=a; b<=sqrtC; b++){
                if(a*a + b*b ==c) return true;
            }
        }
        return false;
    }
}
//Better brute force
class Solution {
    public boolean judgeSquareSum(int c) {
        double val = Math.sqrt(c);
        int sqrtC = (int)val;

        
        for(int a=0; a<=sqrtC; a++){
            int b = c - a*a;
            int sum = 0, i = 1;
            while(sum<b){
                sum += i;
                i += 2;
            }
            if(sum==b) return true;
        }
        return false;
    }
}


//Sqrt
class Solution {
    public boolean judgeSquareSum(int c) {
        double val = Math.sqrt(c);
        int sqrtC = (int)val;

        
        for(int a=0; a<=sqrtC; a++){
            double p = c - a*a;
            double value = Math.sqrt(p);
            int b = (int)value;
            if(a*a + b*b == c) return true;
        }
        return false;
    }
}
//
class Solution {
    public boolean judgeSquareSum(int c) {
        double val = Math.sqrt(c);
        int sqrtC = (int)val;

        
        for(int a=0; a<=sqrtC; a++){
            double b = Math.sqrt(c - a*a);
            if(b == (int)b) return true;
        }
        return false;
    }
}


//Binary Search
class Solution {
    public boolean judgeSquareSum(int c) {
        double val = Math.sqrt(c);
        int sqrtC = (int)val;

        
        for(int a=0; a<=sqrtC; a++){
            int left = a;
            int right  = sqrtC;
            int b = c - a*a;
            
            while(left <= right){
                int mid = left + (right-left)/2;
                if(mid * mid == b) return true;
                else if(mid * mid > b) right = mid - 1;
                else left = mid + 1;
            }
        }
        return false;
    }
}

//
class Solution {
    public boolean judgeSquareSum(int c){
        double val = Math.sqrt(c);
        int sqrtC = (int)val;

        for(int a=0; a<=sqrtC; a++){
            int b = c - a*a;
            if(binarySearch(b, a, sqrtC)) return true;
        }
        return false;
    }
    public boolean binarySearch(int b, int left, int right){
        while(left <= right){
            int mid = left + (right-left)/2;
            if(mid * mid == b) return true;
            else if(mid * mid > b) right = mid -1;
            else left = mid + 1;
        }
        return false;
    }
}



//Fermat Theorem
