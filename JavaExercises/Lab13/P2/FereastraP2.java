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
    private JButton jbOk, jbCancel, jbExit;
    private JTextField jtf1, jtf2, jtf3, jtf4;

    public FereastraP2() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jb = new JButton[N];

        JLabel jl1 = new JLabel("N: ");
        jtf1 = new JTextField(10);
        JPanel jp1 = new JPanel();
        jp1.add(jl1);
        jp1.add(jtf1);

        JLabel jl2 = new JLabel("N:");
        jtf2 = new JTextField(10);
        jtf2.setEditable(false);
        JPanel jp2 = new JPanel();
        jp2.add(jl2);
        jp2.add(jtf2);

        AscultaButoane ab = new AscultaButoane();
        JPanel jp[] = new JPanel[N];

        jbOk = new JButton("OK");
        jbOk.addActionListener(ab);

        jbCancel = new JButton("Cancel");
        jbCancel.addActionListener(ab);

        JPanel jpB = new JPanel();
        jpB.add(jbOk);
        jpB.add(jbCancel);

        jtf3 = new JTextField(10);
        for(int i=0; i<N; i++) {
            jp[i] = new JPanel();
            jp[i].add(jtf3);
            int nrCrt = i+1;
            String numeCrt = nrCrt + "";
            jb[nrCrt] = new JButton(numeCrt);
            jb[nrCrt].addActionListener(ab);
            jp[i].add(jb[nrCrt]);
        }

        JLabel jl4 = new JLabel("Buton apasat:");
        jtf4 = new JTextField(10);
        jtf4.setEditable(false);
        JPanel jp4 = new JPanel();
        jp4.add(jl4);
        jp4.add(jtf4);

        jbExit = new JButton("Exit");
        jbExit.addActionListener(ab);

        JPanel jpFinal = new JPanel();
        jpFinal.setLayout(new GridLayout(4, 1));
        jpFinal.add(jp1);
        jpFinal.add(jp2);
        jpFinal.add(jp4);
        jpFinal.add(jpB);
        jpFinal.add(jbExit);
        for(int i=0; i<N; i++) {
            jpFinal.add(jb[i]);
        }

        Container c = this.getContentPane();
        c.add(jpFinal, "South");
    }

    class AscultaButoane implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            Object sursa = ev.getSource();
            if(sursa == jbCancel) {
                System.exit(1);
            }
            int N  = Integer.parseInt(jtf1.getText());
            if(sursa == jbExit) {
                System.exit(1);
            }
            else {
                jtf2.setText(N + "");
                for(int i=0; i<N; i++) {
                    if((JButton)sursa == jb[i]) {
                        jb[i].setBackground(Color.BLUE);
                        jb[i].setForeground(Color.WHITE);
                        jtf4.setText(i + "");
                        break;
                    }
                }
            }
        }
    }
}
