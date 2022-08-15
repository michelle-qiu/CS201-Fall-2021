import java.util.HashMap;
public class Encryption {
       public String encrypt(String message){
           String abcd = "abcdefghijklmnopqrstuvwxyz";
           String [] abc = abcd.split("");
           String [] m = message.split("");
           String [] en = new String[message.length()];
           HashMap<String, String> mess = new HashMap <>();
           int let = 0;
           for (int i = 0; i < m.length; i++){
               if (!mess.containsKey(m[i])) {
                   mess.put(m[i], abc[let]);
                   let++;
               }
               en[i] = mess.get(m[i]);
           }
           return String.join("", en);
       }
   }