class Solution {
  public int minDepth(TreeNode root) {
    if(root==null) return 0;
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        
        int level =0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; ++i){
                TreeNode node =queue.poll();
                if(node.left==null && node.right==null) return level+1;
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            level++;
        }
        return level;
  }
}

//
class Solution {
  public int minDepth(TreeNode root) {
    if (root == null) return 0;

    int left = minDepth(root.left);
    int right = minDepth(root.right);

    return (left == 0 || right == 0) ? left + right + 1 : Math.min(left,right) +1;
  }
}

  
