import java.util.*;
public class UniqueTreeValues {
    ArrayList <Integer> list = new ArrayList<>();
    public int[] unique(TreeNode root) {
        traverse(root);
        Collections.sort(list);
        int[]unique = new int[list.size()];
        for (int i = 0;i<list.size();i++){
            unique[i] = list.get(i);
        }
        return unique;
    }
    public void traverse(TreeNode t){
        if (t == null){
            return;
        }
        if (!list.contains(t.info)){
            list.add(t.info);
        }
        traverse(t.right);
        traverse(t.left);
    }
}
/*inOrder(root);
        int [] arr = new int[set.size()];
        ArrayList<Integer> ugh = new ArrayList<>();
        for (int i : set){
            ugh.add(i);
        }
        for (int i = 0; i<ugh.size(); i++){
            arr[i] = ugh.get(i);
        }

        return arr;
    }
    public void inOrder (TreeNode root){
        if (root!=null){
            inOrder(root.left);
            set.add(root.info);
            inOrder(root.right);
        }
    }*/