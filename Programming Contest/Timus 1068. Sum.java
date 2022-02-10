package programmingContest;

public class Timus1068 {
    public int summation(int n){
        if(n==0){
            return 0;
        }
        else if(n>0){
            return (n*(n+1))/2;
        }
        else {
            n =n*(-1);
            return ((-1)*((n*(n+1))/2)+1);
        }
    }

    public static void main(String[] args) {
        Timus1068 cal =new Timus1068();
        System.out.println(cal.summation(4));
    }
}
