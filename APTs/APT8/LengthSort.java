import java.util.Arrays;
import java.util.Comparator;
public class LengthSort {
    public String[] rearrange(String[] values){
        String [] val = Arrays.copyOf(values, values.length);
        Arrays.sort(val, Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        return val;
    }
}