
//Wrong Answer
class Solution{
    public List<List<Integer>> subsetsWithDup(int[] nums){
        Set<List<Integer>> ans = new HashSet();
        helper(nums, 0, ans, new ArrayList());
        List<List<Integer>> finalAns = new ArrayList();
        
        finalAns.add(new ArrayList(ans));
        return finalAns;
    }
    public void helper(int[] arr, int index, Set<List<Integer>> ans, List<Integer> list){
        if(index >= arr.length){
            if(!ans.contains(list)){
                ans.add(new ArrayList(list));
            }
            return;
        }

        list.add(arr[index]);
        helper(arr, index+1, ans, list);
        list.remove(list.size()-1);
        helper(arr, index+1, ans, list);
    }
}

