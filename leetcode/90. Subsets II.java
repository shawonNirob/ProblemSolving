//Right 
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(nums);
        helper(0, nums, ans, new ArrayList());
        return ans;
    }
    public void helper(int index, int[] arr,List<List<Integer>> ans, List<Integer> list){
        ans.add(new ArrayList(list));

        for(int i=index; i<arr.length; i++){
            if(i > index && arr[i] == arr[i-1]) continue;

            list.add(arr[i]);
            helper(i+1, arr, ans, list);
            list.remove(list.size()-1);
        }
    }
}



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



