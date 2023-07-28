//What is the Maximum in Left and Minimum in right
public class Solution {
    public int perfectPeak(int[] A) {
        //O(n)
        int n = A.length;
        
        int[] maxLeft = new int[n];
        int[] minRight = new int[n]; 
        
        maxLeft[0] = A[0];
        minRight[n-1] = A[n-1];
        for(int i=1; i<n-1; i++){
            maxLeft[i] = Math.max(maxLeft[i-1], A[i]);
            minRight[n-1-i] = Math.min(A[n-1-i], minRight[n-i]); //minRight[n-1-i+1]
        }
        
        for(int i=1; i<n-1; i++){
            if(A[i] > maxLeft[i-1] && A[i] < minRight[i+1]){
                return 1;
            }
        }
        
        return 0;
    }
}
//


//Brute Force
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



