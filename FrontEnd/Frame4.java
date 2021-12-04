package FrontEnd;
//package Frontend;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 
class DisplayFrame extends JFrame implements ActionListener{
    
	JButton b1;
	JLabel l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	JTextField t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;

	DisplayFrame()
	{
             JLabel background;
		
		setSize(700,700);
		
		ImageIcon img = new ImageIcon("notepad.png");
      background = new JLabel("",img,JLabel.CENTER);
      background.setBounds(0,0,700,700);
      add(background);
		this.setLayout(null);

		l2 = new JLabel("Total students :");
		t2 = new JTextField(20);
		t2.setText("64");
		t2.setEditable(false);

		l3 = new JLabel("Frequently:");
		t3 = new JTextField(20);
		t3.setText("40");
		t3.setEditable(false);

		l4 = new JLabel("Sometimes:");
		t4 = new JTextField(20);
		t4.setText("18");
		t4.setEditable(false);

		l5 = new JLabel("Rarely:");
		t5 = new JTextField(20);
		t5.setText("6");
		t5.setEditable(false);

		l6 = new JLabel("Frequently:");
		t6 = new JTextField(20);
		t6.setText("37");
		t6.setEditable(false);

		l7 = new JLabel("Sometimes:");
		t7 = new JTextField(24);
		t7.setText("21");
		t7.setEditable(false);

		l8 = new JLabel("Rarely:");
		t8 = new JTextField(3);
		t8.setText("5");
		t8.setEditable(false);

                l9 = new JLabel("Frequently:");
		t9 = new JTextField(20);
		t9.setText("47");
		t9.setEditable(false);

                 t10=new JTextField(50);
		t11=new JTextField(50);
                t12=new JTextField(40);
                t13=new JTextField(70);
                t13.setText("No suggestions.");
		t13.setEditable(false);
		l10=new JLabel("Was the instructor well prepared for the class?");
                l11=new JLabel("Did the instructor show interest in helping the students learn?");
                l12=new JLabel("Did the instructor provided you with assignments,were they helpful?");   
                l13=new JLabel("Any suggestions?");

		l14 = new JLabel("Sometimes:");
		t14= new JTextField(20);
		t14.setText("16");
		t14.setEditable(false);

		l15 = new JLabel("Rarely:");
		t15 = new JTextField(20);
		t15.setText("1");
		t15.setEditable(false);

		b1 = new JButton("Back");
               
                Font myFont = new Font("Serif",Font.PLAIN,20);
        l2.setFont(myFont);l3.setFont(myFont);l4.setFont(myFont);l5.setFont(myFont);
l6.setFont(myFont);l7.setFont(myFont);l8.setFont(myFont);l9.setFont(myFont);l10.setFont(myFont);
		  l11.setFont(myFont);l12.setFont(myFont);l13.setFont(myFont);l14.setFont(myFont);l15.setFont(myFont);

		l2.setBounds(50,100,130,40);
		t2.setBounds(180,110,30,20);

		l10.setBounds(50,150,600,40);
                l3.setBounds(50,200,90,40);
		t3.setBounds(140,210,30,20);
		l4.setBounds(170,200,100,40);
		t4.setBounds(270,210,30,20);
                l5.setBounds(300,200,70,40);
		t5.setBounds(370,210,30,20);

                l11.setBounds(50,250,600,40);
                l6.setBounds(50,300,90,40);
		t6.setBounds(140,310,30,20);
		l7.setBounds(170,300,100,40);
		t7.setBounds(270,310,30,20);
                l8.setBounds(300,300,70,40);
		t8.setBounds(370,310,30,20); 

                l12.setBounds(50,350,600,40);
                l9.setBounds(50,400,90,40);
		t9.setBounds(140,410,30,20);
		l14.setBounds(170,400,100,40);
		t14.setBounds(270,410,30,20);
                l15.setBounds(300,400,70,40);
		t15.setBounds(370,410,30,20);

		l13.setBounds(50,450,300,40);
                 t13.setBounds(50,500,400,70);
		 b1.setBounds(500,600,80,40);
                b1.setBackground(Color.white);

                 

                background.add(l2);
		background.add(t2);
		background.add(l10);
                background.add(l3);
                background.add(t3);
		background.add(l4);
                background.add(t4);
                background.add(l5);
		background.add(t5);
                background.add(l11);
		background.add(l6);
		background.add(t6);
                background.add(l7);
                background.add(t7);
		background.add(l8);
                background.add(t8);
                background.add(l12);
		background.add(l9);
                background.add(t9);
		background.add(l14);
                background.add(t14);
                background.add(l15);
                background.add(t15);
		background.add(l13);
                background.add(t13);
                background.add(b1);
                
		b1.addActionListener(this);
                setTitle("Display Frame")  ;  
                 
setDefaultCloseOperation(EXIT_ON_CLOSE);
         

        setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
   {
      
			dispose();
		}
	
}
