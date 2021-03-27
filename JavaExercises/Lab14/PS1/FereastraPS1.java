package JavaExercises.Lab14.PS1;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class FereastraPS1 extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JTextField jtf;
    private JTextArea jta;

    public FereastraPS1() {
        setTitle("Test JTextArea");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jta = new JTextArea("",10,20);
        JPanel jtaP = new JPanel();
        jtaP.setBorder(new TitledBorder(new EtchedBorder(), "JTextArea"));
        jtaP.add(jta);

        jtf = new JTextField(10);
        JPanel jtfP = new JPanel();
        jtfP.setBorder(new TitledBorder(new EtchedBorder(), "Nr linii"));
        jtfP.add(jtf);

        JButton jb = new JButton("Calcul");
        jb.addActionListener(new AscultaButoane());

        JPanel jp = new JPanel();
        jp.add(jtaP);
        jp.add(jtfP);
        jp.add(jb);

        Container c = getContentPane();
        c.add(jp, "South");
    }

    class AscultaButoane implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            int n = jta.getLineCount();
            jtf.setText(n + "");
        }
    }
}
