import java.util.HashMap;
public class IsomorphicWords {
    public int countPairs(String[] words) {
        int total = 0;
        for (int j = 0; j<words.length; j++){
            String jword = iso(words[j]);
            for (int k = j+1; k<words.length; k++){
                String kword = iso(words[k]);
                if (jword.equals(kword)){
                    total++;
                }
            }
        }
        return total;
    }
    public String iso (String word){
        String abcd = "abcdefjklmnopqrstuvwxyz";
        String [] abc = abcd.split("");
        String [] w = word.split("");
        String [] isoword = new String[word.length()];
        HashMap<String,String> wordmap = new HashMap <> ();
        int let = 0;
        for (int i = 0; i < word.length(); i++){
            if (!wordmap.containsKey(w[i])) {
                wordmap.put(w[i],abc[let]);
                let++;
            }
            isoword[i] = wordmap.get(w[i]);
        }
        return String.join("", isoword);
    }
}