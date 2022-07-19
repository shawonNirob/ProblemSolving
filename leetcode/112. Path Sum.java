class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        int currSum =0;
        Deque<Pair<TreeNode, Integer>> stack = new ArrayDeque();
        stack.push(new Pair(root, 0));
        
        while(!stack.isEmpty()){
            Pair<TreeNode, Integer> curr = stack.pop();
            root = curr.getKey();
            currSum = curr.getValue();
            
            if(root!=null){
                currSum = currSum + root.val;
                if(root.left==null && root.right ==null){
                    if(currSum == targetSum) return true;
                }else{
                    stack.push(new Pair(root.right, currSum));
                    stack.push(new Pair(root.left, currSum));
                }
            }
        }
        return false;
    }
}

//

class Solution {
    boolean sum = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        preOrder(root, 0, targetSum);
        if(sum) return true;
        return false;
    }
    public void preOrder(TreeNode root, int curr, int targetSum){
        if(root==null) return;
        curr = curr + root.val;
        if(root.left==null && root.right==null){
            if(curr == targetSum){
                sum = true;
            }
        }
        preOrder(root.left, curr, targetSum);
        preOrder(root.right, curr, targetSum);
    }
}

//
