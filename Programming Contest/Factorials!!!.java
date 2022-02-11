package programmingContest;
import java.util.Scanner;

public class Factorial {
    public int fact(int n, String f) {
        int l = f.length();
        int factorial = 1;
        while (n > 1) {
            factorial = factorial * n;
            n = n - l;
        }
        return factorial;
    }

    public static void main(String[] args) {
       /* Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int l = input.nextInt();
        System.out.println("Enter Factorial number: ");
        String m = input.nextLine();


        */
        Factorial cal = new Factorial();
        System.out.println(cal.fact(9,"!!"));
    }
}
