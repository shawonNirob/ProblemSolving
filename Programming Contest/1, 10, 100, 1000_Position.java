//Timus1209
package programmingContest;
import java.lang.Math;
public class Timus1209 {
    public static void number(int n){
        int sum =0;
        int x=0;
        for(int i=0; i<n; i++){
            sum=sum+i;
            if(sum>=n){
                x=i;
                break;
            }
        }
        double sq = Math.pow(10, (x-1));
        int square =(int) sq;
        System.out.println(square);
        String temp = Integer.toString(square);
        System.out.println(temp);
        System.out.println();
        char [] chr = new char[temp.length()];
        for(int i=0; i<temp.length(); i++){
            chr[i] = temp.charAt(i);
        }
        /*
        for (int i=0; i< chr.length; i++){
            System.out.print(chr[i]);
        }

         */

        sum= sum-x;
        sum=sum+1;
        int j=0;
        while(sum<=n){
            if(sum==n){
                System.out.println(chr[j]);
                break;
            }
            sum++;
            j++;
        }
    }

    public static void main(String[] args) {
        Timus1209.number(21);
    }
}
