//Time Limit Exceeded
class Solution {
    public int ans;
    public int combinationSum4(int[] nums, int target) {
        ans = 0;
        helper(new ArrayList(), target, nums);
        return ans;
    }
    public void helper(List<Integer> list, int target, int[] nums){
        if(target==0){
            ans++;
            return;
        }
        if(target<0) return;
        for(int i=0; i<nums.length; i++){
            list.add(nums[i]);
            helper(list,target-nums[i],nums);
            list.remove(list.size()-1);
        }
    }
}


