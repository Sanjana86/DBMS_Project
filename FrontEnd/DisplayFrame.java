package FrontEnd;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import Connection.*;
public class DisplayFrame extends JFrame implements ActionListener{
    
	JButton b1;
	JLabel l10,l11,l12,l13,l1,l2,l3,l4;
	JTextField t10,t11,t12,t13;

	DisplayFrame()
	{
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

		

		l1 = new JLabel("Avg rating score :");
		l2 = new JLabel("Avg rating score :");
		l3 = new JLabel("Avg rating score :");
		l4 = new JLabel("Avg rating score :");

        t10=new JTextField(50);
		t11=new JTextField(50);
    	t12=new JTextField(40);
     	t13=new JTextField(40);
		DQ1Conn.main();
		t10.setText(DQ1Conn.q_1);
		t10.setEditable(false);
		DQ2Conn.main();
		t11.setText(DQ2Conn.q_2);
		t11.setEditable(false);
		DQ3Conn.main();
		t12.setText(DQ3Conn.q_3);
		t12.setEditable(false);
		DQ4Conn.main();
		t13.setText(DQ4Conn.q_4);
		t13.setEditable(false);

		l10=new JLabel("Was the instructor well prepared for the class?");
        l11=new JLabel("Did the instructor show interest in helping the students learn?");
        l12=new JLabel("Did the instructor provided you with assignments,were they helpful?");   
        l13=new JLabel("Did the course gave you confidence to do more advanced work in the subject?");


		b1 = new JButton("Logout");
               
        Font myFont = new Font("Serif",Font.PLAIN,20);
		l1.setFont(myFont);l2.setFont(myFont);l3.setFont(myFont);l10.setFont(myFont);l11.setFont(myFont);l12.setFont(myFont);l13.setFont(myFont);
		l4.setFont(myFont);

		l10.setBounds(50,100,600,40);
        l1.setBounds(50,150,150,40);
		t10.setBounds(205,155,40,30);

        l11.setBounds(50,200,600,40);
        l2.setBounds(50,250,150,40);
		t11.setBounds(205,255,40,30);
        l12.setBounds(50,300,600,40);
        l3.setBounds(50,350,150,40);
		t12.setBounds(205,355,40,30);

		l13.setBounds(50,400,650,30);
		l4.setBounds(50,450,150,40);
        t13.setBounds(205,455,40,30);
		b1.setBounds(500,550,80,40);
        b1.setBackground(Color.white);
       
        background.add(l10);
		background.add(l1);
		background.add(t10);
        background.add(l11);
        background.add(l2);
		background.add(t11);
        background.add(l12);
        background.add(l3);
		background.add(t12);
        background.add(l13);
		background.add(t13);
		background.add(l4);
		background.add(b1);
                
		b1.addActionListener(this);
        setTitle("Display Frame")  ;  
                 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
         
        setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
    {
      
		System.exit(0);
	}
	
}
