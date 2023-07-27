import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class update extends JFrame implements ActionListener
{
	JButton b1,b2;
	JLabel la,lb;
	JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JComboBox day,month,year;
	JRadioButton Fiftyk_to_Eightyk,Eightyk_to_Hundredk,Above_Hundredk,High_Speed,Low_Speed,Cash,Loan,Online;
	Checkbox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8;
	JTextArea tal;
	String customerid;
	String budget;
	String model;
	String payment;
	String date;
	JFrame f =new JFrame();
	
	JTextField t1,t2,t3,t4,t5;
	update()
	{
		f.setTitle("Upadate page");
		f.setSize(1366,768);
		f.setBackground(Color.WHITE);
		f.setLocationRelativeTo(f);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		//Container c=getContentPane(f);
		f.setLayout(null);
		
		f.setContentPane(new JLabel(new ImageIcon("C:\\Nikhil\\Downloads\\wallpaperflare.com_wallpaper (3).jpg")));
	
		
		la=new JLabel("UPDATE  FORM");
		la.setBounds(170,160,270,30);
		la.setFont(new Font("Arial",Font.ITALIC,30));
		la.setFont(new Font("Arial",Font.TYPE1_FONT,30));
		la.setFont(new Font("Arial",Font.BOLD,30));
		f.add(la);
		
		lb=new JLabel("Customer ID");
		lb.setBounds(100,250,250,40);  
        lb.setFont(new Font("Arial",Font.BOLD,26));
		f.add(lb);
		
		t1=new JTextField();
		t1.setBounds(280,255,180,30);
		f.add(t1);
		
		f.setVisible(true);
		
		b1=new JButton("Update");
		b1.setBounds(140,400,110,30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("SansSerif",Font.BOLD,20));
		f.add(b1);
		b1.addActionListener(this);
		
		b2=new JButton("Cancel");
		b2.setBounds(310,400,100,30);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setFont(new Font("SansSerif",Font.BOLD,20));
		f.add(b2);
		b2.addActionListener(this);
	
		f.resize(1366,768);
		f.setCursor(12);
		f.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e) 
	{	
		Object obj = e.getSource();
	if (obj==b2)
		f.dispose();
		try
		{
		if(e.getSource()==b1)
		{
			if(t1.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this,"Enter Customer_id","Empty Field",JOptionPane.PLAIN_MESSAGE);
			}
			else
			{
				String id=t1.getText();
				boolean flag=false;
				
			
			    DAO db=new DAO();
				Connection conn=db.getConnection();
				
				String selectQuery= "select * from enquiry"+"";
				PreparedStatement preparedStatement=
						conn.prepareStatement(selectQuery);
				ResultSet result=preparedStatement.executeQuery();
				String customerid,name,email,mobileno,address,budget,model,payment,date;
				
				while(result.next())
				{
					if ((result.getString(1).equalsIgnoreCase(id)))
					{
						flag=true;
						customerid=result.getString(1);
						name=result.getString(2);
						email=result.getString(3);
						mobileno=result.getString(4);
						address=result.getString(5);
						budget=result.getString(6);
						model=result.getString(7);
						payment=result.getString(8);
						date=result.getString(9);
						conn.close();
						new update_2(customerid,name,email,mobileno,address,budget,model,payment,date);
						break;
						
					}
				}
				if (flag=false)
				{
					JOptionPane.showMessageDialog(this,"NO RECORD FOUND.");
				}
			}
		}
		else if (e.getSource()==b2)
		{
			f.dispose();
			new MainFrame();
		}
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}
}
			
