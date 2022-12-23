
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

class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> list = new ArrayList();
        int fact = 1;
        for(int i=1; i<=n; i++){
            list.add(i);
            fact = fact * i;
        }
        fact /= n;
        k -= 1;
        String str = "";

        while(true){
            int ind = k/fact;
            str += list.get(ind);
            list.remove(ind);

            if(list.size()==0){
                break;
            }
            k %= fact;
            fact /= list.size();
        }

        return str;

    }
}

//TC --- O(n) * O(n)
//SC ---- O(n)

class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> list = new ArrayList();
        int fact = 1;
        for(int i=1; i<=n; i++){
            list.add(i);
            fact = fact * i;
        }
        fact /= n;
        k -= 1;
        String str = "";

        while(true){
            int ind = k/fact;
            str += list.get(ind);
            list.remove(ind);

            if(list.size() != 0){
                k %= fact;
                fact /= list.size();
            }else{
                break;
            }
        }

        return str;

    }
}


