import java.util.HashMap;
import java.util.HashSet;
import java.util.Collections;
import java.util.ArrayList;
public class Aaagmnrs {
    public String[] anagrams(String[] phrases) {
        HashMap<String, ArrayList<Integer>> maplist = new HashMap<>();
        for (int i = 0; i < phrases.length; i++){
            String [] one = ((phrases[i].toLowerCase()).split(""));
            ArrayList<String> sone = new ArrayList<>();
            for (String x1: one){
                if (!x1.equals (" ")) {
                    sone.add(x1);
                }
            }
            Collections.sort(sone);
            String alpha = String.join("", sone);
            maplist.putIfAbsent(alpha, new ArrayList<Integer>());
            maplist.get(alpha).add(i);
        }
        ArrayList<String> total = new ArrayList<String>();
        HashMap <String, Integer> cort = new HashMap<>();
        for (String y : maplist.keySet()){
            Collections.sort(maplist.get(y));
            int first = (maplist.get(y)).get(0);
            cort.put(y, first);
        }
        int count = 0;
        while (count<phrases.length){
            for (String x: cort.keySet()) {
                if (cort.get(x)==count) {
                    total.add(phrases[cort.get(x)]);
                }

            }
            count++;
        }
        String [] tot = new String [total.size()];
        for (int i = 0; i<total.size(); i++){
            tot[i] = total.get(i);
        }
        return tot;
    }
}
     /*for (int i = 0; i<total.size(); i++ ){
            for (String y: cort.keySet()){
                if (cort.get(y)==count){
                    total.add(phrases[cort.get(y)]);
                }
            }
            count++;
            }*/
        /*ArrayList<HashMap<String, Integer>> maplist = new ArrayList<>();
        ArrayList<String> ags = new ArrayList<String>();
        for (int i = 0; i < phrases.length; i++) {
            for (int j = i + 1; j < phrases.length; j++) {
                if (getAna(phrases[i], phrases[j]) && i!=j) {
                    ags.add(phrases[i]);
                } else {
                    ags.add(phrases[i]);
                }
            }
        }
        String [] ag = new String [ags.size()];
        for (int x = 0; x<ags.size();x++){
            ag[x] = ags.get(x);
        }
        return ag;
    }

    public boolean getAna(String s1, String s2) {
        ArrayList<String> sone = new ArrayList<>();
        ArrayList<String> stwo = new ArrayList<>();
        String [] ssone = (s1.toLowerCase().split(""));
        String [] sstwo = (s2.toLowerCase().split(""));
        for (String x1:ssone){
            sone.add(x1);
        }
        for (String x2:sstwo){
            stwo.add(x2);
        }
        Collections.sort(sone);
        Collections.sort(stwo);
        boolean cool = true;
        for (String x : sone) {
            for (String y : stwo) {
                if (!x.equals(y)) {
                    cool = false;
                }
            }
        }
        return cool;
    }
}
 */
         /*   HashMap <String, Integer> map = new HashMap <> ();
            String [] word = (phrases[i].toLowerCase().split(""));
            //ArrayList<String> word = Arrays.asList(phrases[i].split("").toLowerCase());
            for (String s: word){
                map.putIfAbsent(s, 0);
                map.put(s, map.get(s) + 1);
            }
            maplist.add(map);
        }
        for (int i = 0; i<maplist.size(); i++){
            for (int j = i+1; j<maplist.size(); j++){
                Set <String> setkeys1 = maplist.get(i).keySet();
                Set <String> setkeys2 = maplist.get(j).keySet();
                ArrayList <String> not = new ArrayList<>();
                boolean cool = true;
                for(String s1 : setkeys1){
                    for (String s2: setkeys2){
                        if (!(maplist.get(i).get(s1)).equals(maplist.get(j).get(s2)) && not.contains(maplist.get(j).get(s2))){
                            cool = false;
                        }
                    }
                }
                if (cool != true){
                    ags.add(phrases[i]);
                }
                if (cool = true){
                    ags.add(phrases[i]);
                    not.add(phrases[j]);
                }
            }
        }
        String [] ag = new String [ags.size()];
        ArrayList <String> a = ags.toList();
        for (int x = 0; x<ags.size();x++){
            ag[x] = a.get(x);
        }
        return ag;
    }
}*/