public class CounterAttack {
    public int[] analyze(String str, String [] words){
        int [] elements = new int [words.length];
        String [] wor = str.split(" ");
        for (int j = 0; j < words.length; j++ ) {
            int count = 0;
            for (int i = 0; i < wor.length; i++) {
                if (wor[i].equals(words[j])) {
                    count++;
                }
            }
            elements[j] = count;
        }
        return elements;
    }
}