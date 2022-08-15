import java.util.ArrayList;
import java.util.Arrays;

public class SandwichBar {
    public int whichOrder(String[] available, String[] orders) {
        int place = -1;
        ArrayList<String> avail = new ArrayList<>();
        ArrayList<String> order = new ArrayList<> ();
        for (int i = 0; i<available.length; i++){
            if (!avail.contains(available[i])){
                avail.add(available[i]);
            }
        }
        for (int z = 0; z<orders.length; z++){
            if (!order.contains(orders[z])){
                order.add(orders[z]);
            }
        }
        for (int j = 0; j < order.size(); j++) { //indexes through each potential order
            String[] element = (order.get(j)).split(" "); //splits each order into individual ingredients
            int comp = 0;
            for (int y = 0; y < element.length; y++){ // indexes through every ingredient of an order
                for (int x = 0; x < avail.size(); x++){
                    if (avail.get(x).equals(element[y])) {
                        comp++;
                    }
                }
            }
            if (comp == element.length) {
                String ord = order.get(j);
                place = (Arrays.asList(orders)).indexOf(ord);
                j = order.size();
            }
        }
        return place;
    }
}