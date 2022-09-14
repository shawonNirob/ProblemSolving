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
            return;
        }
        ser += String.valueOf(root.val) + ",";
        helper(root.left);
        helper(root.right);
 
    }

    // Decodes your encoded data to tree.
    int index;
    public TreeNode deserialize(String data) {
        if(data.length()==0) return null;
        String[] arr = data.split(",");
        index = 0;
        return createTree(arr, -1, 10001);
    }
    public TreeNode createTree(String[] arr, int min, int max){
        if(index < arr.length && min < Integer.valueOf(arr[index]) && max > Integer.valueOf(arr[index])){
            TreeNode root = new TreeNode(Integer.valueOf(arr[index++]));
            
            root.left = createTree(arr, min, root.val);
            root.right = createTree(arr, root.val, max);
            
            return root;
        }else{           
            return null;
        }
    }
}



//
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
            return;
        }
        ser += String.valueOf(root.val) + ",";
        helper(root.left);
        helper(root.right);
 
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0) return null;
        String[] arr = data.split(",");
        List<String> list = new LikedList<String>(Arrays.asList(arr));
        return createTree(list, -1, 10001);
    }
    public TreeNode createTree(List<String> list, int min, int max){
        if(!list.isEmpty() && min < Integer.valueOf(list.get(0)) && max > Integer.valueOf(list.get(0))){
            TreeNode root = new TreeNode(Integer.valueOf(list.get(0)));
            
            list.remove(0);
            root.left = createTree(list, min, root.val);
            root.right = createTree(list, root.val, max);
            
            return root;
        }else{           
            return null;
        }
    }
}
//
