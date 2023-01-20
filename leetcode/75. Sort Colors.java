O(2n)
//2 pass
class Solution {
    public void sortColors(int[] nums) {
        int zeros = 0, ones =0, twos =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) zeros++;
            else if(nums[i]==1) ones++;
            else twos++;
        }
        for(int i=0; i<nums.length; i++){
            if(i < zeros) nums[i] = 0;
            else if(i < zeros+ones) nums[i] = 1;
            else nums[i] = 2;
        }
    }
}

O(n)
//1 pass
class Solution {
    public void sortColors(int[] nums) {
        int red=0, white=0, blue = nums.length-1;
        
        while(white <= blue){
            if(nums[white]==0){
                swap(nums, white, red);
                red++;
                white++;
            }
            else if(nums[white] == 1){
                white++;
            }
            else if(nums[white] == 2){
                swap(nums, white, blue);
                blue--;
            }
        }
    }
    public void swap(int[] nums, int n1, int n2){
        int temp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = temp;
    }
}



