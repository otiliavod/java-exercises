package JavaExercises.Lab13.PS2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fereastra extends JFrame{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    private JButton jbExit;
    private JTextField jtf1, jtf2;
    private JRadioButton jrbCifraU, jrbCifraZ, jrbCifraS;

    public Fereastra() {
        this.setTitle("Butoane Radio");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jl1 = new JLabel("Numar:");
        jtf1 = new JTextField(20);
        JPanel jp1 = new JPanel();
        jp1.add(jl1);
        jp1.add(jtf1);

        JLabel jl2 = new JLabel("Cifre:");
        jtf2 = new JTextField(20);
        JPanel jp2 = new JPanel();
        jp2.add(jl2);
        jp2.add(jtf2);

        jrbCifraU = new JRadioButton("UNITATI");
        jrbCifraU.setMnemonic(KeyEvent.VK_U);

        jrbCifraZ = new JRadioButton("ZECI");
        jrbCifraZ.setMnemonic(KeyEvent.VK_Z);

        jrbCifraS = new JRadioButton("SUTE");
        jrbCifraS.setMnemonic(KeyEvent.VK_S);

        ButtonGroup group = new ButtonGroup();
        group.add(jrbCifraU);
        group.add(jrbCifraZ);
        group.add(jrbCifraS);

        JPanel jpRadio = new JPanel();
        jpRadio.setLayout(new GridLayout(3,1));
        jpRadio.add(jrbCifraU);
        jpRadio.add(jrbCifraZ);
        jpRadio.add(jrbCifraS);

        AscultaButoaneRadio abr = new AscultaButoaneRadio();
        jrbCifraU.addActionListener(abr);
        jrbCifraZ.addActionListener(abr);
        jrbCifraS.addActionListener(abr);

        AscultaButoane ab = new AscultaButoane();
        jbExit = new JButton("Exit");
        jbExit.addActionListener(ab);

        JPanel jp3 = new JPanel();
        jp3.add(jbExit);

        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(4,1));
        jp.add(jp1);
        jp.add(jp2);
        jp.add(jpRadio);
        jp.add(jp3);

        Container cFinal = this.getContentPane();
        cFinal.add(jp, "South");
    }

    class AscultaButoaneRadio implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            String s1 = jtf1.getText();
            if(!s1.equals("")) {
                int nr = Integer.parseInt(s1);
                if(jrbCifraU.isSelected()) {
                    int u = nr % 10;
                    jtf2.setText(u + "");
                }
                else if(jrbCifraZ.isSelected()) {
                    int z = (nr/10) % 10;
                    jtf2.setText(z + "");
                }
                else if(jrbCifraS.isSelected()) {
                    int s = (nr/100) % 10;
                    jtf2.setText(s + "");
                }
            }
        }
    }

    class AscultaButoane implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            System.exit(0);
        }
    }
}
