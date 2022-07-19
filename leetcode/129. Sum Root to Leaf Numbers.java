class Solution {
    public int sumNumbers(TreeNode root) {
        int totalSum=0, currSum=0;
        Deque<Pair<TreeNode, Integer>> stack = new ArrayDeque();
        stack.push(new Pair(root, 0));
        
        while(!stack.isEmpty()){
            Pair<TreeNode, Integer> curr = stack.pop();
            root = curr.getKey();
            currSum = curr.getValue();
            
            if(root!=null){
                currSum = currSum * 10 + root.val;
                if(root.left==null && root.right ==null){
                    totalSum += currSum;
                }else{
                    stack.push(new Pair(root.right, currSum));
                    stack.push(new Pair(root.left, currSum));
                }
            }
        }
        return totalSum;
    }
}

//
class Solution {
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        preOrder(root, 0);
        return sum;
    }
    public void preOrder(TreeNode root, int curr){
        if(root==null) return;
        curr = curr * 10 + root.val;
        if(root.left==null && root.right==null){
            sum += curr;
        }
        preOrder(root.left, curr);
        preOrder(root.right, curr);
    }
}
//


