import java.util.ArrayList;

public class Starter {
    public int begins(String[] words, String first) {
        int num = 0;
        ArrayList <String> newList = new ArrayList<String> ();
        for (int i = 0; i < words.length; i++) {
            if ((words[i].substring(0, 1)).equals(first)) {
                newList.add(words[i]);
                num++;
            }
        }
        for (int x = 0; x<newList.size(); x++){
            for (int y = x+1; y<newList.size(); y++){
                if (newList.get(x).equals(newList.get(y))){
                    newList.remove(y);
                    y--;
                    }
                }
            }
        return newList.size();
    }
}