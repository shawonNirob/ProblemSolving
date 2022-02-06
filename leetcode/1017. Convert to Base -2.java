//1017. Convert to Base -2
package numberConversion;

import java.util.Scanner;

public class DecimalToBinary {
    public static String baseNeg2(int n) {
        if(n==0){
            return "0";
        }
        String ans="";
        while(n!=0){
            int r = n % (-2);
            n = n/(-2);

            if(r<0){
                r =r + (2);
                n =n + 1;
            }
        ans= String.valueOf(r) +ans;
        }return ans;
    }
    public static void main(String[] args) {

        System.out.println(baseNeg2(3));
    }
}
//
