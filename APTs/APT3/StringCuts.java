import java.util.ArrayList;
public class StringCuts{
    public String [] filter (String[] list, int minLength){
        ArrayList <String> unique = new ArrayList <>();
        for (int i = 0; i<list.length; i++){
            if (enough(list[i], minLength) && !unique.contains(list[i])){
                unique.add(list[i]);
            }
        }
        String [] filtered = new String[unique.size()];
        for (int j = 0; j<unique.size(); j++){
            filtered [j] = unique.get(j);
        }
        return filtered;
    }
    public boolean enough (String word, int length){
        if (word.length()>=length){
            return true;
        }
        return false;
    }
}