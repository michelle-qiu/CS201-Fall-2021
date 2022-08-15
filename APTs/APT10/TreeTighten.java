public class TreeTighten {
    public TreeNode tighten(TreeNode t) {
        return traverse(t);
    }
    public TreeNode traverse (TreeNode t){
        if (t==null){
            return t;
        }
        t.left = traverse(t.left);
        t.right = traverse(t.right);
        if (t.right!=null&&t.left==null) {
            t=t.right;
        }
        if (t.left!=null&&t.right==null) {
            t=t.left;
        }
        return t;
    }
}
