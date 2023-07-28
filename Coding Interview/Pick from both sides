public class Solution {
    public int solve(int[] A, int B) {
        int sum, maxSum;
        
        sum = 0;
        for(int i=0; i<B; i++){
            sum += A[i];
        }
        
        maxSum = sum;
        
        int n = A.length;
        for(int i=0; i<B; i++){
            int x = A[B-1-i];
            int y = A[n-1-i];
            
            sum = sum - x + y;
            maxSum = Math.max(sum, maxSum);
        }
        
        return maxSum;
        //O(B)
    }
}
