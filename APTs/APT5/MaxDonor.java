import java.util.HashMap
public class MaxDonor {
    public String generous(String[] orgs, int[] amount) {
        HashMap <String, Integer> generous = new HashMap <>();
        for (int i = 0; i<amount.length; i++){
            generous.putIfAbsent(orgs[i], 0);
            generous.put(orgs[i], generous.get(orgs[i]) + amount[i]);
        }
        Set <Integer> vals = new Set<>();
        for (int x : generous.keySet()){
            vals.add(x);
        }
        int max = Collections.max(vals);
        return generous.get(max) + ":$" + max;
    }
}