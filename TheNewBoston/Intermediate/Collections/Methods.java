package TheNewBostonIntermediate.Collections;
import java.util.*;

public class Methods {
    public static void main(String[] args) {
        String[] stuff = {"apples", "lemon", "youtube", "geese"};
        List<String> l2 = new ArrayList<String>(); 
        List<String> l1 = Arrays.asList(stuff);
        List<String> lcopy = Arrays.asList(new String[4]);

        sortCollection(l1);
        reverse(l1);
        copy(lcopy, l1);
        fill(l1, "abc");
        addAll(l2, stuff);

        //frequency:
        System.out.println(Collections.frequency(lcopy, "lemon"));

        //disjoint:
        boolean tof = Collections.disjoint(l1, lcopy);
        System.out.println(tof);
    }
    public static void sortCollection(List<String> l1){
        Collections.sort(l1);
        System.out.printf("%s\n", l1);
        Collections.sort(l1, Collections.reverseOrder());
        System.out.printf("%s\n", l1);
    }

    // Reverse and copy methods:

    public static void reverse(List<String> l) {
        Collections.reverse(l);
        System.out.printf("%s \n", l);
    }

    public static void copy(List<String> l1, List<String> l2) {
        Collections.copy(l1, l2);
        System.out.printf("%s \n", l2);
    }

    //Fill method:
    
    public static void fill(List<String> l, String x) {
        Collections.fill(l, x);
        System.out.printf("%s \n", l);
    }

    //addAll :

    public static void addAll(List<String> l1, String[] l2) {
        Collections.addAll(l1, l2);
        System.out.printf("%s \n", l1);
    }
}
