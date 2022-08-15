import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.*;

public class MemberCheck {
    public String[] whosDishonest(String[] club1, String[] club2, String[] club3) {
        HashSet <String> res = new HashSet<> ();
        Set<String> s1 = new HashSet(Arrays.asList(club1));
        Set<String> s2 = new HashSet(Arrays.asList(club2));
        Set<String> s3 = new HashSet(Arrays.asList(club3));
        res.addAll(intersection(s1,s2));
        res.addAll(intersection(s2,s3));
        res.addAll(intersection(s1,s3));
        String[] ret = res.toArray(new String[0]);
        Arrays.sort(ret);
        return ret;
    }
    public Set intersection (Set one, Set two){
        Set <String> set1 = new HashSet ();
        Set <String> set2 = new HashSet ();
        set1.addAll(one);
        set2.addAll(two);
        set1.retainAll(set2);
        return set1;
    }
}