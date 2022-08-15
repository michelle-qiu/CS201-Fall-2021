public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc){
        int max = 0;
        int max2 = 0;
        int place = 0;
        int place2 = 0;
        String word = "";
        for (int i = 0; i<strands.length; i++){
            max = 0;
            for(int x = 0; x<strands[i].length(); x++){
                if ((strands[i].substring(x, x+1).equals (nuc))){
                    max++;
                    place = i;
                }
            }
            int cool= max;
            if (cool>max2){
                max2 = cool;
                place2 = place;
            }
            else if (cool == max2){
                if (strands[place].length()>strands[place2].length()){
                    place2 = place;
                }
            }
        }
        word = strands[place2];
        if (place2 == 0 && max2 == 0){
            word = "";
        }
        return word;
    }
}
