package assignment3;

import java.awt.FlowLayout;
import javax.swing.*;

public class NSWUser extends JFrame{
    private JList NSWList;
    private JButton goBack;
    
    protected NSWUser(UserManagement manager) {
        super("List of user living in NSW");
        setLayout(new FlowLayout());
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(1400, 175);
        NSWList = new JList<>(manager.filterNSWCustomer());
        NSWList.setVisibleRowCount(3);
        NSWList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        add(new JScrollPane(NSWList));
        
        goBack = new JButton("Back");
        goBack.addActionListener(e -> this.setVisible(false));
        add(goBack);
    }
}
