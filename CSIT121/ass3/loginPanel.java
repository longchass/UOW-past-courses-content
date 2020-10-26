import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JOptionPane;

import javafx.scene.layout.Pane;
public class loginPanel extends JPanel
{
    private JPanel Panel = new JPanel(new GridLayout(3,2,40,0));
    
    public loginPanel(UserManagement database)
    {
        JLabel username = new JLabel("Username");
        JLabel password = new JLabel("Password");

        JTextField user_text = new JTextField("user");
        JTextField pass_text = new JTextField("Password");

        JButton login = new JButton("login");

        login.addActionListener(new ActionListener()
        {
            boolean verify = false;

            public void actionPerformed(ActionEvent clicked)
            {
                boolean result = User.verifyLogInByUsernameAndPassword(database.getArrayList(), user_text.getText(), pass_text.getText());
                if(result == false)
                System.out.println("Wrong Wrong");
                else
                {
                    User user = database.getUser(user_text.getText(), pass_text.getText());
                    UserType user_type = user.getUserType();
                    if(user_type == UserType.Staff)
                    {
						JOptionPane.showMessageDialog(null, "Welcome Staff");
                        System.out.println(user_type);
                        JFrame host = (JFrame) SwingUtilities.getWindowAncestor(Panel); 
                        host.getContentPane().removeAll();
                        host.setSize(500,500);
                        staffPanel hi = new staffPanel(user, database);
                        host.add(hi.getBox());
                        host.validate();
                        host.repaint();
                    }
                    else if(user_type == UserType.Customer)
                    {
						JOptionPane.showMessageDialog(null, "Welcome Customer");
						System.out.println(user_type);
						JFrame host = (JFrame) SwingUtilities.getWindowAncestor(Panel);
						host.getContentPane().removeAll();
						host.setSize(500,500);
						customerPanel hi = new customerPanel(user, database);
						host.add(hi.getBox());
						host.validate();
						host.repaint();
                    }


                }
            }
        });

        Panel.add(username);
        Panel.add(user_text);
        Panel.add(password);
        Panel.add(pass_text);
        Panel.add(login);
        Panel.setVisible(true);
    }

    public JPanel getBox()
    {
        return Panel;
    }
    public void login()
    {

    }
}