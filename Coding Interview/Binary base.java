
//Decimal top binary

//ime complexity of O(k) and a space complexity of O(k), 
//where k is the number of bits required to represent the decimal number A in binary form.

public class Solution {
    public String findDigitsInBinary(int A) {
        StringBuilder str = new StringBuilder();
        int n = A;
        while(n>0){
            int rem = n%2;
            str.append(rem);
            n /= 2;
        }
        str.reverse();
        
        String result = str.toString;
        
        return result;
    }
}



//Binary to decimal

class Solution {
    public int binary_to_decimal(String str) {
        // Code here
        int l = str.length();
        int n = l;
        int deci = 0;
        for(int i=0; i<l; i++){
            int bit = Character.getNumericValue(str.charAt(i));
            
            n--;
            int partSum = bit * (int)Math.pow(2, n);
            deci += partSum;
        }
        
        return deci;
    }
}
