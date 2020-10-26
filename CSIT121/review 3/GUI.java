import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
public class GUI extends JFrame
{
		public GUI()
		{
			super();
			setLayout(new FlowLayout());
			setSize(400,300);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JButton next = new JButton("next");
			this.add(next);
			next.addActionListener(e -> {
				GUI2 lol = new GUI2();
				this.setVisible(false);
				//JOptionPane.showMessageDialog(null,"hi");
			});
		}
		
	
	
	
}