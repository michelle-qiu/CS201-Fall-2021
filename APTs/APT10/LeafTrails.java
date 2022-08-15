import java.util.*;
public class LeafTrails {
    TreeMap <Integer,String> myMap = new TreeMap<>();
    public String[] trails(TreeNode tree) {
        ArrayList<String> trail = new ArrayList<>();

        traverse(tree,"");
        for (int i : myMap.keySet()){
            trail.add(myMap.get(i));
        }
        return trail.toArray(new String[0]);
    }
    public void traverse (TreeNode tree,String path){
        if (tree==null){
            return;
        }
        if(tree.right==null&&tree.left==null){
            myMap.put(tree.info,path);
        }
        traverse(tree.right,path + "1");
        traverse(tree.left,path+"0");
    }
}
