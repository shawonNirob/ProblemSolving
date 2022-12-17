class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        HashMap<Integer,Integer> map = new HashMap();
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        solve(n, map, new ArrayList(), ans);
        return ans;
    }
    public void solve(int n, HashMap<Integer, Integer> map, List<Integer> list,List<List<Integer>> ans){
        if(list.size()==n){
            ans.add(new ArrayList(list));
            return;
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int num  =entry.getKey();
            int value = entry.getValue();
            
            if(value==0) continue;

            list.add(num);
            map.put(num, value-1);
            solve(n, map, list, ans);
            list.remove(list.size()-1);
            map.put(num, value);
        }
    }
}
