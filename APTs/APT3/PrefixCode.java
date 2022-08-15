public class PrefixCode{
    public String isOne(String[] words) {
        String one = "Yes";
        for (int i = 0; i < words.length; i++){
            for (int j = 0; j < words.length; j++){
                if (i != j && words[j].length() > words[i].length()) {
                    if (words[j].substring(0, (words[i]).length()).equals(words[i])) {
                        one = "No, " + i;
                        i = words.length - 1 ;
                        j = words.length - 1;
                    }
                }
            }
        }
        return one;
    }
}