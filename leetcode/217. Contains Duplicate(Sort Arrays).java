
package leetCode;

//import java.util.HashMap;
//import java.util.Map;
import java.util.Arrays;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    /*
        HashMap<Integer, Integer> cal = new HashMap<>();
        for(int i=0;i<nums.length; i++){
            cal.put(nums[i], 1);
            if(cal.containsKey(nums[i])){

            }
        }

     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        ContainsDuplicate cal = new ContainsDuplicate();
        System.out.println(cal.containsDuplicate(nums));
    }
}
//
