package TheNewBoston.SimpleAverageProg;
import java.util.Scanner;
public class Average {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int grade, average;
        int counter = 0;

        while(counter < 10) {
            grade = input.nextInt();
            total = total + grade;
            counter++;
        }
        input.close();
        average = total/10;
        System.out.println("Your average is" + average);
    }
}
