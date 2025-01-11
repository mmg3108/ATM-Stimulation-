package bank.management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Pinchange extends JFrame implements ActionListener {
    
    
    JTextField repin , pin;
    JButton back , change;
       String pinnumber;     
    
    Pinchange(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(0,0,900,900);
    add(image);
    
    JLabel text = new JLabel("CHANGE YOUR PIN");
    text.setForeground(Color.WHITE);
    text.setBackground(Color.black);
    text.setFont(new Font("System" , Font.BOLD , 22));
    text.setBounds(250,280,500,35);
    image.add(text);
    
    JLabel pintext = new JLabel("New PIN:");
    pintext.setForeground(Color.WHITE);
    pintext.setBackground(Color.black);
    pintext.setBounds(165,320,180,25);
    image.add(pintext);
    
    pin = new JTextField();
    pin.setFont(new Font("raleways" , Font.BOLD , 25));
    pin.setBounds(330, 320 , 180 , 25);
     pin.setBackground(Color.white);
    image.add(pin);
    
    

JLabel repintext = new JLabel("Re-enter your PIN: ");
    repintext.setForeground(Color.WHITE);
    repintext.setBackground(Color.white);
    repintext.setBounds(165,360,180,25);
    image.add(repintext);
   
   
     repin = new JTextField();
    repin.setFont(new Font("raleways" , Font.BOLD , 25));
    repin.setBounds(330, 360 , 180 , 25);
    repin.setBackground(Color.white);
    image.add(repin);
    
   change = new JButton("CHANGE");
    change.addActionListener(this);
    change.setBounds(355 , 485 , 150 , 30);
    image.add(change);
    
    
    
    back = new JButton("BACK");
    back.addActionListener(this);
    back.setBounds(355 , 520 , 150 , 30);
    image.add(back);
    
    
    
    
    
    
     setSize(900,900);
    setLocation(300,0);
    setVisible(true);
    
        
    
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == change){
            
        
        try{
           String npin = pin.getText();
           String rpin = repin.getText();
        
                   if(!npin.equals(rpin)){
                       JOptionPane.showMessageDialog(null,"Entered PIN doent match" );
                   return;
                   }
                   
                   if(npin.equals("")){
                       JOptionPane.showMessageDialog(null,"Enter the PIN" );
                   return;
                   }
                   
                   if(rpin.equals("")){
                       JOptionPane.showMessageDialog(null,"Re-enter the PIN" );
                   return;
                   }
                 conn c = new conn();
                 String query1 = "update bank set pin ='"+rpin+"' where pin = '"+pinnumber+"'";
                 String query2 = "update login set pin ='"+rpin+"' where pin = '"+pinnumber+"'";
                 String query3 = "update signup3 set pin ='"+rpin+"' where pin = '"+pinnumber+"'";

                 c.s.executeUpdate(query1);
                 c.s.executeUpdate(query2);
                 c.s.executeUpdate(query3);
        
                 JOptionPane.showMessageDialog(null,"PIN is updated Successfully");
                 
                 
                 setVisible(false);
                 new Transactions(npin).setVisible(true);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
         else{
    setVisible(false);
    new Transactions(pinnumber).setVisible(true);
    }
       }
    
public static void main(String args[]){
    
    new Pinchange("").setVisible(true);
    
       }    
}
