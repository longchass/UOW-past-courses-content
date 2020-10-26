import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.stream.*;
import java.util.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.*;
public class displayWindow extends JPanel
{
	public displayWindow(UserManagement input)
	{
		super();
		
		JList sadfsad = new JList(input.display());
		add(sadfsad);
		show();
		JOptionPane.showMessageDialog(null, this);
	}


}