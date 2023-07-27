import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

class update_2 extends JFrame implements ActionListener{
	
	
	JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JTextField t1,t2,t3,t4,t5;
	JComboBox day,month,year;
	JCheckBox terms;
	JRadioButton Fiftyk_to_Eightyk,Eightyk_to_Hundredk,Above_Hundredk,High_Speed,Low_Speed,Cash,Loan,Online;
	Checkbox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8;
	JTextArea tal;
	JButton ok;
	String customerid;
	String budget;
	String model;
	String payment;
	String date;
	JFrame f =new JFrame();
	JLabel msg;
	
	update_2(String customerid,String name,String email,String mobile,String address,String budget,String model,String payment,String date){
		
		f.setTitle("E-Bike Vehicle");
		f.setSize(1366,768);
		f.setBackground(Color.white);
		f.setLocationRelativeTo(f);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setLayout(null);
		
		f.setContentPane(new JLabel(new ImageIcon("C:\\Nikhil\\wallpaperflare.com_wallpaper (2)2.jpg")));
		    
		
		l=new JLabel("UPDATE FORM");
		l.setBounds(1000,20,200,20);
		l.setFont(new Font("SansSerif",Font.BOLD,24));
		f.add(l);
		
		
		l1=new JLabel("Customer Id:");
		l1.setBounds(930,70,100,20);
		l1.setForeground(Color.black);
		l1.setFont(new Font("SansSerif",Font.BOLD,14));
		f.add(l1);
		
		t1=new JTextField(customerid);
		t1.setBounds(1050,70,200,20);
		f.add(t1);
		setVisible(true);
		
		l2=new JLabel("Name:");
		l2.setBounds(930,120,100,20);
		l2.setFont(new Font("SansSerif",Font.BOLD,14));
		f.add(l2);
		
		t2=new JTextField(name);
		t2.setBounds(1050,120,200,20);
		f.add(t2);
		setVisible(true);
		
		l3=new JLabel("Email:");
		l3.setBounds(930,170,100,20);
		l3.setFont(new Font("SansSerif",Font.BOLD,14));
		f.add(l3);
		
		t3=new JTextField(email);
		t3.setBounds(1050,170,200,20);
		f.add(t3);
		setVisible(true);
		
		l4=new JLabel("Mobile No:");
		l4.setBounds(930,220,100,20);
		l4.setFont(new Font("SansSerif",Font.BOLD,14));
		f.add(l4);
		
		t4=new JTextField(mobile);
		t4.setBounds(1050,220,200,20);
		f.add(t4);
		setVisible(true);
		
		l5=new JLabel("Address:");
		l5.setBounds(930,270,100,20);
		l5.setFont(new Font("SansSerif",Font.BOLD,14));
		f.add(l5);
		
		t5=new JTextField(address);
		t5.setBounds(1050,270,200,50);
		f.add(t5);
		
		
		l6=new JLabel("Budget:");
		l6.setBounds(930,320,100,20);
		l6.setFont(new Font("SansSerif",Font.BOLD,14));
		f.add(l6);
		
		Fiftyk_to_Eightyk=new JRadioButton("50k to 80k");
		Eightyk_to_Hundredk=new JRadioButton("80k to 100k");
		Above_Hundredk=new JRadioButton("Above 100k");
		
		Fiftyk_to_Eightyk.setBounds(1050,310,200,50);
		Fiftyk_to_Eightyk.setOpaque(false);
		Eightyk_to_Hundredk.setBounds(1050,340,200,50);
		Eightyk_to_Hundredk.setOpaque(false);
		Above_Hundredk.setBounds(1050,370,200,50);
		Above_Hundredk.setOpaque(false);
		
		f.add(Fiftyk_to_Eightyk);
		f.add(Eightyk_to_Hundredk);
		f.add(Above_Hundredk);
		
		ButtonGroup bud=new ButtonGroup();
		bud.add(Fiftyk_to_Eightyk);
	    bud.add(Eightyk_to_Hundredk);
		bud.add(Above_Hundredk);
		
		
		l7=new JLabel("Model:");
		l7.setBounds(930,430,100,20);
		l7.setFont(new Font("SansSerif",Font.BOLD,14));
		f.add(l7);
		
		High_Speed=new JRadioButton("High_Speed");
		Low_Speed=new JRadioButton("Low_Speed");
		
		High_Speed.setBounds(1050,410,100,50);
		High_Speed.setOpaque(false);
		Low_Speed.setBounds(1150,410,100,50);
		Low_Speed.setOpaque(false);
		
		f.add(High_Speed);
		f.add(Low_Speed);
		
		ButtonGroup mod=new ButtonGroup();
		mod.add(High_Speed);
		mod.add(Low_Speed);
		
		l8=new JLabel("Payment:");
		l8.setBounds(930,470,100,20);
		l8.setFont(new Font("SansSerif",Font.BOLD,14));
		f.add(l8);
		
		Cash=new JRadioButton("Cash");
		Loan=new JRadioButton("Loan");
		Online=new JRadioButton("Online");
		
		Cash.setBounds(1050,450,200,50);
		Cash.setOpaque(false);
		Loan.setBounds(1050,480,200,50);
		Loan.setOpaque(false);
		Online.setBounds(1050,510,200,50);
		Online.setOpaque(false);
		
		f.add(Cash);
		f.add(Loan);
		f.add(Online);
		
		ButtonGroup pay=new ButtonGroup();
		pay.add(Cash);
		pay.add(Loan);
		pay.add(Online);
		
		l9=new JLabel("Date:");
		l9.setBounds(930,560,100,20);
		l9.setFont(new Font("SansSerif",Font.BOLD,14));
		f.add(l9);
		
		String days[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22",
				"23","24","25","26","27","28","29","30","31"};
		String months[]={"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
		String years[]={"2025","2024","2023","2022","2021","2020","2019","2018","2017","2016","2015","2014","2013",
				"2012","2011","2010","2009","2008","2007","2006","2005","2004","2003","2002","2001","2000","1999","1998"};
		
		day=new JComboBox(days);
		month=new JComboBox(months);
		year=new JComboBox(years);
		
		day.setBounds(1050,560,50,20);
		month.setBounds(1110,560,50,20);
		year.setBounds(1170,560,60,20);
		
		f.add(day);
		f.add(month);
		f.add(year);
		
		terms=new JCheckBox("Please accept terms and conditions");
		terms.setBounds(1000,600,300,20);
		terms.setForeground(Color.red);
		terms.setOpaque(false);
		f.add(terms);
		
	
		ok=new JButton("OK");
		ok.setBounds(1050,640,100,40);
		ok.setFont(new Font("SansSerif",Font.BOLD,15));
		ok.setBackground(Color.BLACK);
		ok.setForeground(Color.WHITE);
		ok.addActionListener(this);
		f.add(ok);
	
		
		msg=new JLabel();
		msg.setBounds(400,750,300,20);
		f.add(msg);
		
        f.resize(1366,768);
        f.setCursor(12);
        f.setVisible(true);
}	
	public void actionPerformed(ActionEvent e) {
		
		Object obj=e.getSource();
		if (obj==ok)
			
			 JOptionPane.showMessageDialog(ok, "Updated Successfully !!!");
		{
			try
			{
				if(Eightyk_to_Hundredk.isSelected()){
					budget="Eightyk_to_Hundredk";
				}
				else if(Above_Hundredk.isSelected()){
					budget="Above_Hundredk";
				}
				else{
					budget="Fiftyk_to_Eightyk";
				}
				
				if(Low_Speed.isSelected()){
					model="Low_Speed";
				}
				else{
					model="High_Speed";
				}
				
				if(Loan.isSelected()){
					payment="Loan";
				}
				else if(Online.isSelected()){
					payment="Online";
				}
				else{
					payment="Cash";
				}
				
				String date=day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem();
                 
				System.out.println("b"+budget);
				System.out.println(model);
				System.out.println(payment);
				System.out.println(date);
				
				
				DAO db=new DAO();
				Connection conn=db.getConnection();
				
				
				 String selectQuery = "update enquiry set name=?, email=?, mobileno=?, address=? ,budget=?,model=?,payment=?,date=? where customerid=?";
 	    	    
				    PreparedStatement preparedStatement = null;
				    preparedStatement=conn.prepareStatement(selectQuery);

					   preparedStatement.setString(1,t2.getText());
					   preparedStatement.setString(2,t3.getText());
					   preparedStatement.setString(3,t4.getText());
					   preparedStatement.setString(4,t5.getText());
					   preparedStatement.setString(5,budget);	
					   preparedStatement.setString(6,model);
					   preparedStatement.setString(7,payment);
					   preparedStatement.setString(8,date);
					   preparedStatement.setString(9,t1.getText());
					   preparedStatement.executeUpdate();
					   conn.close();
					   
					   //JOptionPane.showMessageDialog(this, "Updated Successfully !!!");
					   f.dispose();
					   new MainFrame();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
	}

}