public class MergeLists {
    public ListNode weave (ListNode a, ListNode b) {
        ListNode first = new ListNode(a.info, null);
        ListNode f = first;
        ListNode tempa = a;
        ListNode tempb = b;
        if (tempa.next != null){
            tempa = tempa.next;
            while (tempa != null && tempb != null){
                f.next = new ListNode(tempb.info,null);
                f = f.next;
                f.next = new ListNode(tempa.info,null);
                f = f.next;
                tempa = tempa.next;
                tempb = tempb.next;
            }

        }
        f.next = new ListNode (tempb.info,null);
        return first;
    }
}