import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Project extends JFrame{
    JLabel pic;
    Timer tm;
    JFrame f=new JFrame();
    
    int x = 0;
    //Images Path In Array
    String[] list = {
    		"C:\\Nikhil\\Downloads\\okinawa lite 2.jpg",//0
    		"C:\\Nikhil\\Downloads\\okinawa-i-praise1.jpg",//1
    		"C:\\Nikhil\\Downloads\\Okinawa Okhi-90 1.jpg",//2
    		"C:\\Nikhil\\Downloads\\okaya-freedum-1.jpg",//3
    		"C:\\Nikhil\\Downloads\\okaya iq150+.jpg",//4
    		"C:\\Nikhil\\Downloads\\okinawa r30 1.jpg",//5
    		"C:\\Nikhil\\Downloads\\okinawa praise 1.jpg",//6
    		"C:\\Nikhil\\Downloads\\okinawa Dual100 (1).jpg",//7
           };
    
    public Project(){
        f.setTitle("Okinawa Scooter Models");
        pic = new JLabel();
        pic.setBounds(0,0, 1380, 700);

        //Call The Function SetImageSize
        SetImageSize(6);
               //set a timer
        tm = new Timer(6000,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SetImageSize(x);
                x += 1;
                if(x >= list.length )
                    x = 0; 
            }
        });
        f.add(pic);
        tm.start();
        f.setLayout(null);
        f.setSize(1366, 768);
        f.getContentPane().setBackground(Color.white);
        f.setLocationRelativeTo(null);
       // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("close");
        f.dispose();
        new MainFrame();
        
        f.setVisible(true);
    }
    //create a function to resize the image 
    public void SetImageSize(int i){
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        pic.setIcon(newImc);
    }

}