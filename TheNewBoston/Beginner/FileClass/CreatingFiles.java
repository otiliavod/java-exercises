package TheNewBoston.FileClass;
import java.util.*;

public class CreatingFiles {
    public static void main(String args[]) {
        final Formatter x;

        try {
            x = new Formatter("abc.txt");
            System.out.println(x + " You created a file");
        }
        catch(Exception e) {
            System.out.println("You have an error");
        }
    }
}
