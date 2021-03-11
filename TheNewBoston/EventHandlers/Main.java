package TheNewBoston.EventHandlers;
import javax.swing.JFrame;
public class Main {
    public static void main(String args[]) {
        Event bucky = new Event();
        bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bucky.setSize(350, 100);
        bucky.setVisible(true);
    }
}
