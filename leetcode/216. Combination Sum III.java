class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList();
        if(k>n) return ans;
        solve(1,k,n,ans,new ArrayList());
        return ans;
    }
    public void solve(int first, int k, int target, List<List<Integer>> ans, List<Integer> list){
        if(list.size()==k){
            if(target==0){
                ans.add(new ArrayList(list));
            }
            return;
        }

        for(int i=first; i<=9; i++){
            list.add(i);
            solve(i+1,k,target-i,ans,list);
            list.remove(list.size()-1);
        }
    }
}

TC important 
