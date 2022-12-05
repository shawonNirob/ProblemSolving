class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        helper(nums,ans,new ArrayList(),new HashSet());
        return ans;
    }
    public void helper(int[] arr, List<List<Integer>> ans, List<Integer> list, Set<Integer> set){
        if(list.size()==arr.length){
            ans.add(new ArrayList(list));
            return;
        }

        for(int i=0; i<arr.length; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                list.add(arr[i]);
                helper(arr, ans, list, set);
                set.remove(arr[i]);
                list.remove(list.size()-1);
            }
        }
    }
}


