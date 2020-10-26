package assignment3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class UpdateNameAndPosition extends JFrame{
    private JLabel fNameLabel = new JLabel("First name");
    private JTextField firstName = new JTextField(25);
    private JLabel lNameLabel = new JLabel("Last name");
    private JTextField lastName = new JTextField(25);
    private JLabel posLabel = new JLabel("Position");
    private JTextField position = new JTextField(15);
    private JButton submit = new JButton("Update");
    private JButton goBack = new JButton("Back");
    private Staff user;
    private UserManagement manager;
    
    protected UpdateNameAndPosition(UserManagement manager, User user){
        super("Update Full Name and position");
        setLayout(new FlowLayout());
        
        this.setSize(400, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        this.user = (Staff) user;
        this.manager = manager;
        
        //add compenents to frame
        add(fNameLabel);
        add(firstName);
        add(lNameLabel);
        add(lastName);
        add(posLabel);
        add(position);
        add(submit);
        add(goBack);
        
        submit.addActionListener(e -> actionPerformed(e));
        goBack.addActionListener(e -> this.setVisible(false));
    }
    private void actionPerformed(ActionEvent event) {
        try {
            manager.updateUserName(user, firstName.getText(), lastName.getText());
            manager.updateStaffPosition(user, position.getText());
            JOptionPane.showMessageDialog(null, "Information updated");
            manager.writeToFile();
            this.setVisible(false);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, "Name should not contain numeric characters");
        }
    }
}
