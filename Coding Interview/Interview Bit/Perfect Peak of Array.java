public class Solution {
    public int perfectPeak(int[] A) {
        //Brute Force
        //O(n*n)
        int n = A.length;
        
        for(int i=1; i<n-1; i++){
            boolean flag = true;
            for(int j=0; j<i; j++){
                if(A[j] >= A[i]){
                    flag = false;
                    break;
                }
            }
            if(!flag) continue;
            for(int j=i+1; j<n; j++){
                if(A[j] <= A[i]){
                    flag = false;
                    break;
                }
            }
            if(flag) return 1;
        }
        return 0;
    }
}

//



