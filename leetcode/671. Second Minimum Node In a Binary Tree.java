class Solution {
    private int firstMin;
    private long secondMin;
    public int findSecondMinimumValue(TreeNode root) {
        firstMin = root.val;
        secondMin = Long.MAX_VALUE;
        preorder(root);
        return secondMin == Long.MAX_VALUE ? -1 : (int) secondMin;
    }
    private void preorder(TreeNode root){
        if(root==null) return;
        if(root.val > firstMin && root.val < secondMin){
            secondMin = root.val;
        }
        preorder(root.left);
        preorder(root.right);
    }
}

// if 1 <= Node.val < 231 - 1 
// that mean Node.val < Integer.MAX_VALUE
class Solution {
    private int firstMin;
    private int secondMin;
    public int findSecondMinimumValue(TreeNode root) {
        firstMin = root.val;
        secondMin = Integer.MAX_VALUE;
        preorder(root);
        return secondMin = secondMin == Integer.MAX_VALUE ? -1 : secondMin;
    }
    private void preorder(TreeNode root){
        if(root==null) return;
        if(root.val > firstMin && root.val < secondMin){
            secondMin = root.val;
        }
        preorder(root.left);
        preorder(root.right);
    }
}

//
class Solution {
    List<Integer> list;
    public int findSecondMinimumValue(TreeNode root) {
        list = new ArrayList();
        preorder(root, root.val);
        
        Collections.sort(list);
        return list.size()==0 ? -1 : list.get(0);
    }
    private void preorder(TreeNode root, int firstMin){
        if(root==null) return;
        if(root.val != firstMin){
            list.add(root.val);
        }
        preorder(root.left, firstMin);
        preorder(root.right, firstMin);
    }
}
//


