import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;


public class deleteFrame implements ActionListener{


	
	JFrame f =new JFrame();
	JButton b1,b2;
	JLabel l,l1;
	JPanel p;
	String cid;
	JTextField t1;
	deleteFrame()
	{
		f.setTitle("Delete page");
		f.setSize(1366,768);
		f.setBackground(Color.BLUE);
		f.setLocationRelativeTo(f);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		Container c=getContentPane(f);
		f.setLayout(null);
		
		f.setContentPane(new JLabel(new ImageIcon("C:\\Nikhil\\Downloads\\Okinawa-extended-warranty-for-Electronic-and-Mechanical-components.jpg")));
	
		
		l=new JLabel("DELETE FORM");
		l.setBounds(580,270,270,30);
		l.setFont(new Font("Arial",Font.ITALIC,30));
		l.setFont(new Font("Arial",Font.TYPE1_FONT,30));
		l.setFont(new Font("Arial",Font.BOLD,30));
		f.add(l);
		
		l1=new JLabel("Customer ID");
		l1.setBounds(500,350,250,40);  
l1.setFont(new Font("Arial",Font.BOLD,26));
		f.add(l1);
		
		t1=new JTextField();
		t1.setBounds(700,350,180,30);
		f.add(t1);
		
		f.setVisible(true);
		
		b1=new JButton("Delete");
		b1.setBounds(550,480,100,30);
		b1.setBackground(Color.BLACK);
		b1.setFont(new Font("SansSerif",Font.BOLD,20));
		b1.setForeground(Color.WHITE);
		f.add(b1);
		b1.addActionListener(this);
		
		b2=new JButton("Cancel");
		b2.setBounds(740,480,100,30);
		b2.setBackground(Color.BLACK);
		b2.setFont(new Font("SansSerif",Font.BOLD,20));
		b2.setForeground(Color.WHITE);
		f.add(b2);
		b2.addActionListener(this);
	
		f.resize(1366,768);
		f.setVisible(true);
	}
	
	private Container getContentPane(JFrame f2) {
		// TODO Auto-generated method stub
		return null;
	}

	public void actionPerformed(ActionEvent e1)
	{

		Object obj = e1.getSource();
		if (obj==b2)
			f.dispose();
		new MainFrame();
		try
		{
		if(obj==b1)
		{	
			JOptionPane.showConfirmDialog(b1,"Do you want to delete enquiry ?","confirmation call",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
			
			DAO db=new DAO();
			Connection conn=(Connection) db.getConnection();
		 
			cid=t1.getText();
			
			System.out.println("cid="+cid);
			String deleteQuery = "delete from enquiry where customerid=?";
		    
			PreparedStatement preparedStatement;
			
			preparedStatement = (PreparedStatement) conn.prepareStatement(deleteQuery);
					
			preparedStatement.setString(1, cid+"");			
				
			int count = preparedStatement.executeUpdate();
			
			if(count==0)		
	   		   System.out.println("No Recored Found with ID= !!!"+cid);
		
		else
			System.out.println("Total "+count + " Records Deleted !!!");
	}
		}
		 catch (Exception e2)
		 {
			 System.out.println("error"); 
			 System.out.println(e2);
		 }
	  }
	public void windowClosing(WindowEvent e)
	{
		Object obj = e.getSource();
		if (obj==b2)
			f.dispose();
		
	}
}

	