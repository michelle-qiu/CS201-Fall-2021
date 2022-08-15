import java.util.*;
public class AllPaths {
    Map <Integer,String> map = new HashMap<>();
    public String[] paths(TreeNode t) {
        ArrayList<String> trail = new ArrayList<>();
        path(t,"");
        for (int i : map.keySet()){
            for (String s: map.get(i).split(" ")){
                trail.add(s);
            }
        }
        Collections.sort(trail);
        return trail.toArray(new String[0]);
    }
    public void path (TreeNode t, String word) {
        if (t == null) {
            return;
        }
        if (t.right==null && t.left==null) {
            word += "" + t.info;
            if (map.keySet().contains(t.info)){
                String cool = word+ " "+ map.get(t.info);
                map.put(t.info,cool);
            }
            map.putIfAbsent(t.info,word);
        }
        else {
            path(t.right, word+ t.info+ "->");
            path(t.left, word + t.info+ "->" );
        }
    }
}
