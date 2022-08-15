public class Totality {
    public int sum(int[] a, String stype) {
        int x = 0;
        int y = 0;
        for (int i =0; i<a.length; i++){
            if (i%2==0){
                y+=a[i];
            }
            else if (i%2!=0){
                x+= a[i];
            }
        }
        if (stype.equals("odd")){
            return x;
        }
        else if (stype.equals("even")){
            return y;
        }
        else{
            return x + y ;
        }
    }
}
