import java.awt.Graphics;
import java.awt.Image;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Arrays;

public class Frame1 extends JFrame implements ActionListener{

   JButton b1,b2;
   JLabel l1,l2;
   JTextField t1;
   JPasswordField p1;
   JRadioButton checkBox1,checkBox2;
   
   Frame1()
   {
      JLabel background;
      setSize(700,700);
      setLayout(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      ImageIcon img = new ImageIcon("icon.png");
      background = new JLabel("",img,JLabel.CENTER);
      background.setBounds(0,0,700,700);
      add(background);

      l1 = new JLabel("Login Id:");
      t1 = new JTextField(25);
      l2 = new JLabel("Password:");
      p1 = new JPasswordField();
     

      l1.setBounds(250,200,100,30);
      l2.setBounds(250,250,100,30);
     
      t1.setBounds(350,200,100,30);
      p1.setBounds(350,250,100,30);

      Font myFont = new Font("Serif",Font.BOLD,16);
     l1.setFont(myFont);l2.setFont(myFont);

     b1 = new JButton("Login");
      b2 = new JButton("Close");
      

     
      b1.setBounds(570,500,70,40);
      b2.setBounds(570,550,70,40);
      b1.setBackground(Color.white);
      b2.setBackground(Color.white);

      b1.addActionListener(this);
      b2.addActionListener(this);
    


       checkBox1 = new JRadioButton("Student", false);    
        checkBox1.setBounds(250,150, 100,50);    
       checkBox2 = new JRadioButton("Professor",false);    
        checkBox2.setBounds(350,150,100,50);    
        

        ButtonGroup group = new ButtonGroup();
      group.add(checkBox1);
      group.add(checkBox2);

      background.add(l1);
      background.add(t1);
      background.add(l2);
      background.add(p1);
      background.add(b1);
      background.add(b2);
      background.add(checkBox1);
      background.add(checkBox2);
      setTitle("Login Frame");
     
   
      setVisible(true);
   }

   public void actionPerformed(ActionEvent ae)
   {
      char[] passValue = p1.getPassword(); 
      char[] correctPass = new char[] {'a', 'b', 'c', 'd', 'e', 'f'};
      char[] correctPass2 = new char[] {'1', '2', '3', '4', '5', '6'};
        String sid = t1.getText();
       
      if(ae.getSource()==b2)
      {
         System.exit(0);
      }
      if(ae.getSource()==b1 && Arrays.equals(passValue, correctPass))
      {
      SecondFrame s =  new SecondFrame(sid);
      }
      else if(ae.getSource()==b1 && Arrays.equals(passValue, correctPass2))
      {
      DisplayFrame p =  new DisplayFrame();
      }
      else {
                JOptionPane.showMessageDialog(this, "Invalid Password");
            }
   }
   
   public static void main(String[] args){
      new Frame1();
   }
}