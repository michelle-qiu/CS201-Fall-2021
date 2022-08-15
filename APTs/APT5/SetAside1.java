import java.util.TreeSet;
public class SetAside {
    public String common(String[] list) {
        TreeSet<String> common = new TreeSet<String>(Arrays.asList(list[0]. split(" ")));
        for (int i = 0; i<list.length; i++){
            common.retainAll(new TreeSet<>(Arrays.asList(list[i].split(" "))));
        }
        return String.join(" ", common);
    }
}