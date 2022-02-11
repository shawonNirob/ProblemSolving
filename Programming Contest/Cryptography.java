//Timus 1086
package programmingContest;
import java.util.Scanner;

public class Cryptography {
    public static int primeCheck(int n) {
        int r = 0;
        int p;
        for (int i = 2; i <= 15000; i++) {
            p= isPrime(i);
            if(p!=0){
                r++;
            }
            if (r == n) {
                return p;
            }
        }
        return 0;
    }
    public static int isPrime(int x) {
        for (int i = 2; i <= x / 2; i++) {
            if (x == 2) {
                return x;
            } else if (x % i == 0) {
                return 0;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i]= input.nextInt();
        }
        int j=0;
        while (n>0){
            System.out.println(Cryptography.primeCheck(a[j]));
            n--;
            j++;
        }

    }
}
