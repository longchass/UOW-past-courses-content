import javax.swing.*;
import java.awt.*;
public class GUIprac extends JFrame
{
	public GUIprac()
	{
		super();
		setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(200,300);
		JButton Business = new JButton("Business Tax Calculator");
		JButton Personal = new JButton("Pesonal Tax Calculator");
		this.add (Business);
		this.add (Personal);
		Business.addActionListener(e ->
		{
			this.setVisible(false);
			new GUI();
		});
	}


}