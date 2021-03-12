package TheNewBoston.JColorChooser;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import java.awt.event.*;
import javax.swing.*;

public class Peach extends JFrame{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    private JButton b;
    private Color color = (Color.WHITE);
    private JPanel panel;

    public Peach() {
        super("Title");
        panel = new JPanel();
        panel.setBackground(color);

        b = new JButton("Choose a colour");
        b.addActionListener(
            (ActionListener) new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    color = JColorChooser.showDialog(null, "Pick your colour", color);
                    if(color == null) {
                        color = (Color.WHITE);
                    }
                    panel.setBackground(color);
                }
            }
        );
        add(panel, BorderLayout.CENTER);
        add(b, BorderLayout.SOUTH);
        setSize(425,150);
        setVisible(true);
    }

}
