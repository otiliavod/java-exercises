package JavaExercises.Lab13.PS3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fereastra3 extends JFrame{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    private int nB;
    private JButton jb[];
    private JTextField jtf;

    public Fereastra3(int nB) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.nB = nB;
        jb = new JButton[nB];
        int i, j;
        int N = (int)Math.sqrt(nB); // dimensiune matrice

        //Fiecare linie de butoane o introducem intr-un JPanel
        //vom avea un vector de N JPaneluri
        //!! Astfel se pastreaza dimensiunea la resize fereastra!!

        AscultaButoane ab = new AscultaButoane();
        JPanel jp[] = new JPanel[N];

        for(i=0; i<N; i++) {
            jp[i] = new JPanel(); //containerul intermediar al liniei i
            for(j=0; j<N; j++) {
                int nrButonCrt = (N * i) + j;
                String numeButonCrt = nrButonCrt + "";
                jb[nrButonCrt] = new JButton(numeButonCrt);
                jb[nrButonCrt].addActionListener(ab);
                jp[i].add(jb[nrButonCrt]);
            }
        }

        JPanel jpFinal = new JPanel();
        jpFinal.setLayout(new GridLayout(N+1, 1));
        // N linii cu butoane si pe ultima linie un JTextField

        for(i=0; i<N; i++) {
            jpFinal.add(jb[i]);
        }

        jtf = new JTextField(5);
        jtf.setEditable(false);

        JLabel jl = new JLabel("Butonul:");
        JPanel jtfPanel = new JPanel();
        jtfPanel.add(jl);
        jtfPanel.add(jtf);
        jpFinal.add(jtfPanel);

        Container c = this.getContentPane();
        c.add(jpFinal, "South");
    }

    class AscultaButoane implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            Object sursa = ev.getSource();
            for(int i=0; i<nB; i++) {
                if((JButton)sursa == jb[i]) {
                    jtf.setText(i + "");
                    break;
                }
            }
        }
    }
}
