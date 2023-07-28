public class Solution {
    public int maxp3(int[] A) {
        Arrays.sort(A);
        
        int n = A.length;
        int n1 = A[n-1]*A[n-2]*A[n-3];
        int n2 = A[n-1]*A[0]*A[1];
        
        return Math.max(n1,n2);

        //O(nlogn)
    }
}
