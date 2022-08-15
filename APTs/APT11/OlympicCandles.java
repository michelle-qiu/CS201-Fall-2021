import java.util.*;
public class OlympicCandles{
    public int numberOfNights(int[] candles){
        return count (candles);
    }
    public int count (int[]candles){
        int nc = candles.length;
        PriorityQueue <Integer> all = new PriorityQueue<>(Comparator.reverseOrder());
        for (int val : candles) {
            all.add(val);
        }
        for (int i = 1; i<=candles.length;i++){
            if (all.size()<i){
                return i-1;
            }
            ArrayList <Integer> cool= new ArrayList<>();
            for (int j=0;j<i;j++){
                int x = all.remove();
                x--;
                if (x>0){
                    cool.add(x);
                }
            }
            all.addAll(cool);
        }
        return candles.length;
    }
}