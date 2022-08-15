public class HeightLabel {
    public TreeNode rewire(TreeNode t) {
        if (t == null){
            return null;
        }
        return new TreeNode (height(t), rewire(t.left),rewire(t.right));
    }
    public int height (TreeNode t){
        if (t==null){
            return 0;
        }
        return Math.max(1+height(t.right),1+height(t.left));
    }
}
