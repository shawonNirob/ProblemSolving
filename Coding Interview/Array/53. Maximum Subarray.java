//TLE
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = -100000;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j = i; j<n; j++){
                sum += nums[j];
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }
}

//O(n)
class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int n = nums.length;
        
        int sum = max;
        for(int i=1; i<n; i++){
            sum += nums[i];
            if(nums[i] > sum){
                sum = nums[i];
            }
            max = Math.max(sum, max);
        }
        
        return max;
    }
}


