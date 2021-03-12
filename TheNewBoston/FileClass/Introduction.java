package TheNewBoston.FileClass;
import java.io.File;

public class Introduction {
    public static void main(String args[]) {
        File x = new File("C:\\test\\greg.txt");

        if(x.exists()) {
            System.out.println(x.getName() + " exists");
        }
        else {
            System.out.println("It doesn't exist");
        }
    }
}
