package com.one.java.syntax.aayaz;
import java.util.Scanner;
public class Solution {
    public int reverse( int n){
        int r;
        int sum=0;
        while(n!=0){
            if (sum > Integer.MAX_VALUE/10 || sum < Integer.MIN_VALUE/10) {
                return 0;
            }
            sum=(sum*10)+n%10;
            n=n/10;

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n =input.nextInt();
        Solution reverseInteger = new Solution();
        System.out.println("sum: " +reverseInteger.reverse(n));
    }
}
