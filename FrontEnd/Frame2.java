package Front;
//package Frontend;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class SecondFrame extends JFrame implements ActionListener {
	String sid;
	JLabel l1; JTextField t1;
	JButton b1,b2,b3,b4,b5;

	SecondFrame(String sid) {
		this.sid = sid;
		  JLabel background;
		setTitle("Course Selection");
		setSize(700,700);
	     setLayout(null);
	    
		ImageIcon img = new ImageIcon("poster.png");
      background = new JLabel("",img,JLabel.CENTER);
      background.setBounds(0,0,700,700);
      add(background);


        l1 = new JLabel("Student id");
		t1 = new JTextField(50);
		t1.setText(sid);
		t1.setEditable(false);

		l1.setBounds(50,100,100,30);
		t1.setBounds(150,100,150,30);
		

		b1 = new JButton("CS202 : DLD&CA");
		b2 = new JButton("CS203 : DAA");
		b3 = new JButton("CS204 : OOP");
		b4 = new JButton("CS205 : TOC");
		b5 = new JButton("Back");

		b1.setBounds(180,200,300,50);
        b2.setBounds(180,260,300,50);
        b3.setBounds(180,320,300,50);
        b4.setBounds(180,380,300,50);
        b5.setBounds(295,500,70,40);

        b1.setBackground(Color.white);
        b2.setBackground(Color.white);
        b3.setBackground(Color.white);
        b4.setBackground(Color.white);
        b5.setBackground(Color.white);

        b5.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);	

		background.add(l1);
		background.add(t1);
		background.add(b1);
		background.add(b2);
		background.add(b3);
		background.add(b4);
		background.add(b5);

		
		
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
			
			String profName = "Prof Rama Murthy";
			FeedBack f3 = new FeedBack(profName);
			f3.setVisible(true);
			
			
		}

		else if(ae.getSource() == b2)
		{
			
			String profName = "Prof Praveen Kumar Alapati";
			FeedBack f3 = new FeedBack(profName);
			f3.setVisible(true);
			
			
		}

		else if(ae.getSource() == b3)
		{
			
			String profName = "Prof Praffula";
			FeedBack f3 = new FeedBack(profName);
			f3.setVisible(true);
			
			
		}

		else if(ae.getSource() == b4)
		{
			
			String profName = "Prof Rajesh Tavva";
			FeedBack f3 = new FeedBack(profName);
			f3.setVisible(true);
			
			
		}
   }



}