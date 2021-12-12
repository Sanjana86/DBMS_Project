package FrontEnd;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import Connection.*;

import Connection.FConn;

public class FeedBack extends JFrame implements ActionListener {
	public static String pname;
	public static String sub;
	JButton b1,b2;
	JLabel l1,l2,l3,l4,l5;
	public static JTextField t1,t2,t3,t4,t5,t6,t7;
	
	FeedBack(String sub)
	{
		FeedBack.sub = sub;
		
		pname = PNConn.pname;
		//System.out.println(pname);
        setTitle("FeedBack Form");
		JLabel background;
		
		setSize(750,750);
		
		BufferedImage img = null;
		 try{
		 img =  ImageIO.read(getClass().getResource("p3.png"));}
		 catch(IOException ex)
		 {}
		 background = new JLabel(new ImageIcon(img));
      background.setBounds(0,0,750,750);
      add(background);


        l1 = new JLabel("Prof Name:");
		t1 = new JTextField(70);
		t1.setText(pname);
		t1.setEditable(false);

		b1 = new JButton("Logout");
		b2 = new JButton("Submit");

        t2=new JTextField(50);
		t3=new JTextField(50);
        t4=new JTextField(200);
        t5=new JTextField(10);
        t6=new JTextField(10);
        t7=new JTextField(10);


		l2=new JLabel("Was the instructor well prepared for the class?");

        l3=new JLabel("Did the instructor show interest in helping the students learn?");

        l4=new JLabel("Did the instructor provided you with assignments,were they helpful?");  

        l5=new JLabel("Any Suggestions?");

        Font myFont = new Font("Serif",Font.PLAIN,20);

        l1.setFont(myFont);l2.setFont(myFont);l3.setFont(myFont);l4.setFont(myFont);l5.setFont(myFont);

        l1.setBounds(50,100,100,30);
		l2.setBounds(50,150,400,40);
		l3.setBounds(50,250,510,40);
		l4.setBounds(50,350,570,40);

		l5.setBounds(50,450,200,30);
		t4.setBounds(50,500,400,80);
		t1.setBounds(150,100,200,30);
                
		b1.setBounds(570,590,90,40);
		b2.setBounds(570,640,90,40);
        b1.setBackground(Color.white);
        b2.setBackground(Color.white);


		background.add(l1);
		background.add(l2);
		background.add(l3);
		background.add(l4);
		background.add(l5);
		background.add(t4);

		background.add(t1);
		background.add(b1);
		background.add(b2);

		  
        t5.setBounds(50,200,100,40);
    
        
        t6.setBounds(50,300,100,40);  
  
        
        t7.setBounds(50,400,100,40);  
  
        

        background.add(t5);
		background.add(t6);
		background.add(t7);

        b2.addActionListener(this);
		b1.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
         

        
	}

	public void actionPerformed(ActionEvent ae)
    {
      
			if (ae.getSource()==b2)
            {
                FConn.main();    
            }
            else if(ae.getSource()==b1)
            {
               System.exit(0);
            }
	}
	
}