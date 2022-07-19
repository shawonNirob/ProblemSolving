class Solution {
    public int sumRootToLeaf(TreeNode root) {
        int totalSum=0, currSum=0;
        Deque<Pair<TreeNode, Integer>> stack = new ArrayDeque();
        stack.push(new Pair(root, 0));
        
        while(!stack.isEmpty()){
            Pair<TreeNode, Integer> curr = stack.pop();
            root = curr.getKey();
            currSum = curr.getValue();
            
            if(root!=null){
                currSum = currSum*2 + root.val;
                if(root.left==null && root.right==null){
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
    int sum=0;
    
    public int sumRootToLeaf(TreeNode root) {
        preOrder(root, 0);
        return sum;
    }
    public void preOrder(TreeNode root, int currSum){
        if(root==null ) return;
        currSum = (currSum<<1) | root.val;
        
        if(root.left==null && root.right==null){
            sum += currSum;
        }
        
        preOrder(root.left, currSum);
        preOrder(root.right, currSum);
    }
}

//
