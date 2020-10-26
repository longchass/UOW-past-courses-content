import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.*;
public class customerPanel extends JPanel
{

    private JPanel Panel = new JPanel(new GridLayout(0,2,0,20));

    public customerPanel(User input, UserManagement database){
        JButton fullName= new JButton("Show your full name");
        JButton changePassword= new JButton("Change your password");
        JButton UpdatefullName= new JButton("Update your full name");

        JTextField old_pass = new JTextField();
        JTextField new_pass = new JTextField();
        JTextField first_name = new JTextField();
        JTextField last_name = new JTextField();


        JLabel name = new JLabel();
        JLabel old_pass_label = new JLabel("Old password");
        JLabel new_pass_label = new JLabel("New password");
        JLabel first = new JLabel("First name");
        JLabel last = new JLabel("Last name");


        fullName.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent clicked)
            {
                name.setText(getFullName(input));
            }
        });

        changePassword.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent clicked)
            {
                boolean test = database.changePassword(input.getUsername(), old_pass.getText(), new_pass.getText());
                if(test == false)
                JOptionPane.showMessageDialog(null, "Can't Change the Password, check input again");
                else
                JOptionPane.showMessageDialog(null, "Password Sucessfully Channged");
            }
        });
		
		UpdatefullName.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent clicked)
			{
				try
				{
					if(first_name.getText().isEmpty()|| last_name.getText().isEmpty())
					throw new NullPointerException();
					else
					{
					input.setFirstName(first_name.getText());
					input.setLastName(last_name.getText());
					}
					
				}
				catch(NullPointerException e)
				{
					JOptionPane.showMessageDialog(null, "Can't change name please check your input");
				}
				
			}
		});
	
        Panel.add(fullName);
        Panel.add(name);
        Panel.add(changePassword);
        Panel.add(new JLabel());
        Panel.add(old_pass_label);
        Panel.add(new_pass_label);
        Panel.add(old_pass);
        Panel.add(new_pass);
        Panel.add(UpdatefullName);
        Panel.add(new JLabel());
        Panel.add(first);
        Panel.add(last);
        Panel.add(first_name);
        Panel.add(last_name);
        Panel.setVisible(true);
    }
    
    public JPanel getBox()
    {
        return Panel;
    }

    public String getFullName(User input)
    {
        return input.getFullName();
    }



}