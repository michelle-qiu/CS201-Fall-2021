import java.util.*;
public class PrefixCode {
    public String isOne(String[] words) {
        String ret = "Yes";
        int cool = 10000;
        HashMap <Integer, String> pre = new HashMap<>();
        for (int i = 0; i<words.length; i++){
            pre.put(i,words[i]);
            for (int x: pre.keySet()){
                String max = "";
                String min = "";
                int num = 0;
                if (Math.max(words[i].length(), pre.get(x).length())==words[i].length()){
                    max = words[i];
                    min = pre.get(x);
                    num = x;
                }
                else{
                    max = pre.get(x);
                    min = words[i];
                    num = i;
                }
                if (max.substring(0,min.length()).equals(min) &&x!=i && num<cool){
                    cool = num;
                }

            }
        }
        if (cool!=10000){
            ret = "No, "+cool;
        }
        return ret;

    }
}
/*Set<String> prefixes = new HashSet<String>();
        String cool = "Yes";
        prefixes.add(words[0]);
        for (int i = 1; i<words.length;i++){
            for (String s : prefixes) {
                if (s.length()<=words[i].length()){
                    if (words[i].substring(0,s.length()).equals(s)) {
                        cool = "No, " ;
                        i = words.length;
                    }
                }
                else if (s.length()>=words[i].length()){
                    if (s.substring(0,words[i].length()).equals(s)) {
                        cool = "No, " + i;
                        i = words.length;
                    }
                }

            }
            prefixes.add(words[i]);*/