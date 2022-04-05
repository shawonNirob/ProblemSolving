//O(n^2)

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for(int i=0; i<height.length; i++){
            for(int j=i+1; j<height.length; j++){
                int currArea = Math.min(height[i], height[j]) * (j-i);
                max = Math.max(max, currArea);
            }
        }
        return max;
    }
}
//Two Pointer O(n)
class Solution {
    public int maxArea(int[] height) {
        int left=0, right=height.length-1, max=0;
        while(left<right){
            int currArea = Math.min(height[left], height[right]) * (right-left);
            max = Math.max(max, currArea);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}

