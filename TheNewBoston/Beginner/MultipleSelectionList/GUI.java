package TheNewBoston.MultipleSelectionList;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class GUI extends JFrame{
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JList<String> leftlist;
    private JList<String> rightlist;
    private JButton movebutton;
    private static String[] foods = {"bacon", "wings", "ham", "beef", "chicken"};

    public GUI() {
        super("Title");
        setLayout(new FlowLayout());

        leftlist = new JList<String>(foods);
        leftlist.setVisibleRowCount(3);
        leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(leftlist));

        movebutton = new JButton("Move -->");
        movebutton.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event ) {
                    rightlist.setListData((Vector<? extends String>) leftlist.getSelectedValuesList());
                    }
            }
        );
        add(movebutton);

        rightlist = new JList<String> ();
        rightlist.setVisibleRowCount(3);
        rightlist.setFixedCellWidth(100);
        rightlist.setFixedCellHeight(15);
        rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(rightlist));
    }
}
