//Normal Recursive
class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        
        return fib(n-1) + fib(n-2);
    }
}

//MemoiZation (DP)
class Solution {
    Map<Integer, Integer> map;
    public int fib(int n) {
        map = new HashMap();
        
        return dpFib(n);
        
    }
    private int dpFib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        if(map.containsKey(n)) return map.get(n);
        
        map.put(n, dpFib(n-1) + dpFib(n-2));
        
        return map.get(n);
    }
}

//Dynamic Programming Iterative
class Solution {
    public int fib(int n) {
        Map<Integer, Integer> map = new HashMap();
        
        map.put(0, 0);
        map.put(1, 1);
        
        for(int i=2; i<=n; i++){
            map.put(i, map.get(i-1)+ map.get(i-2));
        }
        
        return map.get(n);
    }
}

//Iterative O(1)Space
class Solution {
    public int fib(int n) {
        int prev = 0;
        int next = 1;
        int current = prev;
        
        for(int i=2; i<=n; i++){
            current = prev + next;
            
            prev = next;
            next = current;
        }
        
        return n==0 ? current : next;
    }
}

//Binet's Fibonacci Formula
class Solution {
    public int fib(int n) {
        double goldenRatio = (1 + Math.sqrt(5))/2;
        double fib = Math.round((Math.pow(goldenRatio, n))/Math.sqrt(5));
        
        return (int) fib;
    }
}


