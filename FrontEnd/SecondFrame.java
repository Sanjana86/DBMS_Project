package FrontEnd;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import Connection.*;

public class SecondFrame extends JFrame implements ActionListener {
	String sid;
	JLabel l1; 
	JTextField t1;
	JButton b1,b2,b3,b4,b5,b6;
	public static String sub_code;

	SecondFrame(String sid) {
		this.sid = sid;
		  JLabel background;
		setTitle("Course Selection");
		setSize(700,700);
	    setLayout(null);
	    
		BufferedImage img = null;
		try{
		img =  ImageIO.read(getClass().getResource("subjects.png"));}
		catch(IOException ex)
		{}
		background = new JLabel(new ImageIcon(img));
        background.setBounds(0,0,700,700);
        add(background);


        l1 = new JLabel("Student id");
		t1 = new JTextField(50);
		t1.setText(sid);
		t1.setEditable(false);

		l1.setBounds(50,100,100,30);
		t1.setBounds(150,100,150,30);
		

		b1 = new JButton("CS306 : PoPL");
		b2 = new JButton("CS307 : OS");
		b3 = new JButton("CS308 : DBMS");
		b4 = new JButton("CS309 : MPI");
		b6 = new JButton("CS314 : PW");
		b5 = new JButton("Back");

		b1.setBounds(180,180,300,50);
        b2.setBounds(180,240,300,50);
        b3.setBounds(180,300,300,50);
        b4.setBounds(180,360,300,50);
		b6.setBounds(180,420,300,50);
        b5.setBounds(295,480,70,40);

        b1.setBackground(Color.white);
        b2.setBackground(Color.white);
        b3.setBackground(Color.white);
        b4.setBackground(Color.white);
        b5.setBackground(Color.white);
		b6.setBackground(Color.white);

        b5.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b6.addActionListener(this);		

		background.add(l1);
		background.add(t1);
		background.add(b1);
		background.add(b2);
		background.add(b3);
		background.add(b4);
		background.add(b5);
		background.add(b6);

		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
       
	}
	public void actionPerformed(ActionEvent ae)
   {
      if(ae.getSource()==b5)
		{
			dispose();
		}

		else if(ae.getSource() == b1)
		{
			sub_code = "CS 306";
			PNConn.main();
			FeedBack f3 = new FeedBack(sub_code);
			f3.setVisible(true);
			
			
		}

		else if(ae.getSource() == b2)
		{
			
		
			sub_code = "CS 307";
			PNConn.main();
			FeedBack f3 = new FeedBack(sub_code);
			f3.setVisible(true);
			
		}

		else if(ae.getSource() == b3)
		{
			
			sub_code = "CS 308";
			PNConn.main();
			FeedBack f3 = new FeedBack(sub_code);
			f3.setVisible(true);
			
			
		}

		else if(ae.getSource() == b4)
		{
			
			sub_code = "CS 309";
			PNConn.main();
			FeedBack f3 = new FeedBack(sub_code);
			f3.setVisible(true);
			
			
		}

		else if(ae.getSource() == b6)
		{
			
			sub_code = "CS 314";
			PNConn.main();
			FeedBack f3 = new FeedBack(sub_code);
			f3.setVisible(true);
			
			
		}
   }



}