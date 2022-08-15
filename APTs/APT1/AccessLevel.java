public class AccessLevel{
    public String canAccess(int[] rights, int minPermission) {
        String allow = "";
        for (int i = 0; i<rights.length; i++){
            if (rights[i]<minPermission){
                allow += "D";
            }
            else if (rights[i]>=minPermission){
                allow+= "A";
            }
        }
        return allow;
    }
}
