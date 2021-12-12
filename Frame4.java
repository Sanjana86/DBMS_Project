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
 
class DisplayFrame extends JFrame implements ActionListener{
    
	JButton b1;
	JLabel l10,l11,l12,l13,l1,l2,l3;
	JTextField t10,t11,t12,t13;

	DisplayFrame()
	{
             JLabel background;
		
		setSize(700,700);
		
		BufferedImage img = null;
		 try{
		 img =  ImageIO.read(getClass().getResource("notepad.png"));}
		 catch(IOException ex)
		 {}
		 background = new JLabel(new ImageIcon(img));
      background.setBounds(0,0,700,700);
      add(background);
		this.setLayout(null);

		

		l1 = new JLabel("Avg rating score :");
		l2 = new JLabel("Avg rating score :");
		l3 = new JLabel("Avg rating score :");

     t10=new JTextField(50);
		t11=new JTextField(50);
    t12=new JTextField(40);
     t13=new JTextField(70);


		l10=new JLabel("Was the instructor well prepared for the class?");
                l11=new JLabel("Did the instructor show interest in helping the students learn?");
                l12=new JLabel("Did the instructor provided you with assignments,were they helpful?");   
                l13=new JLabel("Any suggestions?");


		b1 = new JButton("Back");
               
                Font myFont = new Font("Serif",Font.PLAIN,20);
				l1.setFont(myFont);l2.setFont(myFont);l3.setFont(myFont);l10.setFont(myFont);l11.setFont(myFont);l12.setFont(myFont);l13.setFont(myFont);


		l10.setBounds(50,100,600,40);
         l1.setBounds(50,150,150,40);
		t10.setBounds(205,155,40,30);

        l11.setBounds(50,200,600,40);
         l2.setBounds(50,250,150,40);
		t11.setBounds(205,255,40,30);
         l12.setBounds(50,300,600,40);
         l3.setBounds(50,350,150,40);
		t12.setBounds(205,355,40,30);

		l13.setBounds(50,400,300,40);
                 t13.setBounds(50,450,400,70);
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
