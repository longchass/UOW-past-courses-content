import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JOptionPane;
public class GUI
{

public static void main(String[] args)
{
    JFrame f = new JFrame();
    UserManagement database = new UserManagement();

    loginPanel login = new loginPanel(database);

    database.FileToObject();

    f.getContentPane().add(login.getBox());    
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(400,140);
    f.setLocationRelativeTo(null);

    f.setVisible(true);
    f.addWindowListener(new WindowAdapter()
    {
        @Override
        public void windowClosing(WindowEvent e)
        {
            database.ArrayToFile();
        }
    });

}
}