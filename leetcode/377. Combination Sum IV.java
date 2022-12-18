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


//HashMap with int helper
class Solution {
    public HashMap<Integer, Integer> map;

    public int combinationSum4(int[] nums, int target) {
        map = new HashMap();
        return helper(target, nums, map);
    }
    public int helper(int target, int[] nums, HashMap<Integer, Integer> map){
        if(target==0) return 1;
        if(map.containsKey(target)) return map.get(target);

        int result = 0;
        for(int i=0; i<nums.length; i++){
            if(target-nums[i]>=0)
                result += helper(target-nums[i], nums, map);
        }
        map.put(target, result);
        return result;
    }
}

//

