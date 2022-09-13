public class Codec {
    // Encodes a tree to a single string.
    String ser;
    public String serialize(TreeNode root) {
        ser = "";
        helper(root);
        return ser;
    }
    public void helper(TreeNode root){
        if(root==null){
            ser += "#,";
            return;
        }
        ser += String.valueOf(root.val) + ",";
        helper(root.left);
        helper(root.right);
 
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        List<String> list = new LinkedList<String>(Arrays.asList(arr));
        return createTree(list);
    }
    public TreeNode createTree(List<String> list){
        if(list.get(0).equals("#")){
            list.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(list.get(0)));
        list.remove(0);
        root.left = createTree(list);
        root.right = createTree(list);
        
        return root;
    }
}

//

