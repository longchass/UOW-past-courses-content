import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JOptionPane;
public class GUI
{
	public static void main (String[] args)
	{
		JFrame f = new JFrame("Tax Calculator");
		JButton Business = new JButton("Business Tax Calculator");
		JButton Personal = new JButton("Pesonal Tax Calculator");
		businessbox first = new businessbox();
		personalbox second = new personalbox();		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add (Business);
		f.add (Personal);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		f.setSize(400, 140);
		f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
		f.setLayout(new GridLayout(1,2,20,0));
		f.setVisible(true);
			Business.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent clicked)
				{  
					f.getContentPane().removeAll();
					f.getContentPane().add(first.getBox());
					f.setTitle("Business Tax Calculator");
					f.validate();
					f.repaint();
				} 
			}
			); 
			
			Personal.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent clicked)
				{
					
					f.getContentPane().removeAll();
					f.getContentPane().add(second.getBox());
					f.setTitle("Personal Tax Calculator");
					f.validate();
					f.repaint();
					JOptionPane.showMessageDialog(null, "you chose Pesonal calculator");
					
					
					
				}
			}
			);


	
	
	}





}