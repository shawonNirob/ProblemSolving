//
class Solution {
    int preIndex;
    Map<Integer, Integer> map;
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        map = new HashMap<>();
        preIndex = 0;
        for(int i = 0; i < post.length; i++)
            map.put(post[i], i);
        return helper(pre, 0, pre.length-1);
    }
    
    private TreeNode helper(int[] pre, int left, int right) {
        if(left > right) return null;
    
        TreeNode root = new TreeNode(pre[preIndex]);
        preIndex += 1;
        if(left == right) return root;
        
        int mid = map.get(pre[preIndex]);
        
        root.left = helper(pre, left, mid);
        root.right = helper(pre, mid+1, right-1);
        
        return root;
    }
}


//
class Solution {
    private int preIndex = 0, postIndex = 0;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        TreeNode root = new TreeNode(preorder[preIndex++]);
        if(root.val != postorder[postIndex]){
            root.left = constructFromPrePost(preorder, postorder);
        }
        if(root.val != postorder[postIndex]){
            root.right = constructFromPrePost(preorder, postorder);
        }
        postIndex++;
        
        return root;
    }
}
//


