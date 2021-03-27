package JavaExercises.Lab13.P3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FereastraP3 extends JFrame{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    private JTextField jtf1, jtf2;
    private JRadioButton jrbCifre, jrbDivizori;
    private JButton jbCalcule, jbExit;

    public FereastraP3() {
        this.setTitle("Butoane radio");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel jl1 = new JLabel("Numar:");
        jtf1 = new JTextField(10);
        JPanel jp1 = new JPanel();
        jp1.add(jl1);
        jp1.add(jtf1);

        JLabel jl2 = new JLabel("Cifre/Divizori:");
        jtf2 = new JTextField(10);
        jtf2.setEditable(false);
        JPanel jp2 = new JPanel();
        jp2.add(jl2);
        jp2.add(jtf2);

        AscultaButoane ab = new AscultaButoane();
        
        jrbCifre = new JRadioButton("Cifre");
        jrbCifre.addActionListener(ab);

        jrbDivizori = new JRadioButton("Divizori");
        jrbDivizori.addActionListener(ab);

        JPanel jp3 = new JPanel();
        jp3.setLayout(new GridLayout(2,1));
        jp3.add(jrbCifre);
        jp3.add(jrbDivizori);

        jbCalcule = new JButton("Calcule");
        jbCalcule.addActionListener(ab);

        jbExit = new JButton("Exit");
        jbExit.addActionListener(ab);

        JPanel jp4 = new JPanel();
        jp4.add(jbCalcule);
        jp4.add(jbExit);

        JPanel jpFinal = new JPanel();
        jpFinal.setLayout(new GridLayout(4,1));
        jpFinal.add(jp1);
        jpFinal.add(jp2);
        jpFinal.add(jp3);
        jpFinal.add(jp4);

        Container c = getContentPane();
        c.add(jpFinal, "South");
    }

    class AscultaButoane implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            Object sursa = ev.getSource();
            if(sursa == jbExit) {
                System.exit(1);
            }
            else if(sursa == jbCalcule){
                int N = Integer.parseInt(jtf1.getText());
                if(jrbCifre.isSelected()) {
                    String s = "";
                    while(N != 0) {
                        int c = N % 10;
                        N = N / 10;
                        s = s + c + " ";    
                    }
                    jtf2.setText(s);
                }
                else if(jrbDivizori.isSelected()) { 
                    String s = "";
                    for(int i=1; i<N; i++) {
                        if(N % i == 0) {
                            s = s + i + " ";     
                        }
                    }
                    jtf2.setText(s);
                }
            }
        }
    }
}
