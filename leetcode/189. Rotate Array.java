package leetCode;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        System.out.println(k);
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0,k-1);
        reverse(nums, k, nums.length-1);
    }
        public int reverse(int [] nums, int i, int j){
            int temp;
            while(i<j){
                temp=nums[i];
                nums[i] = nums[j];
                nums[j] =temp;
                i++;
                j--;
            }
            for(int count=0; count<nums.length; count++){
                System.out.print(nums[count] +"\t");
            }
            System.out.println();
            return 0;
        }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        int k=3;
        RotateArray call = new RotateArray();
        call.rotate(nums,k);
    }
}
