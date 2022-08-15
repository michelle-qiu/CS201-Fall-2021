import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
public class SetAside {
    public String common(String[] list) {
        HashMap <String, Integer> common = new HashMap <String, Integer>();
        ArrayList <String> com = new ArrayList <>();
        for (String x : list){
            String [] words = x.split(" ");
            HashMap <String, Integer> commo = new HashMap <String, Integer>();
            for (int i = 0; i<words.length; i ++){
                commo.putIfAbsent(words[i], 0);
                commo.put(words[i], commo.get(words[i]) + 1);
            }
            for (String j: commo.keySet()){
                common.putIfAbsent(j, 0);
                common.put(j, common.get(j) + 1);
            }
        }
        for (String k: common.keySet()){
            if (common.get(k) == list.length){
                com.add(k);
            }
        }
        Collections.sort(com);
        return String.join(" ", com);
    }
}