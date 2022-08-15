import java.util.*;
public class MedalTable {
    private class MedalCountry{
        String myName;
        int myGold;
        int mySilver;
        int myBronze;
        MedalCountry(String name){
            myName = name;
            myGold = 0;
            mySilver = 0;
            myBronze = 0;
        }
        public int getGold(){
            return myGold;
        }
        public int getSilver(){
            return mySilver;
        }
        public int getBronze(){
            return myBronze;
        }
        public String getName(){
            return myName;
        }
        @Override
        public String toString(){
            return String.format("%s %d %d %d", myName, myGold, mySilver, myBronze);
        }
    }
    public String[] generate(String[] results) {
        Map<String, MedalCountry> map = new HashMap<>();
        for (String s : results){
            String [] data = s.split(" ");
            for (int i =0; i<data.length; i++){
                if (!map.containsKey(data[i])){
                    map.put(data[i],new MedalCountry(data[i]));
                }
                if (i == 0){
                    map.get(data[i]).myGold+=1;
                }
                if (i == 1){
                    map.get(data[i]).mySilver+=1;
                }
                if (i == 2){
                    map.get(data[i]).myBronze+=1;
                }
            }
        }
        ArrayList<MedalCountry> list = new ArrayList<>(map.values());
        list.sort(Comparator.comparing(MedalCountry::getName));
        list.sort(Collections.reverseOrder(Comparator.comparing(MedalCountry::getBronze)));
        list.sort(Collections.reverseOrder(Comparator.comparing(MedalCountry::getSilver)));
        list.sort(Collections.reverseOrder(Comparator.comparing(MedalCountry::getGold)));
        ArrayList<String> l = new ArrayList<>();
        for (MedalCountry x: list){
            l.add(x.toString());
        }
        return l.toArray(new String [0]);
    }
}
/*ArrayList <String> medals = new ArrayList<>();
        for (String s: results){
            //String [] lets = s.split("");
            String [] countries = s.split(" ");
            for (int i = 0; i<3; i++){
                medals.add(countries[i] + " ");
                String place = Integer.toString()
            }
        }*/