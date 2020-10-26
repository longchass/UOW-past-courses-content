package assignment3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class SearchCustomer extends JFrame{
    private JLabel label;
    private JTextField keyword;

    private JButton search, goBack;
    private UserManagement manager;
    
    protected SearchCustomer(UserManagement manager) {
        super("Search for Customer's full name by keyword");
        setLayout(new FlowLayout());
        
        this.setVisible(true);
        this.setSize(400, 120);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        this.manager = manager;
        
        label = new JLabel("Key word");
        add(label);
        
        keyword = new JTextField(24);
        add(keyword);
        
        search = new JButton("Search");
        add(search);
        search.addActionListener(e -> actionPerformed(e));
        
        goBack = new JButton("Back");
        add(goBack);
        goBack.addActionListener(e -> this.setVisible(false));
        
    }
    
    private void actionPerformed(ActionEvent e){
        this.setVisible(false);
        ResultFrame frame = new ResultFrame(manager, keyword.getText());
        
    }
}
