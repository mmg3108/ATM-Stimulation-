package bank.management;
import java.sql.*;
import javax.swing.*;
import java.awt.*;          //for image package         //also the colour class
import java.awt.event.*;        //for action listener



public class Login extends JFrame implements ActionListener{
    
    JButton login , signup , clear;//the button are golbally defined here
    JTextField cardTextField ;
    JPasswordField pinTextField;
    Login(){
        //image cannot be put in jlabel but icon can!
        setTitle("ATM");
        //icon ka kaam ho rha h yha pe
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/log.jpg"));
        
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);      //image cannot be placed directly on the frame so placed in jlable
        label.setBounds(70 ,10 , 100 , 100 ); // to set custom layout
        add(label);
       
        getContentPane().setBackground(Color.WHITE);
        
        //welcome to atm text label
        JLabel text = new JLabel ("WELCOME TO ATM");
        text.setFont(new Font("osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
        
        //cardno label this will be label number 2
        JLabel cardno = new JLabel ("CARD NO: ");
        cardno.setFont(new Font("RALEWAY",Font.BOLD,28));
        cardno.setBounds(120,150,150,30);
        add(cardno);
        
         cardTextField = new JTextField();
        cardTextField.setBounds(300 , 150 ,250 ,30 );
        cardTextField.setFont(new Font("Arial",Font.BOLD , 14));
        add(cardTextField);
        
        
        
        //pin label this will be label number 3
        JLabel pin = new JLabel ("PIN: ");
        pin.setFont(new Font("RALEWAY",Font.BOLD,28));
        pin.setBounds(120,220,250,30);
        add(pin);
            
        pinTextField = new JPasswordField();
        pinTextField.setBounds( 300 , 220 ,250 ,30 );
       pinTextField.setFont(new Font("Arial",Font.BOLD , 14));
        add(pinTextField);
        
        
        //to add signin button
        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        
        
        //to add clear button
         clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        
        
        //to add signup button
         signup = new JButton("SIGNUP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        
        
        //this is also about the icon
        setSize(800, 480);
        setVisible(true);
        
        setLocation(350,200);
    }
    //override notation for the action listener 
    public void actionPerformed(ActionEvent ae){
        //wht will happen after we click into the button 
        //the performance will take place in action listner
            // ae actionevent class ka obj h
            
            if(ae.getSource() == clear){
                cardTextField.setText("");
                pinTextField.setText("");
            }
            else if (ae.getSource() == login){
                conn conn = new conn();
                String cardnumber = cardTextField.getText();
                String pinnumber = pinTextField.getText();
                String query = "select * from login where cardnumber ='"+cardnumber+"' and pin = '"+pinnumber +"'";
           try{
            ResultSet rs =  conn.s.executeQuery(query);
            if(rs.next()){
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                
            }
            else{
                JOptionPane.showMessageDialog(null,"incorrect cardnumber or pin!");
            }
           }catch(Exception e){
               System.out.println(e);
           }
            
            }
            else if(ae.getSource() == signup){
                setVisible(false);
                new SignupOne().setVisible(true);
            }
    }
    public static void main(String args[]){
    new Login();   
    }
}
