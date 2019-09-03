package CISC3115;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingTest implements ActionListener {
	JButton button;
	public static void main(String[] args) 
	{
		SwingTest gui = new SwingTest();
		gui.go();
	}
	public void go()
	{
		JFrame frame = new JFrame();
		//JPanel panel = new JPanel();
		button = new JButton("林洁～～");
		button.addActionListener(this);
		frame.setBackground(Color.pink);
		frame.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent event) 
	{
		button.setText("爱你～ mua");
	}
}
