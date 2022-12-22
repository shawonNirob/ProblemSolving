
//Time Limit Exceeded
class Solution {
    public String str = "";
    public int p  = 1;
    public String getPermutation(int n, int k){
        helper(new HashSet(), "", 1, n, k);
        return str;
    }
    public void helper(Set<Integer> set, String s, int start, int n, int k){
        if(s.length()==n){
            if(p==k) str = s;
            p++;
            return;
        }
        for(int i=start; i<=n; i++){
            if(!set.contains(i)){
                set.add(i);
                helper(set, s + i, start, n, k);
                set.remove(i);
            }
        }
    }
}

//
