import java.util.TreeSet;
import java.util.ArrayList;
public class AlphaLength {
    public ListNode create(String[] words) {
        TreeSet<String> tree = new TreeSet<>();
        for (String s : words) {
            tree.add(s);
        }
        String x = tree.first();
        ListNode first = new ListNode(tree.first().length(), null);
        ListNode f = first;
        tree.remove(x);
        while (tree.size() > 0) {
            x = tree.first();
            f.next = new ListNode(tree.first().length(), null);
            f = f.next;
            tree.remove(x);
        }
        return first;
    }
}
        /*if (tree.size()>0){
            ListNode first = ListNode (tree.get(tree.size()-1), null);
            if (tree.size()>1) {
                ListNode last = first.next;
                for (int l = 2; l < tree.size(); l++) {
                    last.next = new ListNode(tree.get(l), null);
                    last = last.next;
                }
            }
        }
        else{
            ListNode first = null;
        }
        return first;
    }
}*/