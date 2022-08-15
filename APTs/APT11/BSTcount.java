import java.util.*;
public class BSTcount {
    HashMap <Integer, Long> ct = new HashMap<>();
    public long howMany(int[] values) {
        int c = values.length;
         return count(c);
    }
    public long count (int c){
        long coo = 0;
        if (c <=1){
            return 1;
        }
        if (ct.containsKey(c)) {
            return ct.get(c);
        }
        for (int i = 0; i < c; i++) {
            coo += count(i) * count (c-1 - i);
            ct.put(c, coo);
        }
        return coo;
        /*
        for (int i =0;i<=c-1;i++){
            if (c==0){
                return 1;
            }
            ct.putIfAbsent(c, ct.get(c-1-i));
            int x = c-1;
            //to get the number of different bsts available, we would have to take ct.get(c-1) *2 + ct.get(c-2)*2 + ct.get(c-3)*2+ ct.get(c-4)*2 until we get to c - 1/
            ct.put(c,count(x)*count(c-x));
        }
        return ct.get(c-2);*/
    }
}