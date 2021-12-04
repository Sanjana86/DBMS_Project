package Front;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import Conn.*;

public class SignUpFrame extends JFrame implements ActionListener {
	
	String sname,semail,srollno,suserid,spasswoed,scpassword;
        JLabel l1,l2,l3,l4,l5,l6;
        public static JTextField t1,t2,t3,t4,t5,t6;
        JButton b1;
        
        SignUpFrame()
        {
		
		  JLabel background;
		setTitle("SignUp Page");
		setSize(700,700);
	     setLayout(null);
	    
		ImageIcon img = new ImageIcon("signup.png");
      background = new JLabel("",img,JLabel.CENTER);
      background.setBounds(0,0,700,700);
      add(background);
      l1 = new JLabel("Name:");
      t1 = new JTextField(25);
      l2 = new JLabel("Eamil Id:");
      t2 = new JTextField(50);
      l3 = new JLabel("Roll no:");
      t3 = new JTextField(15);
      l4 = new JLabel("User Id:");
      t4 = new JTextField(15);
      l5 = new JLabel("Password:");
      t5 = new JTextField(30);
      l6 = new JLabel("Confirm Password:");
      t6 = new JTextField(30);

      l1.setBounds(150,100,100,30);
      l2.setBounds(150,150,100,30);
     l3.setBounds(150,200,100,30);
      l4.setBounds(150,250,100,30);
     l5.setBounds(150,300,100,30);
      l6.setBounds(150,350,150,30);
     t1.setBounds(300,100,250,30);
      t2.setBounds(300,150,250,30);
     t3.setBounds(300,200,100,30);
      t4.setBounds(300,250,100,30);
     t5.setBounds(300,300,100,30);
      t6.setBounds(300,350,100,30);
     Font myFont = new Font("Serif",Font.BOLD,16);
     l1.setFont(myFont);l2.setFont(myFont);l3.setFont(myFont);l4.setFont(myFont);l5.setFont(myFont);l6.setFont(myFont);

     b1 = new JButton("Submit");
     b1.setBounds(570,550,100,40);
     b1.addActionListener(this);
    
   
      background.add(l1);
      background.add(t1);
      background.add(l2);
      background.add(t2);
      background.add(l3);
      background.add(t3);
      background.add(l4);
      background.add(t4);
      background.add(l5);
      background.add(t5);
      background.add(l6);
      background.add(t6);
      background.add(b1);
      
   setDefaultCloseOperation(EXIT_ON_CLOSE);
		
       
	}

   public void actionPerformed(ActionEvent ae)
   {
      //String passValue = t5.getText();
      //String correctPass = t6.getText();
      if (ae.getSource()==b1 )
      {
         
         Conn.main();
         //System.out.println("Done");
         dispose();
      }
   }
	
}