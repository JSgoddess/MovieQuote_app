//GUI baseed version of movie application from Chapter 1

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MovieGUI extends JFrame implements ActionListener
{
	// instance variable for this class
	Font myFont = new Font("Times New Roman", Font.BOLD, 24);
	JLabel quote = new JLabel("No subject is terrible if the story is true, if the prose is clean and honest, and if it affirms courage and grace under pressure.");
	JLabel movie = new JLabel("");
	JButton button = new JButton("Show Movie");

	// create a custom constractor for this class
	public MovieGUI()
	{
		super("Movie quote App");
		setSize(400, 160);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,1));
		getContentPane().setBackground(new Color(152, 224, 190));
		setVisible(true);
		quote.setFont(myFont);
		movie.setFont(myFont);
		button.setForeground(Color.RED);
		add(quote);
		add(button);
		add(movie);
		button.addActionListener(this);
	}
	// event handling method
	@Override
	public void actionPerformed(ActionEvent evt)
	{
		movie.setText("*** Midnight In Paris (2011) ***");
	}

	public static void main(String[] args) 
	{
		MovieGUI myFrame = new MovieGUI();
	}
}