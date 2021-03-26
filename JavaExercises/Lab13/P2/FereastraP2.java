package JavaExercises.Lab13.P2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FereastraP2 extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private int N;
    private JButton jb[];
    private JButton jbOk, jbExit;
    private JTextField jtf1, jtf3; //jtf2;

    public FereastraP2() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jb = new JButton[N];

        JLabel jl1 = new JLabel("N: ");
        jtf1 = new JTextField(10);
        JPanel jp1 = new JPanel();
        jp1.add(jl1);
        jp1.add(jtf1);

        // JLabel jl2 = new JLabel("N:");
        // jtf2 = new JTextField(10);
        // jtf2.setEditable(false);
        // JPanel jp2 = new JPanel();
        // jp2.add(jl2);
        // jp2.add(jtf2);

        AscultaButoane ab = new AscultaButoane();
        JPanel jp[] = new JPanel[N];

        jbOk = new JButton("OK");
        jbOk.addActionListener(ab);

        jbExit = new JButton("Exit");
        jbExit.addActionListener(ab);

        JPanel jpB = new JPanel();
        jpB.add(jbOk);
        jpB.add(jbExit);

        for(int i=0; i<N; i++) {
            jp[i] = new JPanel();
            int nrCrt = N*i;
            String numeCrt = nrCrt + "";
            jb[nrCrt] = new JButton(numeCrt);
            jb[nrCrt].addActionListener(ab);
            jp[i].add(jb[nrCrt]);
        }

        JPanel jpFinal = new JPanel();
        jpFinal.setLayout(new GridLayout(N+1, 1));
        jpFinal.add(jp1);
        jpFinal.add(jpB);
        for(int i=0; i<N; i++) {
            jpFinal.add(jb[i]);
        }

        JLabel jl3 = new JLabel("Buton apasat:");
        jtf3 = new JTextField(10);
        jtf3.setEditable(false);
        JPanel jp3 = new JPanel();
        jp3.add(jl3);
        jp3.add(jtf3);

        Container c = this.getContentPane();
        c.add(jpFinal, "South");
    }

    class AscultaButoane implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            Object sursa = ev.getSource();
            if(sursa == jbExit) {
                System.exit(1);
            }
            else {
                String s = jtf1.getText();
                N = Integer.parseInt(s);
                if(sursa == jbOk) {
                    for(int i=0; i<N; i++) {
                        if((JButton)sursa == jb[i]) {
                            jtf3.setText(i + "");
                            break;
                        }
                    }
                }
            }
        }
    }
}
