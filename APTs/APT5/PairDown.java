import java.util.ArrayList;
public class PairDown {
    public int[] fold(int[] list) {
        ArrayList<Integer> folded = new ArrayList <>();
        for (int i = 0; i<list.length; i++){
            if (i%2 == 0 && i+1<list.length){
                folded.add(list[i]+list[i+1]);
            }
            else if (((list.length % 2) != 0) && (i == list.length - 1)){
                folded.add(list[i]);
            }
        }
        int [] folder = new int [folded.size()];
        for (int x = 0; x < folded.size(); x++){
            folder[x] = folded.get(x);
        }
        return folder;
    }
}