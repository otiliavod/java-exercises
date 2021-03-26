package JavaExercises.Lab13.PS1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fereastra extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JButton jbCalcul, jbExit;
    private JTextField jtf1, jtf2, jtf3, jtf4;

    public Fereastra() {
        this.setTitle("Calcul maxim");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jl1 = new JLabel("a: ");
        jtf1 = new JTextField(10);
        JPanel jp1 = new JPanel();
        jp1.add(jl1);
        jp1.add(jtf1);

        JLabel jl2 = new JLabel("b: ");
        jtf2 = new JTextField(10);
        JPanel jp2 = new JPanel();
        jp2.add(jl2);
        jp2.add(jtf2);

        JLabel jl3 = new JLabel("c: ");
        jtf3 = new JTextField(10);
        JPanel jp3 = new JPanel();
        jp3.add(jl3);
        jp3.add(jtf3);

        JPanel jpA = new JPanel();
        jpA.add(jp1);
        jpA.add(jp2);
        jpA.add(jp3);

        JLabel jl4 = new JLabel("Maxim: ");
        jtf4 = new JTextField(10);
        jtf4.setEditable(false);

        JPanel jpB = new JPanel();
        jpB.add(jl4);
        jpB.add(jtf4);
        
        AscultaButoane ab = new AscultaButoane();
        jbCalcul = new JButton("Calcul");
        jbCalcul.addActionListener(ab);

        jbExit = new JButton("Exit");
        jbExit.addActionListener(ab);

        JPanel jpC = new JPanel();
        jpC.add(jbCalcul);
        jpC.add(jbExit);

        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(3,1));
        jp.add(jpA);
        jp.add(jpB);
        jp.add(jpC);

        Container cFinal = this.getContentPane();
        cFinal.add(jp,"South");
    }

    class AscultaButoane implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            Object sursa = ev.getSource();
            if(sursa == jbExit) {
                System.exit(1);
            }
            else if(sursa == jbCalcul) {
                String s1 = jtf1.getText();
                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(jtf2.getText());
                int c = Integer.parseInt(jtf3.getText());
                int max = a;
    
                if(b > max) {
                    max = b;
                }
                if(c > max) {
                    max = c;
                }
                jtf4.setText(("" + max));
            }
        }
    }
}