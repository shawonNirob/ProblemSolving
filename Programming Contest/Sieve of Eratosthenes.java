package programmingContest;

public class Sieve {
    public void seiveOfEra(int n){
        boolean prime[] = new boolean[n+1];
        for(int i=0; i<=n; i++){
            prime[i] = true;
        }

        for(int i=4; i<=n; i+=2){
            prime[i] = false;
        }
        double limit = Math.sqrt(n+1);
        for(int i=3; i<limit; i+=2){
            if(prime[i]){
                for(int j=i*i; j<=n; j+=i*2){
                    prime[j] = false;
                }
            }
        }

        int count = 0;
        for(int i=2; i<=n; i++) {
            if (prime[i]) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(count);
    }

    public static void main(String[] args) {
        Sieve call = new Sieve();
        call.seiveOfEra(1000);
    }
}
