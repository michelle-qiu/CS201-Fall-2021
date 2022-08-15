public class HuffmanDecoding {
    public String decode(String archive, String[] dictionary) {
        String [] code = new String [dictionary.length];
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i <dictionary.length;i++){//this for loop will make the dictionary correspond with the alphabetic element
            code[i] = abc.substring(i,i+1);
        }
            for (int i = 0;i<archive.length();i++) {
                for (int x = 0;x<dictionary.length;x++) {
                    if (archive.length()-i>=dictionary[x].length()&&archive.substring(i,i+dictionary[x].length()).equals(dictionary[x])) {
                    archive = archive.substring(0, i) + code[x] + archive.substring(i + dictionary[x].length());
                }
            }
        }
        return archive;
    }
}