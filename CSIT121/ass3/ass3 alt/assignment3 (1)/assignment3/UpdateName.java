package assignment3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class UpdateName extends JFrame {
    private JLabel fNameLabel = new JLabel("First name");
    private JTextField firstName = new JTextField(25);
    private JLabel lNameLabel = new JLabel("Last name");
    private JTextField lastName = new JTextField(25);
    private JButton submit = new JButton("Update");
    private JButton goBack = new JButton("Back");
    private User user;
    private UserManagement manager;
    
    protected UpdateName(UserManagement manager, User user){
        super("Update Full Name");
        setLayout(new FlowLayout());
        
        this.setSize(400, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
        this.user = user;
        this.manager = manager;
        
        //add compenents to frame
        add(fNameLabel);
        add(firstName);
        
        add(lNameLabel);
        add(lastName);
        add(submit);
        
        submit.addActionListener(e -> actionPerformed(e));
        
        add(goBack);
        goBack.addActionListener(e -> this.setVisible(false));
    }
    private void actionPerformed(ActionEvent event) {
        try {
            manager.updateUserName(user, firstName.getText(), lastName.getText());
            JOptionPane.showMessageDialog(null, "Information updated");
            manager.writeToFile();
            this.setVisible(false);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, "Name should not contain numeric characters");
        }
    }
}
