public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        int num = 0;
        int [] hcount = getCounts(headlines);
        for (int i = 0; i<messages.length; i++){
            String [] mess = messages[i].split("");
            int [] mcount = getCounts(mess);
            boolean c = true;
            for (int z = 0; z<123; z++ ){
                mcount[32] = 1;
                hcount[32] = 1;
                if (mcount[z]>hcount[z]) {
                    c = false;
                }
            }
            if (c == true){
                num ++;
            }
        }
        return num;
    }
    private int [] getCounts (String [] strings) {
        int [] counts = new int [123];
        for (String s: strings){
            for (char ch: s.toLowerCase().toCharArray()){
                counts [ch] ++;
            }
        }
        return counts;
    }
}