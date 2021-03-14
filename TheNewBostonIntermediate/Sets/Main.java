package TheNewBostonIntermediate.Sets;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] things = {"apples", "kiwi", "pears", "kiwi"};
        List<String> list = Arrays.asList(things);

        System.out.printf("%s ", list);
        System.out.println();

        Set<String> set = new HashSet<String>(list);
        System.out.printf("%s ", set);
    }
}
