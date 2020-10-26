package assignment3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login extends JFrame{
    private JLabel usernameLabel, passwordLabel;
    private JTextField username, password;
    private JButton submit;
    private UserManagement manager;
    
    public Login(){
        super("Login");
        setLayout(new FlowLayout());
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,150);
        this.setResizable(false);
        
        manager = new UserManagement();
        try{
            manager.readRecord();
        }catch (IOException ex) { System.out.println("File not found");}
        
        usernameLabel = new JLabel("Username");
        add(usernameLabel);
        
        username = new JTextField(24);
        add(username);
        
        passwordLabel = new JLabel("Password");
        add(passwordLabel);
        
        password = new JTextField(24);
        add(password);
        
        submit = new JButton("Login");
        add(submit);
        
        //ButtonHandler handler = new ButtonHandler();
        submit.addActionListener(e -> actionPerformed(e));
        this.manager = manager;
    }
    
        public void actionPerformed(ActionEvent event){
            User user = null;
            if (manager.verifyLogIn(username.getText(), password.getText()) == true) { //verifylogin
                for(User u: manager.getUserList()) {
                    if (u.getUsername().equals(username.getText())) { //find matched record
                        //cast User object to specific subclass
                        if(u instanceof Customer){
                            user = (Customer) u;
                            break;
                        }else if(u instanceof Guest){
                            user = (Guest) u;
                            break;
                        }else {
                            user = (Staff) u;
                            break;
                        }
                    }
                }
                
                //open different Frame for staff and customer
                if (user.getUserType() == UserType.Staff){
                    this.setVisible(false);
                    StaffMainMenu mainmenu = new StaffMainMenu(manager, user);
                    
                } else  {
                    this.setVisible(false);
                    CustomerMainMenu mainmenu = new CustomerMainMenu(manager, user);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Incorrect username or password");
            }
        }
    
}
