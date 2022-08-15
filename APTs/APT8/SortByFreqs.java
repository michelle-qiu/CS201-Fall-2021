import java.util.*;
public class SortByFreqs{
    public String[] sort(String[] data) {
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String s: data){
            map.putIfAbsent(s, 0);
            map.put(s, map.get(s) + 1);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, Map.Entry.comparingByValue(Comparator.reverseOrder()));
        ArrayList<String> uniString = new ArrayList<String>();

        for (Map.Entry x: list){
            String s = (String) x.getKey();
            uniString.add(s);
        }
        String [] uni = uniString.toArray(new String[0]);
        return uni;
    }
}
