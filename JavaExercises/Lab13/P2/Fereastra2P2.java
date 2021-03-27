package JavaExercises.Lab13.P2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fereastra2P2 extends JFrame{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    private int N;
    private JTextField jtf1, jtf2;
    private JButton jb[], jbExit;

    public Fereastra2P2(int N) {
        this.setTitle("N Butoane");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.N = N;
        jb = new JButton[N];

        JLabel jl1 = new JLabel("N:");
        jtf1 = new JTextField(10);
        jtf1.setEditable(false);
        jtf1.setText(N + "");
        JPanel jp1 = new JPanel();
        jp1.add(jl1);
        jp1.add(jtf1);
        
        AscultaButoane ab = new AscultaButoane();

        JPanel jp2 = new JPanel();
        for(int i=0; i<N; i++) {
            int nrButon = i + 1;
            String numeButon = nrButon + "";
            jb[i] = new JButton(numeButon);
            jb[i].addActionListener(ab);
            jp2.add(jb[i]); 
        }

        JLabel jl2 = new JLabel("Buton apasat:");
        jtf2 = new JTextField(10);
        jtf2.setEditable(false);
        JPanel jp3 = new JPanel();
        jp3.add(jl2);
        jp3.add(jtf2);

        jbExit = new JButton("Exit");
        jbExit.addActionListener(ab);

        JPanel jpFinal = new JPanel();
        jpFinal.setLayout(new GridLayout(4,1));
        jpFinal.add(jp1);
        jpFinal.add(jp2);
        jpFinal.add(jp3);
        jpFinal.add(jbExit);

        Container c = getContentPane();
        c.add(jpFinal, "South");
    }

    class AscultaButoane implements ActionListener{
        public void actionPerformed(ActionEvent ev) {
            Object sursa = ev.getSource();
            if(sursa == jbExit) {
                System.exit(1);
            }
            else {
                for(int i=0; i<N; i++) {
                    if((JButton)sursa == jb[i]) {
                        jtf2.setText((i+1) + "");
                        break;
                    }
                }
            }
        }
    }
}
