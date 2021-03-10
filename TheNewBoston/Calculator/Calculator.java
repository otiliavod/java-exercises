package TheNewBoston.Calculator;
import java.util.Scanner;
public class Calculator {
    public static void main(String args[]) {
        Scanner bucky = new Scanner(System.in);
        double x, y, z;
        System.out.println("Enter x: ");
        x = bucky.nextDouble();
        System.out.println("Enter y: ");
        y = bucky.nextDouble();
        z = x + y;
        System.out.println(z);
        bucky.close();
        int a = 10;
        a += 5;
        System.out.println(a);
    }
}
