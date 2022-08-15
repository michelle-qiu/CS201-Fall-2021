import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Random;

public class EfficientWordMarkov extends BaseWordMarkov {
    private HashMap<WordGram, ArrayList<String>> map;
    private String[] myWords;

    public EfficientWordMarkov(){
        this(3);
    }
    public EfficientWordMarkov(int order) {
        super(order);
        map = new HashMap<>();

    }
    public void setTraining(String text) {
        super.setTraining(text);
        map.clear();
        myWords = text.split("\\s+");
        for (int i = 0; i < myWords.length; i++) {
            WordGram current = new WordGram(myWords,i,myOrder);
            if (i < myWords.length - myOrder) {
                map.putIfAbsent(current, new ArrayList<>());
                (map.get(current)).add(myWords[i+myOrder]);
            }
            if (i == myWords.length - myOrder) {
                map.putIfAbsent(current, new ArrayList<>());
                map.get(current).add(super.PSEUDO_EOS);
                break;

            }
        }
    }
    @Override
    public ArrayList<String> getFollows(WordGram key) {
        if (map.get(key)!=null){
            return map.get(key);
        }
        else {
            throw new NoSuchElementException(key + " not in map");
        }
    }

}
