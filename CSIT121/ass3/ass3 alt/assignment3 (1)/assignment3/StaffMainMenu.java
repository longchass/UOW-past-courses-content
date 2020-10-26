package assignment3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StaffMainMenu extends JFrame{
    private JButton button1, button2, button3, button4, button5, button6, button7, exit;
    private UserManagement manager;
    
    public StaffMainMenu(UserManagement manager, User user) {
        super("Staff Main menu");
        setLayout(new FlowLayout());
        
        this.setVisible(true);
        this.setSize(400,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    
        this.manager = manager;
        
        button1 = new JButton("Display full name");
        add(button1);
        button1.addActionListener(e -> JOptionPane.showMessageDialog(null, user.getFullname()));
        
        button2 = new JButton("Change password");
        add(button2);
        button2.addActionListener(e -> new ChangePassword(manager, user));
        
        button3 = new JButton("Update full name and position");
        add(button3);
        button3.addActionListener(e -> new UpdateNameAndPosition(manager, user));
        
        button4 = new JButton("Sort customers");
        add(button4);
        button4.addActionListener(e -> new SortUserByLastName(manager));
        
        button5 = new JButton("Search customers");
        add(button5);
        button5.addActionListener(e -> new SearchCustomer(manager));
        
        button6 = new JButton("VIP customers List");
        add(button6);
        button6.addActionListener(e -> new VIPCustomer(manager));
        
        button7 = new JButton("NSW users");
        add(button7);
        button7.addActionListener(  e -> new NSWUser(manager));
        
        exit = new JButton("Log Out");
        add(exit);
        exit.addActionListener(e -> LogOut(e));
        
    }
    protected void LogOut(ActionEvent event) {
        this.setVisible(false); //close current frame
            //create new login frame
        Login frame = new Login();
    }
}
