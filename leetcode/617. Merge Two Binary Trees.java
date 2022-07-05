/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 
 //Recursion
 class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null) return root2;
        if(root2 == null) return root1;
        
        root1.val += root2.val;
        
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        
        return root1;
    }
}
 
 
 //DFS
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null) return root2;
        Stack<TreeNode[]> stack = new Stack();
        stack.push(new TreeNode[] {root1, root2});
        
        while(!stack.isEmpty()){
            TreeNode[] root = stack.pop();
            if(root[1] == null) continue;
            
            root[0].val += root[1].val;
            if(root[0].left == null){
                root[0].left = root[1].left;
            }else{
                stack.push(new TreeNode[] {root[0].left, root[1].left});
            }
            if(root[0].right == null){
                root[0].right = root[1].right;
            }else{
                stack.push(new TreeNode[] {root[0].right, root[1].right});
            }
        }
        return root1;
    }
}


//BFS
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null) return root2;
        Queue<TreeNode[]> queue = new LinkedList();
        queue.add(new TreeNode[] {root1, root2});
        
        while(!queue.isEmpty()){
            TreeNode[] root = queue.poll();
            if(root[1] == null) continue;
            
            root[0].val += root[1].val;
            if(root[0].left == null){
                root[0].left = root[1].left;
            }else{
                queue.add(new TreeNode[] {root[0].left, root[1].left});
            }
            if(root[0].right == null){
                root[0].right = root[1].right;
            }else{
                queue.add(new TreeNode[] {root[0].right, root[1].right});
            }
        }
        return root1;
    }
}

