package assignment3;

import java.awt.FlowLayout;
import javax.swing.*;

public class VIPCustomer extends JFrame{
    private JList display;
    private JButton goBack;
    
    protected VIPCustomer(UserManagement manager) {
        super("VIP customer list");
        setLayout(new FlowLayout());
        
        this.setSize(400,150);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        display = new JList<>(manager.filterVIPCustomerList());
        display.setVisibleRowCount(3);
        display.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        add(new JScrollPane(display));
        
        goBack = new JButton("Back");
        add(goBack);
        goBack.addActionListener( e -> {this.setVisible(false); });
    }
}
