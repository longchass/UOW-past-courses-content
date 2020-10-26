import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.stream.*;
import java.util.*;
public class GUI extends JFrame
{
	JButton button1 = new JButton("display");
		
	JButton button2 = new JButton("display");

	JButton button3 = new JButton("display");

	JButton button4 = new JButton("display");

	JButton button5 = new JButton("display");

	
	public GUI()
	{
		super("New Frame");

	UserManagement hi = new UserManagement();
	hi.readData();
	add(button1);
	add(button2);
	add(button3);
	add(button4);
	add(button5);
	setLayout(new FlowLayout());
	
	button1.addActionListener( e -> {
		displayWindow show = new displayWindow(hi);
		show.setVisible(true);
	});
		button2.addActionListener( e -> {
		sorted show = new sorted(hi);
		show.setVisible(true);
	});
	}
	

		
}


