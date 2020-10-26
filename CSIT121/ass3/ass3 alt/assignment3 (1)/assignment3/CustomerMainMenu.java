package assignment3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CustomerMainMenu extends JFrame{
    private JButton button1, button2, button3, exit;
    private User user;
    private UserManagement manager;
    
    protected CustomerMainMenu(UserManagement manager, User user) {
        super("Main menu");
        setLayout(new FlowLayout());
        
        this.setVisible(true);
        this.setSize(400,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    
        this.manager = manager;
        for(User u: manager.getUserList()){
            if(u.getUsername().equals(user.getUsername())){
                this.user = u;
            }
        }
        
        button1 = new JButton("Display full name");
        add(button1);
        button1.addActionListener(e -> actionPerformed(e));
        
        button2 = new JButton("Change password");
        add(button2);
        button2.addActionListener(e -> actionPerformed(e));
        
        button3 = new JButton("Update full name");
        add(button3);
        button3.addActionListener(e -> actionPerformed(e));
        
        exit = new JButton("Log Out");
        add(exit);
        exit.addActionListener(e -> actionPerformed(e));
        
    }
    
    protected void actionPerformed(ActionEvent event){
        if(event.getSource() == button1) {
            JOptionPane.showMessageDialog(null, user.getFullname());
        } else if(event.getSource() == button2) {
            ChangePassword frame = new ChangePassword(manager, user);
            
        } else if(event.getSource() == button3){
            UpdateName frame = new UpdateName(manager, user);
        } else if(event.getSource() == exit) {
            this.setVisible(false); //close current frame
            //create new login frame
            Login frame = new Login();
        }
    }
}
