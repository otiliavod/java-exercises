package TheNewBoston.GUIwithJFrame;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class second extends JFrame{
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JLabel item1;

    public second() {
        super("The title bar");
        setLayout(new FlowLayout());

        item1 = new JLabel("This is something");
        item1.setToolTipText("This is going to show on hover");
        add(item1);
    }
}
