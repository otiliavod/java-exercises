package TheNewBoston.JComboBox;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JComboBox box;
    private JLabel picture;

    private static String[] filename = {"a.jpg", "b.jpg"};
    private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])), new ImageIcon(getClass().getResource(filename[1]))};
    
    public GUI() {
        super("Title");
        setLayout(new FlowLayout());

        box = new JComboBox(filename);

        box.addItemListener(
            new ItemListener() {
                public void itemStateChanged(ItemEvent event) {
                    if(event.getStateChange() == ItemEvent.SELECTED) {
                        picture.setIcon(pics[box.getSelectedIndex()]);
                    }
                }
            }
        );

        add(box);
        picture = new JLabel(pics[0]);
        add(picture);
    }
}
