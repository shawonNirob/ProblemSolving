package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NextList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10,5,4,3,2,8,12,6,4));

        Stack<Integer> numsStack = new Stack<>();
        int [] output =new int[nums.size()];
        for(int i=0; i< nums.size(); i++){
            while (!numsStack.isEmpty() && nums.get(numsStack.peek()) < nums.get(i)){
                output[numsStack.pop()] = nums.get(i);
            }
            numsStack.push(i);
        }
        System.out.println(nums);
        System.out.println(numsStack);
        for(int i=0; i< nums.size(); i++){
            System.out.print(" "+output[i]);
        }

    }
}
