import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class FeedBack extends JFrame implements ActionListener {
	String pname;
	JButton b1,b2;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4;
	JRadioButton checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6,checkBox7,checkBox8,checkBox9;

	FeedBack(String pname)
	{
		this.pname = pname;
                 setTitle("FeedBack Form");
		JLabel background;
		
		setSize(750,750);
		
		ImageIcon img = new ImageIcon("p3.png");
      background = new JLabel("",img,JLabel.CENTER);
      background.setBounds(0,0,750,750);
      add(background);


        l1 = new JLabel("Prof Name:");
		t1 = new JTextField(70);
		t1.setText(pname);
		t1.setEditable(false);

		b1 = new JButton("Back");
		b2 = new JButton("Submit");

        t2=new JTextField(50);
		t3=new JTextField(50);
        t4=new JTextField(200);

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

		checkBox1 = new JRadioButton("Frequently", false);    
        checkBox1.setBounds(50,200,100,40);
    
        checkBox2 = new JRadioButton("Sometimes", false);    
        checkBox2.setBounds(150,200,110,40); 

        checkBox3 = new JRadioButton("Rarely", false);    
        checkBox3.setBounds(260,200,100,40);

        ButtonGroup group1 = new ButtonGroup();
        group1.add(checkBox1);
        group1.add(checkBox2); 
        group1.add(checkBox3);

        checkBox4 = new JRadioButton("Frequently", false);    
        checkBox4.setBounds(50,300,100,40);  
  
        checkBox5 = new JRadioButton("Sometimes", false);    
        checkBox5.setBounds(150,300,110,40); 

        checkBox6 = new JRadioButton("Rarely", false);    
        checkBox6.setBounds(260,300,100,40);

        ButtonGroup group2 = new ButtonGroup();
        group2.add(checkBox4);
        group2.add(checkBox5); 
        group2.add(checkBox6);

        checkBox7 = new JRadioButton("Frequently", false);    
        checkBox7.setBounds(50,400,100,40);  
  
        checkBox8 = new JRadioButton("Sometimes", false);    
        checkBox8.setBounds(150,400,110,40);
 
        checkBox9 = new JRadioButton("Rarely", false);    
        checkBox9.setBounds(260,400,100,40);

        ButtonGroup group3 = new ButtonGroup();
        group3.add(checkBox7);
        group3.add(checkBox8); 
        group3.add(checkBox9);

        background.add(checkBox1);
        background.add(checkBox2);
        background.add(checkBox3);
        background.add(checkBox4);
        background.add(checkBox5);
        background.add(checkBox6);
        background.add(checkBox7);
        background.add(checkBox8);
        background.add(checkBox9);

        b2.addActionListener(this);
		b1.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
         

        setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
   {
      
			dispose();
		}
	
}