import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;
public class businessbox extends JPanel{
	
	private JPanel BusinessFrame = new JPanel(new GridLayout(3,3,20,0));

public businessbox(){
	JLabel IncomeLabel = new JLabel("Total Income");
	JLabel ExpenseLabel = new JLabel("Total Expense");
	JTextField textfield1 = new JTextField();
	JTextField textfield2 = new JTextField();



	
	ActionListener input = new ActionListener()
	{
		public void actionPerformed(ActionEvent action)
		{
			try
			{
			double income = Double.parseDouble(textfield1.getText());
			double expense = Double.parseDouble(textfield2.getText());
			

			AbstractButton thebutton = (AbstractButton) action.getSource();
			System.out.println("Selected: " + thebutton.getText());
			JOptionPane.showMessageDialog(null, "Business tax payable ammount is " + BusinessTaxPayer.calctax(income,expense));
			}
			catch (NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "We need numbers");
			}
		}
	};
	 
	
	JButton Calculate = new JButton("Calculate");
	Calculate.addActionListener(input);

	
	//contentPane = new JPanel();
	//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	//contentPane.setLayout(new BorderLayout(0,0));
	BusinessFrame.add(IncomeLabel);
	BusinessFrame.add(textfield1);
	BusinessFrame.add(ExpenseLabel);
	BusinessFrame.add(textfield2);
	BusinessFrame.add(Calculate);
	BusinessFrame.setVisible(true);
}
public JPanel getBox()
{
	return BusinessFrame;
	
}
	




}





