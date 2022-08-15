public class PathSum {
    public int hasPath(int target, TreeNode tree){
        if (tree == null&&target == 0){
            return 1;
        }
        else if (tree==null&&target!=0){
            return 0;
        }
        return (Math.max(hasPath(target-tree.info, tree.right), hasPath(target-tree.info,tree.left)));
    }
}
