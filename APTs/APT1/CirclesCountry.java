public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r, int x1, int y1, int x2, int y2) {
        int num = 0;
        for (int i = 0; i < x.length; i++){
            boolean inside1 = isInside (x[i], y[i], r[i], x1, y1);
            boolean inside2 = isInside (x[i], y[i], r[i], x2, y2);
            if (inside1 && !inside2) {
                num++;
            }
            else if (inside2 && !inside1){
                num++;
            }
        }
        return num;
    }
    public boolean isInside (int cx, int cy, int r, int x, int y){
        boolean inside = false;
        double distance2;
        distance2 = (Math.pow(cx-x, 2) + Math.pow(cy-y, 2));
        double distance = Math.sqrt(distance2);
        if (distance < r) {
            inside = true;
        }
        return inside;
    }
}
