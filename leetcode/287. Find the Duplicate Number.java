//1 HashSet
class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return nums[i];
            }else{
                set.add(nums[i]);
            }
        }
        return 0;
    }
}

//2 Sort
//In Java, Arrays.sort() for primitives is implemented using a variant of the Quick Sort algorithm, which has a space complexity of O(\log n)O(logn)
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
}

//3


