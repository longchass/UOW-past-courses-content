package assignment3;

import java.awt.FlowLayout;
import javax.swing.*;

public class SortUserByLastName extends JFrame {
    private UserManagement manager;
    private JList<String> display;
    private JButton goBack;
    
    protected SortUserByLastName(UserManagement manager) {
        super("Sort Customer by last name");
        setLayout(new FlowLayout());
        
        this.setSize(600, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        this.manager = manager;
        
        display = new JList<>(manager.sortCustomerByLastName());
        display.setVisibleRowCount(3);
        display.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(display));
        
        goBack = new JButton("Back");
        goBack.addActionListener(e -> this.setVisible(false));
        add(goBack);
    }
}