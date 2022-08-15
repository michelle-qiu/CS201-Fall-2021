import java.util.ArrayList;

public class SimpleWordGame {
    public int points (String[] player, String[] dictionary){
        int pts = 0;
        ArrayList <String> unique = new ArrayList <String> ();
        for (int i = 0; i<player.length; i++){
            for (int j  = 0; j<dictionary.length; j++){
                if (player[i].equals (dictionary[j]) && !unique.contains(player[i])){
                    unique.add(player[i]);
                }
            }
        }
        for (int x = 0; x<unique.size(); x++){
            pts += Math.pow ((unique.get(x).length()), 2);
        }
        return pts;
    }
}
