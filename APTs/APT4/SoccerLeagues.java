public class SoccerLeagues {
    public int[] points(String[] matches) {
        int [] point = new int [matches.length];
        for (int i = 0; i<matches.length; i++){
            char [] ii = matches[i].toCharArray();
            for (int j = 0; j<ii.length; j++){
                if (ii[j]==87){
                    point[i] += 3;
                }
                else if (ii[j]==76){
                    point[j]+=3;
                }
                else if (ii[j]==68) {
                    point[j] += 1;
                    point[i] += 1;
                }
            }
        }
        return point;
    }
}