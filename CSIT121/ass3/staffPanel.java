import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.stream.*;
import java.util.*;


import javafx.scene.layout.Pane;
public class staffPanel extends JPanel
{
    private JPanel Panel = new JPanel(new GridLayout(0,2,0,20));

    public staffPanel(User input, UserManagement database){
        JButton fullName= new JButton("Show your full name");
        JButton changePassword= new JButton("Change your password");
        JButton UpdatefullName= new JButton("Update your full name");
		JButton SortByLastName= new JButton("Sort by last name");

        JTextField old_pass = new JTextField();
        JTextField new_pass = new JTextField();
        JTextField first_name = new JTextField();
        JTextField last_name = new JTextField();


        JLabel name = new JLabel();
        JLabel old_pass_label = new JLabel("Old password");
        JLabel new_pass_label = new JLabel("New password");
        JLabel first = new JLabel("First name");
        JLabel last = new JLabel("Last name");
		
		
		JTextArea sorted_String = new JTextArea();

		JScrollPane scroll = new JScrollPane(sorted_String, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

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
		
		SortByLastName.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent clicked)
			{
				//ArrayList<String> details = new ArrayList<String>();
				ArrayList<Billing> users = new ArrayList<Billing>();
				for( User i : database.getArrayList())
				{
					
					if(i instanceof Billing || i.getUserType() == UserType.VIP)
					{
						Billing e = (Billing) i;
						if(e.getBillingAddress()== null)
						{
						}
						else
						{
						users.add(e);
						//details.add(e.getLastName());
						//details.add(e.getBillingAddress().toString());	
						}
					}
					else
					{
					}

				}
				System.out.println();

				try{
				users.sort(Comparator.comparing(Billing::getLastName));
				//users.sort((Billing o1, Billing o2)->o1.getLastName().compareTo(o2.getLastName()));
				StringBuilder output = new StringBuilder();
				users.stream().forEach(e -> output.append(String.format("%s \n %s \n", e.getLastName(), e.getBillingAddress())));
				sorted_String.setText(output.toString());
				//JOptionPane.showMessageDialog(null, sorted_String);
				}
				catch(NullPointerException e)
				{
					
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
		Panel.add(SortByLastName);
		Panel.add(scroll);
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