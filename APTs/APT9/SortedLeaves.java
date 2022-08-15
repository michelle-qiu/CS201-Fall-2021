import java.util.ArrayList;
import java.util.Collections;
public class SortedLeaves {
    public String[] values(TreeNode tree) {
        ArrayList<String> myList = new ArrayList<String>();
        leaf(tree,myList);
        Collections.sort(myList);
        return myList.toArray(new String[0]);
    }
    public void leaf (TreeNode t, ArrayList<String> myList){
        if (t ==null ){
            return;
        }
        if (t.right==null && t.left==null){
            myList.add(Character.toString((char)t.info));
        }
        leaf(t.right,myList);
        leaf(t.left,myList);
    }
}
