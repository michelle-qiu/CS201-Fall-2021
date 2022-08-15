import java.util.*;
public class FriendScore {
     Map <Integer, ArrayList<Integer>> myGraph;
    public int highestScore(String[] friends) {
        myGraph = new HashMap <Integer, ArrayList<Integer>>();
        int max = 0;
        for (int i = 0; i<friends.length; i++){//process of creating two friends graph
            myGraph.put(i,new ArrayList<Integer>());
            String curr = friends[i];//curr = current friend that we are on right now
            for (int z= 0; z<friends.length;z++){//going through all friends of the current person
                String a = ""+ curr.charAt(z);
                if (a.equals("Y")){
                    ArrayList<Integer> cool =  myGraph.get(i);
                    cool.add(z);
                    myGraph.put(i,cool);
                }
            }
        }
        for (int i=0; i<friends.length;i++){
            int num = twoFriends(i);
            if (num>max){
                max = num;
            }
        }
        return max;
    }
    private int twoFriends(int index){
        Set <Integer> set = new TreeSet<>();
        ArrayList <Integer> friends = myGraph.get(index);
        set.addAll(friends);
        for(int friend: friends){//here, we are checking which ones are indirect friends + adding to s
            ArrayList <Integer> f= myGraph.get(friend);
            set.addAll(f);
        }
        set.remove(index);
        return set.size();
    }
}
