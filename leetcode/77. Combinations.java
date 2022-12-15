//ARRAY 
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=i+1;
        }
        helper(0,arr,ans, new ArrayList(), k);
        return ans;
    }
    public void helper(int index, int[] arr, List<List<Integer>> ans, List<Integer> list, int k){
        if(list.size()==k){
            ans.add(new ArrayList(list));
            return;
        }
        for(int i=index; i<arr.length; i++){
            list.add(arr[i]);
            helper(i+1,arr,ans,list,k);
            list.remove(list.size()-1);
        }
    }
}

//Without Array
