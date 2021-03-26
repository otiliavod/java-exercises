package JavaExercises.Lab13.P1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FereastraP1 extends JFrame{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    int N;
    private JTextField[] jtf1;
    private JTextField jtf2;
    private JButton jbMaxim, jbExit;

    public FereastraP1(int N) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.N = N;

        JLabel jl1 = new JLabel("Elemente vector:");
        jtf1 = new JTextField[N];
        JPanel jp1 = new JPanel();
        jp1.add(jl1);
        for(int i=0; i<N; i++) {
            jtf1[i] = new JTextField(10);
            jp1.add(jtf1[i]);
        }

        JLabel jl2 = new JLabel("Maxim: ");
        jtf2 = new JTextField(10);
        jtf2.setEditable(false);
        JPanel jp2 = new JPanel();
        jp2.add(jl2);
        jp2.add(jtf2);

        AscultaButoane ab = new AscultaButoane();
        jbMaxim = new JButton("Maxim:");
        jbMaxim.addActionListener(ab);

        jbExit = new JButton("Exit");
        jbExit.addActionListener(ab);

        JPanel jpA = new JPanel();
        jpA.add(jbMaxim);
        jpA.add(jbExit);

        JPanel jpFinal = new JPanel();
        jpFinal.setLayout(new GridLayout(3,1));
        jpFinal.add(jp1);
        jpFinal.add(jp2);
        jpFinal.add(jpA);

        Container cFinal = this.getContentPane();
        cFinal.add(jpFinal,"South");
    }

    class AscultaButoane implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            Object sursa = ev.getSource();
            if(sursa == jbExit) {
                System.exit(1);
            }
            else if(sursa == jbMaxim) {
                String s = jtf1[N].getText();
                int x[] = new int[N];
                for(int i=0; i<N; i++) {
                    x[i] = Integer.parseInt(s);
                }
                int max = x[0];
                for(int i=1; i<N; i++) {
                    if(x[i] > max) {
                        max = x[i];
                    }
                }
                jtf2.setText(("" + max));
            }
        }
    }
}
