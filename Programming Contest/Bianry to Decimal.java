package numberConversion;

public class leftShift {
    public int btd(int n){
         int dec=0, digit=0, i=0;
         while(n!=0){
             digit = n%10;
             dec += digit << i;
             n=n/10;
             ++i;
         }
        return dec;
    }
    public static void main(String[] args) {
        leftShift cal = new leftShift();
        System.out.println(cal.btd(1111));
    }
}
