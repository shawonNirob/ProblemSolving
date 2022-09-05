//
class Solution {
    public Set<Integer> set = new HashSet();
    public boolean findTarget(TreeNode root, int k) {
        if(root==null) return false;
        if(set.contains(k - root.val)){
            return true;
        }else{
            set.add(root.val);
        }
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}

//
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList();
        inorder(root, list);
        int left =0, right = list.size()-1;
        while(left < right){
            int sum = list.get(left) + list.get(right);
            if(sum == k)
                return true;
            else if(sum > k) right--;
            else left++;
        }
        return false;
    }
    public void inorder(TreeNode root, List<Integer> list){
        if(root==null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}

//
