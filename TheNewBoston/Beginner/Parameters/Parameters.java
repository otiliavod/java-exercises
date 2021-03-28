package TheNewBoston.Parameters;
import java.util.Scanner;
public class Parameters {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        another anyObject = new another();
        System.out.println("Enter your name here: ");
        String name = input.nextLine();
        anyObject.simpleMessage(name);
        input.close();
    }
}
