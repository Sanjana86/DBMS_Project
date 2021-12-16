package FrontEnd;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;


import Connection.*;

public class PrFrame extends JFrame implements ActionListener{
    
    public static String pid,sub1,sub2;
	JButton b1,b2,b3;
	JLabel l1;
	JTextField t1;
    PrFrame(String pid)
	{
        PrFrame.pid = pid;
        JLabel background;
		
		setSize(700,700);
		
		BufferedImage img = null;
		 try{
		 img =  ImageIO.read(getClass().getResource("display.png"));}
		 catch(IOException ex)
		 {}
		 background = new JLabel(new ImageIcon(img));
      background.setBounds(0,0,700,700);
      add(background);
		this.setLayout(null);

        l1 = new JLabel("Prof Name:");
        t1 = new JTextField(70);
        
        

      Font myFont = new Font("Serif",Font.PLAIN,20);
      l1.setFont(myFont);

      l1.setBounds(50,100,100,30);
      t1.setBounds(150,100,150,30);
      ProfNameConn.main();
      t1.setText(ProfNameConn.pass);
      t1.setEditable(false);

     

      SCConn.main();
      background.add(l1);
        background.add(t1);
        int count = SCConn.num;
        if(count > 1)
        {
            SubConn.main();
            sub1 = SubConn.subcode;
            sub2 = SubConn.subcode2;
            b1 = new JButton(sub1); 
            b2 = new JButton(sub2); 
            background.add(b1);
            background.add(b2);
            b1.addActionListener(this);
            b2.addActionListener(this);
            b1.setBounds(300,250,100,30);
            b1.setBackground(Color.white);
            
            b2.setBounds(300,300,100,30);
            b2.setBackground(Color.white);
        }
        else
        {
            SubConn.main();
            sub1 = SubConn.subcode;
            b1 = new JButton(sub1); 
            background.add(b1);
            b1.addActionListener(this);

            b1.setBounds(300,250,100,30);
            b1.setBackground(Color.white);
        }
     
		setDefaultCloseOperation(EXIT_ON_CLOSE);
    
}
public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            DisplayFrame f = new DisplayFrame();
            f.setTitle(sub1);
            f.setVisible(true);
        }
        else if(ae.getSource()==b2)
        {
            sub1 = sub2;
            DisplayFrame f = new DisplayFrame();
            f.setTitle(sub1);
            f.setVisible(true);
        }
      
        
		
	}
	
}
