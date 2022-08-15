import java.util.*;
public class LeafCollector {
    public String[] getLeaves(TreeNode tree) {
        ArrayList <String> total = new ArrayList<>();
        int num = height(tree);
        while (num>0){
            ArrayList <String> level = new ArrayList<>();
            collectAndRemove(tree, level);
            total.add(String.join(" ",level));
            num--;
        }
        return total.toArray(new String[0]);

    }
    private void collectAndRemove(TreeNode root, List<String> list){
        if (root == null){
            return;
        }
        else if (isLeaf(root)){
            list.add("" + root.info);
            root = null;
            }
        else{
            if (isLeaf(root.left)) {
                list.add("" + root.left.info);
                root.left = null;
            }
            collectAndRemove(root.left, list);
            if (isLeaf(root.right)) {
                list.add("" + root.right.info);
                root.right = null;
            }
            collectAndRemove(root.right, list);
        }
    }
    public boolean isLeaf(TreeNode root){
        boolean cool = false;
        if (root !=null && root.left == null && root.right ==null){
            cool= true;
        }
        return cool;
    }
    public int height (TreeNode root){
        if (root == null){
            return 0;
        }
        return 1 + Math.max(height(root.left),height(root.right));
    }
}