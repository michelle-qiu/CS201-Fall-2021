public class LevelCount {
    public int count(TreeNode t, int level) {
        if (level ==0 && t!=null){
            return 1;
        }
        if (t==null){
            return 0;
        }
       return count(t.right,level-1)+count(t.left,level-1);
    }
}
