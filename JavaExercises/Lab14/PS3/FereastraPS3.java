package JavaExercises.Lab14.PS3;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FereastraPS3 extends JFrame{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    private JButton jbExit, jbBack, jbNext;
    private JTextField jtf;
    private JLabel jl;
    private String s[] = new String[1000];
    private int nrTotalImagini;
    private int indexImagineCrt = 0; //prima imagine

    public FereastraPS3() {
        this.setTitle("Afisare imagini");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int n = 0;
        FileReader fr = null;
        BufferedReader bfr = null;

        try {
            fr = new FileReader("imagini.txt");
            bfr = new BufferedReader(fr);

            for(;;) {
                String linieCrt = bfr.readLine();
                if(linieCrt == null) {
                    break;
                }
                else {
                    s[n] = linieCrt;
                }
            }
            fr.close();
            bfr.close();
        } catch(IOException e) {
            System.exit(0);
        }

        nrTotalImagini = n;
        jl = new JLabel("");
        jl.setIcon(new ImageIcon(s[0])); // afisarea primei imagini
        JPanel jp1 = new JPanel();
        jp1.add(jl);

        jtf = new JTextField(40);
        jtf.setEditable(false);
        jtf.setText(s[0]);
        JPanel jp2 = new JPanel();
        jp2.add(jtf);

        AscultaButoane m = new AscultaButoane();
        jbBack = new JButton("<-");
        jbBack.addActionListener(m);

        jbNext = new JButton("->");
        jbNext.addActionListener(m);

        JPanel jp3 = new JPanel();
        jp3.add(jbBack);
        jp3.add(jbNext);

        jbExit = new JButton("Exit");
        jbExit.addActionListener(m);
        JPanel jp4 = new JPanel();
        jp4.add(jbExit);

        JPanel jpB = new JPanel();
        jpB.setLayout(new GridLayout(3,1));
        jpB.add(jp2);
        jpB.add(jp3);
        jpB.add(jp4);

        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(2,1));
        jp.add(jp1);
        jp.add(jpB);

        Container c = getContentPane();
        c.add(jp, "Center");
    }

    class AscultaButoane implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            Object sursa = ev.getSource();
            if(sursa == jbExit) {
                System.exit(0);
            }
            else if(sursa == jbNext) {
                if(indexImagineCrt == nrTotalImagini-1) {
                    return;
                }
                indexImagineCrt++;
                jl.setIcon(new ImageIcon(s[indexImagineCrt]));
                jtf.setText(s[indexImagineCrt]);
            }
            else if(sursa == jbBack) {
                if(indexImagineCrt == 0) {
                    return;
                }
                indexImagineCrt--;
                jl.setIcon(new ImageIcon(s[indexImagineCrt]));
                jtf.setText(s[indexImagineCrt]);
            }
        }
    }
}
