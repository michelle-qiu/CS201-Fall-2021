import java.util.*;

public class EfficientMarkov extends BaseMarkov {
	private Map<String,ArrayList<String>> myMap;
	public EfficientMarkov(){
		this(5);
	}
	public EfficientMarkov(int order) {
		super(order);
		myMap = new HashMap<>();
	}
	@Override
	public void setTraining(String text) {
		super.setTraining(text);
		myMap.clear();
		for (int i = 0; i < myText.length(); i++) {
			String atext = myText.substring(i, i + myOrder);
			if (i < myText.length() - myOrder) {
				myMap.putIfAbsent(atext, new ArrayList<>());
				myMap.get(atext).add(myText.substring(i + myOrder, i + myOrder + 1));
			}
			if (i == myText.length() - myOrder) {
				myMap.putIfAbsent(atext, new ArrayList<>());
				myMap.get(atext).add(super.PSEUDO_EOS);
				break;
			}
		}
	}
	@Override
	public ArrayList<String> getFollows(String key) {
		if (myMap.get(key)!=null){
			return myMap.get(key);
		}
		else {
			throw new NoSuchElementException(key + " not in map");
		}
	}
}	
