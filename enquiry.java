
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
class enquiry extends JFrame
{
JButton b1;
JTextField t1,t2,t3,t4,t5;
JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9;
JTextArea tal;
JPanel p;
public enquiry()
{
setTitle("Background Color for JFrame");
setSize(1000,1000);
setLocationRelativeTo(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setVisible(true);


setLayout(new BorderLayout());
JLabel background=new JLabel(new ImageIcon

("C:\\Users\\Nikhil\\wallpaperflare.com_wallpaper.jpg"));
add(background);
background.setLayout(new FlowLayout());

p=new JPanel();
p.setSize(700,700);
p.setLayout(null);

l=new JLabel("ENQUIRY FORM");
l.setBounds(10,20,50,20);
l.setFont(new Font("SansSerif",Font.BOLD,24));
l.setForeground(Color.white);
background.add(l);


l1=new JLabel("Customer Id:");
l1.setBounds(250,10,200,20);
l1.setForeground(Color.white);
background.add(l1);

t1=new JTextField();
t1.setBounds(20,50,100,20);
background.add(t1);
setVisible(true);

t1=new JTextField();
t1.setBounds(130,50,200,20);
background.add(t1);
setVisible(true);

l2=new JLabel("Name:");
l2.setBounds(20,100,100,20);
l2.setForeground(Color.white);
background.add(l2);

t2=new JTextField();
t2.setBounds(130,100,200,20);
background.add(t2);
setVisible(true);

l3=new JLabel("Email:");
l3.setBounds(20,150,100,20);
l3.setForeground(Color.white);
background.add(l3);

t3=new JTextField();
t3.setBounds(130,150,200,20);
background.add(t3);
setVisible(true);

l4=new JLabel("Mobile No:");
l4.setBounds(20,200,100,20);
l4.setForeground(Color.white);
background.add(l4);

t4=new JTextField();
t4.setBounds(130,200,200,20);
background.add(t4);
setVisible(true);

l5=new JLabel("Address:");
l5.setBounds(20,250,100,20);
l5.setForeground(Color.white);
background.add(l5);

tal=new JTextArea();
tal.setBounds(130,240,200,50);
background.add(tal);


l6=new JLabel("Budget:");
l6.setBounds(20,300,100,20);
l6.setForeground(Color.white);
background.add(l6);





}
public static void main(String args[])
{
new enquiry();
}
}