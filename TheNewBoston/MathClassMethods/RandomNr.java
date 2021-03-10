package TheNewBoston.MathClassMethods;
import java.util.Random;
public class RandomNr {
    public static void main(String args[]) {
        Random x = new Random();
        int nr;
        for(int counter=1; counter<=10; counter++) {
            nr =1 +  x.nextInt(6);
            System.out.println(nr + " ");
        }
    }
}
