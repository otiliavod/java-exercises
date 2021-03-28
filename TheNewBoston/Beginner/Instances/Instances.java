package TheNewBoston.Instances;
import java.util.Scanner;
public class Instances {
    public static void main(String args[]) {
        // Constructor method:
        // another anyObject = new another("Zoe");
        // anyObject.saying();
        Scanner input = new Scanner(System.in);
        another anyObject = new another();
        System.out.println("Enter your name");
        String temp = input.nextLine();
        anyObject.setName(temp);
        anyObject.saying();
        input.close();
    }
}
