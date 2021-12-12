package FrontEnd;
import java.awt.Color;
import java.awt.Font;
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

class FeedBack extends JFrame implements ActionListener {
    String pname;
	JButton b1,b2;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l0;
	JTextField t1,t2,t3,t4,t5;

	FeedBack()
	{
		
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

      l0 = new JLabel("Prof Name:");
      t1 = new JTextField(70);

        l1 = new JLabel("1-bad");
        l6 = new JLabel("2-avg");
        l7 = new JLabel("3-neutral");
        l8 = new JLabel("4-good");
        l9 = new JLabel("5-best");

		b1 = new JButton("logOut");
		b2 = new JButton("Submit");

        t2=new JTextField(50);
		t3=new JTextField(50);
        t4=new JTextField(50);
        t5=new JTextField(200);

		l2=new JLabel("Was the instructor well prepared for the class?");

        l3=new JLabel("Did the instructor show interest in helping the students learn?");

        l4=new JLabel("Did the instructor provided you with assignments,were they helpful?");  

        l5=new JLabel("Any Suggestions?");

        Font myFont = new Font("Serif",Font.PLAIN,20);

        l0.setFont(myFont);l1.setFont(myFont);l2.setFont(myFont);l3.setFont(myFont);l4.setFont(myFont);l5.setFont(myFont);l6.setFont(myFont);l7.setFont(myFont);l8.setFont(myFont);l9.setFont(myFont);

        l1.setBounds(50,50,60,30);
        l6.setBounds(120,50,70,30);
        l7.setBounds(190,50,80,30);
        l8.setBounds(270,50,70,30);
        l9.setBounds(340,50,70,30);
        l0.setBounds(50,100,100,40);
        t1.setBounds(150,100,150,40);
		l2.setBounds(50,150,400,40);
		l3.setBounds(50,250,510,40);
		l4.setBounds(50,350,570,40);

		l5.setBounds(50,450,200,30);
		t2.setBounds(50,200,50,30);
		t3.setBounds(50,300,50,30);
        t4.setBounds(50,400,50,30);
        t5.setBounds(50,500,400,100);
        
		b1.setBounds(570,590,90,40);
		b2.setBounds(570,640,90,40);
        
        b1.setBackground(Color.white);
        b2.setBackground(Color.white);
        


		background.add(l1);
        background.add(l6);
        background.add(l7);
        background.add(l8);
        background.add(l9);
        background.add(l0);
		background.add(l2);
        background.add(t2);
		background.add(l3);
        background.add(t3);
		background.add(l4);
        background.add(t4);
		background.add(l5);
		background.add(t5);

		background.add(t1);
		background.add(b1);
		background.add(b2);


        b2.addActionListener(this);
		b1.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
         

        
	}

	public void actionPerformed(ActionEvent ae)
    {
      
			dispose();
	}
	
}