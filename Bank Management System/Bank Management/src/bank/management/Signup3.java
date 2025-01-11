package bank.management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Signup3 extends JFrame implements ActionListener{
    int pinnumber;
     JRadioButton r1, r2, r3 , r4;
        JCheckBox c1 ,c2 , c3 , c4 , c5, c6, c7;
        JButton submit ,  cancel;
        String formno;
        
    Signup3( String formno){
        
       this.formno = formno;
        
        setLayout(null);
        
      JLabel l1 = new JLabel("Page 3 : Account Details");
      l1.setFont(new Font("Raleway" , Font.BOLD , 22));
      l1.setBounds(280,40,400,40);
      add(l1);
      
     JLabel accountType = new JLabel("Account Type: ");
      accountType.setFont(new Font("Raleway" , Font.BOLD , 22));
      accountType.setBounds(100,140,200,40);
      add(accountType);
      
      
      r1 = new JRadioButton("Saving Account");
      r1.setFont(new Font("raleways" ,Font.BOLD , 14));
      r1.setBounds(100 , 180,200,20);
      r1.setBackground(Color.WHITE);
      add(r1);
      
      r2 = new JRadioButton("Fixed Deposit Account");
      r2.setFont(new Font("raleways" ,Font.BOLD , 14));
      r2.setBounds(350 , 180,400,20);
      r2.setBackground(Color.WHITE);
      add(r2);
      
      
      r3 = new JRadioButton("Current Account");
      r3.setFont(new Font("raleways" ,Font.BOLD , 14));
      r3.setBounds(100 , 210,200,20);
      r3.setBackground(Color.WHITE);
      add(r3);
      
      
      r4 = new JRadioButton("Recurring Deposit Account");
      r4.setFont(new Font("raleways" ,Font.BOLD , 14));
      r4.setBounds(350 , 210,400,20);
      r4.setBackground(Color.WHITE);
      add(r4);
      
     
           
      
      JLabel cardNo = new JLabel("Card Number:");
      cardNo.setFont(new Font("Raleways" , Font.BOLD , 22));
      cardNo.setBounds(100 , 250 , 250 , 22);
      cardNo.setBackground(Color.WHITE);
      add(cardNo);
      
      JLabel number = new JLabel("XXXX-XXXX-XXXX-4104");
      number.setFont(new Font("Raleways" , Font.BOLD , 22));
      number.setBounds(350 , 250 , 400 , 22);
       number.setBackground(Color.WHITE);
      add(number);
      
        JLabel digit = new JLabel("Your 16 digit card number");
      digit.setFont(new Font("Raleways" , Font.BOLD , 10));
      digit.setBounds(100 , 270 , 250 , 22);
      digit.setBackground(Color.WHITE);
      add(digit);
      
      JLabel pin = new JLabel("PIN:");
     pin.setFont(new Font("Raleways" , Font.BOLD , 22));
     pin.setBounds(100,320,400,22);
     pin.setBackground(Color.WHITE);
     add(pin);
     
     
       JLabel password = new JLabel("Your 4 digit Password");
     password.setFont(new Font("Raleways" , Font.BOLD , 10));
     password.setBounds(100,340,450,22);
     password.setBackground(Color.WHITE);
     add(password);
     
     
     JLabel pnumber  = new JLabel("XXXX");
      pnumber.setFont(new Font("Raleways" , Font.BOLD , 22));
      pnumber.setBounds(350 , 320 , 400 , 22);
       pnumber.setBackground(Color.WHITE);
      add(pnumber);
     
     
     
     
     JLabel services = new JLabel("Services Required:");
     services.setFont(new Font("Raleways" , Font.BOLD , 22));
     services.setBounds(100,380,400,22);
     services.setBackground(Color.WHITE);
     add(services);
           
     
     c1 = new JCheckBox("ATM CARD");
     c1.setFont(new Font ("Raleways" , Font.BOLD , 17));
     c1.setBounds(100,410,200,22);
     c1.setBackground(Color.WHITE);
     add(c1);
     
     
     c2 = new JCheckBox("INTERNET BANKING");
     c2.setFont(new Font ("Raleways" , Font.BOLD , 17));
     c2.setBounds(350,410,400,22);
     c2.setBackground(Color.WHITE);
     add(c2);
     
     
     c3 = new JCheckBox("Mobile Banking");
     c3.setFont(new Font ("Raleways" , Font.BOLD , 17));
     c3.setBounds(100,440,200,22);
     c3.setBackground(Color.WHITE);
     add(c3);
     
     
     c4 = new JCheckBox("SMS & Email Alert");
     c4.setFont(new Font ("Raleways" , Font.BOLD , 17));
     c4.setBounds(350,440,400,22);
     c4.setBackground(Color.WHITE);
     add(c4);
           
     
     c5= new JCheckBox("Cheque Book");
     c5.setFont(new Font ("Raleways" , Font.BOLD , 17));
     c5.setBounds(100,470,200,22);
     c5.setBackground(Color.WHITE);
     add(c5);
     
     
     c6 = new JCheckBox("E-Statement");
     c6.setFont(new Font ("Raleways" , Font.BOLD , 17));
     c6.setBounds(350,470,400,22);
     c6.setBackground(Color.WHITE);
     add(c6);
     
     
     
     
     c7= new JCheckBox("I here by Declares that the above entered details are correct to the best of my knowledge.");
     c7.setFont(new Font ("Raleways" , Font.BOLD , 10));
     c7.setBounds(100,550,1000,22);
     c7.setBackground(Color.WHITE);
     add(c7);
     
     
     submit = new JButton("SUBMIT");
     submit.setFont(new Font ("Raleways" , Font.BOLD , 16));
     submit.setBounds(100,600,150,25);
     submit.setBackground(Color.BLACK);
     submit.setForeground(Color.WHITE);
     submit.addActionListener(this);
     add(submit);
             
      cancel = new JButton("CANCEL");
     cancel.setFont(new Font ("Raleways" , Font.BOLD , 16));
     cancel.setBounds(350,600,150,25);
     cancel.setBackground(Color.BLACK);
    cancel.setForeground(Color.WHITE);
    cancel.addActionListener(this);
     add(cancel);
     
     
     
     
      
      setSize(850 , 820);
      setLocation(350,0);
      setVisible(true);
      getContentPane().setBackground(Color.WHITE);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == submit){
             String accountType = null;
             if(r1.isSelected()){
                 accountType = "Saving Account ";
             }         
             else if(r2.isSelected()){
                accountType = "Fixed Deposit Account";
             }   
          
             else if(r3.isSelected()){
                 accountType = "Current Account";
             }   
                 
             else if(r4.isSelected()){
                 accountType = "Recurring Deposit Account ";
             }   
               Random random= new Random();
            String cardnumber = "" + Math.abs(random.nextLong() % 90000000L +5040936000000000L);
        pinnumber = (int)(Math.random()*10000);
        
        
String facility="";
if(c1.isSelected()){
    facility = facility+"ATM CARD";
}
else if(c2.isSelected()){
    facility = facility+"INTERNET BANKING";
}


else if(c3.isSelected()){
    facility = facility+"Mobile Banking";
}


else if(c4.isSelected()){
    facility = facility+"SMS & Email Alert";
}


else if(c5.isSelected()){
    facility = facility+"Cheque Book";
}


else if(c6.isSelected()){
    facility = facility+"E-Statement";
}

try{
   if(accountType.equals("")) 
   {
        JOptionPane.showMessageDialog(null, "Account Type is required");
   }else{
  conn c = new conn();
    String query1 = "insert into signup3 values('"+formno+"' ,'"+accountType+"','"+cardnumber+"' , '"+pinnumber+"','"+facility+"')";
     c.s.executeUpdate(query1);
 String query2= "insert into login values('"+formno+"' ,'"+cardnumber+"' , '"+pinnumber+"')";
   
       
       c.s.executeUpdate(query2);
       JOptionPane.showMessageDialog(null,"Card Number"+ cardnumber+"\n Pin: "+pinnumber);
              
       
      setVisible(false);
      new Signup3(formno).setVisible(true);
      

   }
}
catch(Exception e){
    e.printStackTrace();
    }

        
    }
        else if(ae.getSource() == cancel){
         setVisible(false);
         new Login().setVisible(true);
        }   
        
          

    }
    
    public static void main(String args[]){
       new Signup3("");
    }
}
