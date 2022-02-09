package leetCode;

public class SlidingWindowProblem {
    public int Slide(int[] nums, int k){
        int maxSum =0;
        for(int i=0; i< nums.length-k+1; i++){
            int currentSum =0;
            for(int j=i; j<i+k; j++){
                currentSum += nums[j];
            }
            if(currentSum >maxSum){
                maxSum =currentSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,3,4,2};
        int k =3;
        SlidingWindowProblem cal = new SlidingWindowProblem();
        System.out.println("Maximum Sum: "+cal.Slide(nums, k));
    }
}
//
package leetCode;

public class SlidingWindowProblem {
    public int Slide(int[] nums, int k){
        int maxSum =0;
        for(int i=0; i< nums.length-k+1; i++){
            int currentSum =0;
            for(int j=i; j<i+k; j++){
                currentSum += nums[j];
            }
            maxSum = Math.max(currentSum, maxSum);
            }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,3,4,2};
        int k =3;
        SlidingWindowProblem cal = new SlidingWindowProblem();
        System.out.println("Maximum Sum: "+cal.Slide(nums, k));
    }
}
//
