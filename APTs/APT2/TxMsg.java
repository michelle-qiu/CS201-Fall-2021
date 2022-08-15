import java.util.ArrayList;

public class TxMsg {
    public String getMessage(String original) {
        String[] words = original.split(" ");
        String[] message = new String[words.length];
        for (int k = 0; k < words.length; k++) {
            message[k] = convert(words[k]);
        }
        return String.join(" ", message);
    }

    public String convert(String d) {
        String vowels = "aeiou";
        String txt = "";
        int numvowels = 0;
        for (int x = 0; x < vowels.length(); x++) {
            for (int y = 0; y<d.length(); y++)
            if (d.substring(y, y+1).equals(vowels.substring(x, x+1))) {
                numvowels ++;
            }
        }
        if (numvowels == 0) { // no vowels
            txt += d.substring(0, 1);
        } else if (numvowels == d.length()) {//all vowels
            txt += d;
        } else if (numvowels < d.length()) { //some vowels
            for (int i = 0; i < d.length(); i++) {
                if (!vowels.contains(d.substring(i, i + 1))) {
                    if (i == 0) {
                        txt += d.substring(i, i + 1);
                    } else if (i != 0 & vowels.contains(d.substring(i - 1, i))) {
                        txt += d.substring(i, i + 1);
                    }
                }
            }
        }
        return txt;
    }
}







        /*for (int i = 0; i < d.length() ; i++) {
            String let = d.substring(i, i + 1);
            String letaft = d.substring(i, i + 1);
                if (d.contains(vowels.substring(i,i+1))){
                    if (!vowels.contains(let)) { //if it is a consonant
                        if (i != 0 && vowels.contains(d.substring(i - 1, i))) { //if there is not a consonant before
                            txt += let;
                        }
                        else if (i==0){
                            txt+=let;
                        }
                    }
                    else if (vowels.contains(let)){
                        if (i==0 && d.contains)
                        if (i!=0){
                            if (vowels.contains)
                        }
                    }
                }
            }
        }
        return txt;
    }
}
        if (vowels.contains(let)){
                if (vowels.contains(letaft)){
                    txt += let;
                }
                else {
                    d = d.substring(i+1);
                    i = 0;
                }
            }
            else { //if it is a consonant
                if (i!=0 && vowels.contains(letbef)){ //if there is not a consonant before
                    txt += let;
                }
                if (vowe)
            }
        }
        return t*/
/*        char [] cool = d.toCharArray();
        char [] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i<cool.length - 1; i++){
            for (int j = 0; j<vowels.length; j++) {
                if (!(vowels[j] == cool[i])) {//if it has a consonant
                    if (!(vowels[j] == cool[i+1])){

                    }
                } else if (vowels[j] == cool[i]) { //if it has a vowel
                    if (!(vowels[j] == cool[i+1])) {

                    }
                }
            }
        */
