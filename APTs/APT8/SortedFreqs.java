import java.util.*;
public class SortedFreqs {
    public int[] freqs(String[] data) {
        List<String> list = Arrays.asList(data);
        TreeSet<String> tree = new TreeSet<>();
        for (String s: list){
            tree.add(s);
        }
        ArrayList<Integer> num = new ArrayList<>();
        for (String s: tree){
            num.add(Collections.frequency(list,s));
        }
        int [] num1 = new int [num.size()];
        for (int i =0;i<num.size();i++){
            num1[i] = num.get(i);
        }
        return num1;
    }
}