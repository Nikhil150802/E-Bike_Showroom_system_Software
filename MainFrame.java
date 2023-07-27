import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MainFrame extends JFrame implements ActionListener
{

	JButton Add, Delete, Update, Display, Models; 
	// JLabel label;
	 JFrame frame;
	
	
	MainFrame()
	{
		
		//setTitle("Main Frame");
		frame=new JFrame("E-Vehicle Scooter");
		frame.setSize(1366,768);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.getContentPane().setBackground(Color.white);
		Container c=getContentPane();
		frame.setLayout(null);
		
		frame.setContentPane(new JLabel(new ImageIcon("C:\\nicks\\Okinawa-Ridge-Plus-Electric-Scooter-2 (1).png")));
		
		
		Add=new JButton("Add Enquiry");
		Add.setBounds(880, 490, 250, 40);
		Add.setForeground(Color.black);
		Add.setFont(new Font("SansSerif",Font.BOLD,20));
		Add.setBorderPainted(false);
		Add.setContentAreaFilled(false);
		Add.setOpaque(false);
		Add.addActionListener(this);

	
		frame.add(Add);
		
		Delete=new JButton("Delete Enquiry");
		Delete.setBounds(880, 530, 250, 40);
		Delete.addActionListener(this);
		Delete.setForeground(Color.black);
		Delete.setFont(new Font("SansSerif",Font.BOLD,20));
		Delete.setBorderPainted(false);
		Delete.setContentAreaFilled(false);
		Delete.setOpaque(false);
		Delete.addActionListener(this);

		frame.add(Delete);
		
		Update=new JButton("Update Enquiry");
		Update.setBounds(880, 570, 250, 40);
		Update.setForeground(Color.black);
		Update.setFont(new Font("SansSerif",Font.BOLD,20));
		Update.setBorderPainted(false);
		Update.setContentAreaFilled(false);
		Update.setOpaque(false);
	
		Update.addActionListener(this);
		
		
		frame.add(Update);
		
		Models=new JButton("Models Enquiry");
		Models.setBounds(880, 610, 250, 50);
		Models.setForeground(Color.black);
		Models.setFont(new Font("SansSerif",Font.BOLD,20));
		Models.setBorderPainted(false);
		Models.setContentAreaFilled(false);
		Models.setOpaque(false);
		Models.addActionListener(this);
		frame.add(Models);
		
		Display=new JButton("Display Enquiry");
		Display.setBounds(880, 650, 250, 50);
		Display.setForeground(Color.black);
		Display.setFont(new Font("SansSerif",Font.BOLD,20));
		Display.setBorderPainted(false);
		Display.setContentAreaFilled(false);
		Display.setOpaque(false);
		
		
		Display.addActionListener(this);
		frame.add(Display);
	 frame.resize(1366,768);
		frame.setCursor(12);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		
		Object obj=e.getSource();
		if(obj==Add)
		    new enquiry_form();
		else if(obj==Delete)
			new deleteFrame();
		else if(obj==Models)
			new Project();
		else if (obj==Display)
			new displayallrecord();
		else if (obj==Update)
			new update();
		
	
	}
	public static void main(String[] args) 
	{
		MainFrame f=new MainFrame();
	}


	
}