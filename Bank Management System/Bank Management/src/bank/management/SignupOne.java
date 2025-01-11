package bank.management;
import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignupOne extends JFrame implements ActionListener{
    
    int Random;
    JTextField NameTextField , fnameTextField, EmailTextField, AddressTextField , StateTextField , CityTextField , pincodeTextField; 
    JButton next;
    JRadioButton male , female , single , married , divorced;
    JDateChooser datechooser;
    
    
    SignupOne(){        // same name of the class of constructor
        
        setLayout(null);
        
       
        Random = (int)(Math.random()*10000);
          
        
        
        //FOR THE APLLICATION FORM  NUMBER!
        JLabel formno = new JLabel("APPLICATION FORM NO."+Random);
        formno.setFont(new Font("Raleway", Font.BOLD , 38));
        formno.setBounds(200,20,600,40);    //WORKS WHEN SETLAYOUT IS NULL!
        add(formno);
        
        
        
        //PERSONAL DETAILS
         JLabel PersonDetails = new JLabel("Page 1 : Personal Details");
        PersonDetails.setFont(new Font("Raleway", Font.BOLD , 22));
        PersonDetails.setBounds(290,80,270,30);    //WORKS WHEN SETLAYOUT IS NULL!
        add(PersonDetails);
        
        
        //name
        //PERSONAL DETAILS
         JLabel Name= new JLabel("Name: ");
        Name.setFont(new Font("Raleway", Font.BOLD , 22));
        Name.setBounds(100,140,100,30);    //WORKS WHEN SETLAYOUT IS NULL!
        add(Name);
        
        
        NameTextField = new JTextField();
        NameTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        NameTextField.setBounds(300,140,400,30);
        add(NameTextField);
        
        
        //fathers name
        JLabel fname= new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway", Font.BOLD , 22));
        fname.setBounds(100,180,200,30);    //WORKS WHEN SETLAYOUT IS NULL!
        add(fname);
        
        
         fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        fnameTextField.setBounds(300,180,400,30);
        add(fnameTextField);
       
        
        //DATE OF BIRTH
        JLabel dob= new JLabel("D.O.B: ");
        dob.setFont(new Font("Raleway", Font.BOLD , 22));
        dob.setBounds(100,220,80,30);    //WORKS WHEN SETLAYOUT IS NULL!
        add(dob);
        
        
         datechooser = new JDateChooser();
        datechooser.setBounds(300,220,400,30);
        datechooser.setForeground(new Color(105 , 105 , 105));
        add(datechooser);
        
        //Gender
        JLabel gender= new JLabel("Gender: ");
        gender.setFont(new Font("Raleway", Font.BOLD , 22));
        gender.setBounds(100,260,110,30);    //WORKS WHEN SETLAYOUT IS NULL!
        add(gender);
        
         male = new JRadioButton("Male");
        male.setBounds(300,260,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450,260,100,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        
        //email adress
        JLabel Email= new JLabel("Email: ");
        Email.setFont(new Font("Raleway", Font.BOLD , 22));
        Email.setBounds(100,300,80,30);    //WORKS WHEN SETLAYOUT IS NULL!
        add(Email);
        
        
        EmailTextField = new JTextField();
       EmailTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        EmailTextField.setBounds(300,300,400,30);
        add(EmailTextField);
        
        
        //marial status
        JLabel Mstatus= new JLabel("Marital Status: ");
        Mstatus.setFont(new Font("Raleway", Font.BOLD , 22));
        Mstatus.setBounds(100,340,200,30);    //WORKS WHEN SETLAYOUT IS NULL!
        add(Mstatus);
        
        
         single = new JRadioButton("Single");
        single.setBounds(300, 340,80 , 30);
        single.setBackground(Color.WHITE);
        add(single);
        
        
         married = new JRadioButton("Married");
        married.setBounds(380, 340,80 , 30);
        married.setBackground(Color.WHITE);
        add(married);
        
        
        
         divorced = new JRadioButton("Divorced");
        divorced.setBounds(460, 340,80 , 30);
        divorced.setBackground(Color.WHITE);
        add(divorced);

        
        //Address
        
        JLabel Address= new JLabel("Address: ");
        Address.setFont(new Font("Raleway", Font.BOLD , 22));
        Address.setBounds(100,380,150,30);    //WORKS WHEN SETLAYOUT IS NULL!
        add(Address);
        
        
         AddressTextField = new JTextField();
        AddressTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        AddressTextField.setBounds(300,380,400,30);
        add(AddressTextField);
        
        
        //city
         JLabel City= new JLabel("City: ");
        City.setFont(new Font("Raleway", Font.BOLD , 22));
        City.setBounds(100,420,100,30);    //WORKS WHEN SETLAYOUT IS NULL!
        add(City);
        
        
        CityTextField = new JTextField();
        CityTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        CityTextField.setBounds(300,420,400,30);
        add(CityTextField);
        
        
        
        //state
         JLabel State= new JLabel("State: ");
        State.setFont(new Font("Raleway", Font.BOLD , 22));
       State.setBounds(100,460,120,30);    //WORKS WHEN SETLAYOUT IS NULL!
        add(State);
        
        StateTextField = new JTextField();
        StateTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        StateTextField.setBounds(300,460,400,30);
        add(StateTextField);
        
        //pincode
         JLabel pincode= new JLabel("Pincode: ");
        pincode.setFont(new Font("Raleway", Font.BOLD , 22));
        pincode.setBounds(100,500,150,30);    //WORKS WHEN SETLAYOUT IS NULL!
        add(pincode);
        
         pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        pincodeTextField.setBounds(300,500,400,30);
        add(pincodeTextField);
        
        
        
         next = new JButton("next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(670,560,100,40);
        next.setFont(new Font ("Raleway" , Font.BOLD , 14));
        next.addActionListener(this);
        add(next);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850 , 800);
        setLocation(350,10);
        setVisible(true);

        
    }
    
    public void actionPerformed(ActionEvent ae) {
    String formno = "" + Random;
    String Name = NameTextField.getText();
    String fname = fnameTextField.getText();
    String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
    String gender = null;
    if (male.isSelected()) {
        gender = "Male";
    } else if (female.isSelected()) {
        gender = "Female";
    }
    String Email = EmailTextField.getText();
    String Mstatus = null;
    if (single.isSelected()) {
        Mstatus = "Single";
    } else if (married.isSelected()) {
        Mstatus = "Married";
    } else if (divorced.isSelected()) {
        Mstatus = "Divorced";
    }
    String Address = AddressTextField.getText();
    String City = CityTextField.getText();
    String State = StateTextField.getText();
    String pincode = pincodeTextField.getText();

    try {
        if (Name.equals("")) {
            JOptionPane.showMessageDialog(null, "Name is required");
        } else if (Email.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter email address");
        } else {
            conn c = new conn();
            String query = "insert into signup values ('" + formno + "','" + Name + "','" + fname + "','" + dob + "','" + gender + "','" + Email + "','" + Mstatus + "','" + Address + "','" + City + "','" + State + "','" + pincode + "')";
            int rowsAffected = c.s.executeUpdate(query);
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Data inserted successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to insert data!");
            }
            setVisible(false);
            new Signup2(formno).setVisible(true);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    
    
    
    
    public static void main(String args[]){
    new SignupOne();
}
}
