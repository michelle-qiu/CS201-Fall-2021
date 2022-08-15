import java.util.ArrayList;
public class BigWord {
    public String most (String [] sentences){
        ArrayList <String> all = new ArrayList <>();
        String most = "";
        String most2 = "";
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < sentences.length; i++){
            String [] element = (sentences[i].toLowerCase()).split(" ");
            for (int j = 0; j < element.length; j++){
                all.add(element[j]);
            }
        }
        for (int x = 0; x<all.size(); x++){
            for (int y = 0; y<all.size(); y++){
                if (x!=y && all.get(x).equals(all.get(y))){
                    if (all.get(x).equals(most)){
                        count++;
                    }
                    else if (!all.get(x).equals(most)){
                        most2 = all.get(x);
                        count2++;
                    }
                }
                if (count<count2){
                    count = count2;
                    count2 = 0;
                    most = most2;
                    most2 = "";
                }
            }
        }
        return most;
    }
}