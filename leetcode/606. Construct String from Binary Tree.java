public String str;
    public String tree2str(TreeNode root) {
        str = "";
        preorder(root);
        return str;
    }
    public void preorder(TreeNode root){
        if(root != null){
            str +=root.val;
            if(root.left != null || root.right != null){
                str += "(";
                preorder(root.left);
                str += ")";
                
                if(root.right != null){
                    str += "(";
                    preorder(root.right);
                    str += ")";
                }
            }
        }
    }

//

