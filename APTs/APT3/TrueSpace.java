public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize){
        long num = 0;
        for (int i = 0; i < sizes.length; i++){
            num += ((sizes[i]) / clusterSize);
            if ((sizes[i] % clusterSize) > 0){
                num ++;
            }
        }
        return clusterSize * num;
    }
}