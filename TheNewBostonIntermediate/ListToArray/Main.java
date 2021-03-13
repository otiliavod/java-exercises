package TheNewBostonIntermediate.ListToArray;
import java.util.*;

public class Main {
    public static void main(String[] args){
        String[] stuff = {"watermelon", "strawberries", "apples", "peach"};
        LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));
        
        thelist.add("pumpkin");
        thelist.addFirst("first");

        stuff = thelist.toArray(new String[thelist.size()]);

        for(String x: stuff) {
            System.out.printf("%s ", x);
        }
    }
    
}
