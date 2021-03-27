package JavaExercises.Lab14.PS2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FereastraPS2 extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JTextField jtfDate, jtfAfisare;
    private JButton jbExit;

    public FereastraPS2() {
        this.setTitle("Copiere text");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jtfDate = new JTextField(30);
        jtfDate.setEditable(true);
        jtfDate.addKeyListener(new ClasaTasteListener());
        JPanel jp1 = new JPanel();
        jp1.add(jtfDate);

        jtfAfisare = new JTextField(30);
        jtfAfisare.setEditable(false);
        JPanel jp2 = new JPanel();
        jp2.add(jtfAfisare);

        jbExit = new JButton("Exit");
        JPanel jp3 = new JPanel();
        jp3.add(jbExit);

        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(3,1));
        jp.add(jp1);
        jp.add(jp2);
        jp.add(jp3);

        ClasaButoaneListener bl = new ClasaButoaneListener();
        jbExit.addActionListener(bl);

        Container c = getContentPane();
        c.add(jp, "South");
    }

    private class ClasaButoaneListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            System.exit(0);
        }
    }

    private class ClasaTasteListener extends KeyAdapter {
        public void keyPressed(KeyEvent evt) {
            if(evt.getKeyChar() == '\n') {
                String text = jtfDate.getText();
                jtfAfisare.setText(text.toUpperCase());
            }
        }
    }
}
