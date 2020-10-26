import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;
public class personalbox extends JPanel{
	
	private JPanel contentPanel = new JPanel(new GridLayout(3,3,20,0));
	String selection = "none";

public personalbox(){

	JLabel mainlabel = new JLabel("Total Income");
	JTextField textfield1 = new JTextField(2);
	JRadioButton resident = new JRadioButton("Resident Tax");
	JRadioButton nonResident = new JRadioButton("Non-Resident Tax");
	JRadioButton Working = new JRadioButton("Working Holiday Tax");
	JButton Calculate = new JButton("Calculate");

	
	ActionListener radio = new ActionListener()
	{
		public void actionPerformed(ActionEvent action)
		{
			AbstractButton thebutton = (AbstractButton) action.getSource();
			System.out.println("Radio: " + thebutton.getText());
			selection = thebutton.getText();
			
			
		}
	};
	
	ActionListener calculate = new ActionListener()
	{
		public void actionPerformed(ActionEvent action)
		{	
			try
			{
			double input = Double.parseDouble(textfield1.getText());

			if (selection.equals("Resident Tax"))
			{
				JOptionPane.showMessageDialog(null, "Resident Tax payable ammount is " + ResidentTaxPayer.calctax(input));
			}
			else if(selection.equals("Non-Resident Tax"))
			{
				JOptionPane.showMessageDialog(null, "Resident Tax payable ammount is " + ForeignResidentTaxPayer.calctax(input));
			}
			else if(selection.equals("Working Holiday Tax"))
			{
				JOptionPane.showMessageDialog(null, "Resident Tax payable ammount is " + WorkingHolidayTaxPayer.calctax(input));
			}
			else if(selection.equals("none"))
			{
				JOptionPane.showMessageDialog(null, "Please choose an option");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Please choose an option");
			}
			}
			catch (NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "We need numbers and resident type");
			}
		}
	};
	
	resident.addActionListener(radio);
	nonResident.addActionListener(radio);
	Working.addActionListener(radio);
	Calculate.addActionListener(calculate);
	
	ButtonGroup groupup = new ButtonGroup();
	groupup.add(resident);
	groupup.add(nonResident);
	groupup.add(Working);

	
	//contentPane = new JPanel();
	//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	//contentPane.setLayout(new BorderLayout(0,0));
	contentPanel.add(mainlabel);
	contentPanel.add(textfield1);
	contentPanel.add(resident);
	contentPanel.add(nonResident);
	contentPanel.add(Working);
	contentPanel.add(Calculate);

	contentPanel.setSize(400, 140);
	contentPanel.setLayout(new GridLayout(3,3,20,0));
	contentPanel.setVisible(true);
}
	public JPanel getBox()
{
	return contentPanel;
	
}




}





