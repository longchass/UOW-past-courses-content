package assignment3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ChangePassword extends JFrame{
    private JTextField oldPass, newPass;
    private JButton submit, goBack;
    private JLabel oldLabel, newLabel;
    private User user;
    private UserManagement manager;
    
    protected ChangePassword(UserManagement manager, User user){
        super("Change Password");
        setLayout(new FlowLayout());
        
        this.setSize(400, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
        this.manager = manager;
        this.user = user;
        
        oldLabel = new JLabel("Old password");
        add(oldLabel);
        
        oldPass = new JTextField(24);
        add(oldPass);
        
        newLabel = new JLabel("New password");
        add(newLabel);
        
        newPass = new JTextField(24);
        add(newPass);
        
        submit = new JButton("Change password");
        add(submit);
        submit.addActionListener(e -> actionPerformed(e));
        
        goBack = new JButton("Back");
        add(goBack);
        goBack.addActionListener(e -> this.setVisible(false));
    }
    
    private void actionPerformed(ActionEvent event){
        try{
            if (manager.changePassword(user.getUsername(),oldPass.getText(), newPass.getText()) ){
                JOptionPane.showMessageDialog(null, "Password changed");
                manager.writeToFile();
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Old password is incorrect");
            }
        }catch(IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, "Password must contains at least 8 characters");
        }
    }
}
