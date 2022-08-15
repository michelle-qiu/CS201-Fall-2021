import java.util.ArrayList;

public class Common {
    public int count(String a, String b) {
        int common = 0;
        ArrayList <String> commonwords = new ArrayList<>();
        for (int i = 0; i<a.length(); i++){
            for (int j = 0; j<b.length(); j++) {
                if (a.substring(i,i+1).equals(b.substring(j,j+1)) && !commonwords.contains(a.substring(i,i+1))) {
                    int anum = numcount(a, a.substring(i,i+1));
                    int bnum = numcount(b, b.substring(j,j+1));
                    commonwords.add(a.substring(i,i+1));
                    common+= Math.min(anum, bnum);
                }

            }
        }
        return common;
    }
    public int numcount (String word, String letter){
        int count = 0;
        for (int x = 0; x<word.length(); x++){
            if (word.substring(x,x+1).equals(letter)){
                count ++;
            }
        }
        return count;
    }
}

