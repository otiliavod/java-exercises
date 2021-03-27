package JavaExercises.Lab13.P2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FereastraP2 extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JTextField jtf;
    private JButton jbOk, jbCancel;
    private JFrame thisFrame;
    
    public FereastraP2() {
        this.thisFrame = this;
        this.setTitle("Input");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jl1 = new JLabel("Dati numarul de butoane N(<20):");
        jtf = new JTextField(10);
        JPanel jp1 = new JPanel();
        jp1.setLayout(new GridLayout(2,1));
        jp1.add(jl1);
        jp1.add(jtf);

        AscultaButoane ab = new AscultaButoane();
        jbOk = new JButton("OK");
        jbOk.addActionListener(ab);

        jbCancel = new JButton("Cancel");
        jbCancel.addActionListener(ab);

        JPanel jp2 = new JPanel();
        jp2.add(jbOk);
        jp2.add(jbCancel);

        JPanel jpFinal = new JPanel();
        jpFinal.setLayout(new GridLayout(2,1));
        jpFinal.add(jp1);
        jpFinal.add(jp2);

        Container c = this.getContentPane();
        c.add(jpFinal,"South");
    }

    class AscultaButoane implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            Object sursa = ev.getSource();
            if(sursa == jbCancel) {
                System.exit(1);
            }
            else {
                int N = Integer.parseInt(jtf.getText());
                Fereastra2P2 f = new Fereastra2P2(N);
                f.pack(); 
                f.setLocationRelativeTo(null); 
                f.setVisible(true);
                thisFrame.dispose();
            }
        }
    }
}
