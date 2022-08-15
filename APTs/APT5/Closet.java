import java.util.TreeSet;
public class Closet {
    public String anywhere(String[] list) {
        TreeSet <String> closet = new TreeSet<>();
        for (String s: list){
            String [] word = s.split(" ");
            for (String w: word){
                closet.add(w);
            }
        }
        return String.join(" ", closet);
    }
}