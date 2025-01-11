package bank.management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Signup2 extends JFrame implements ActionListener {
  
     JTextField relTextField ,catTextField ,incTextField ,educational_qualificationTextField , occuTextField , pan_numberTextField , adhaar_numberTextField;
    JButton next;
    JRadioButton yes , no;
       JComboBox category , religion ,  income ,  job , education;
   String formno;
       
    
    Signup2(String formno){        // same name of the class of constructor
        this.formno = formno;
        setLayout(null);    
        
      
          
      setTitle("NEW ACCOUNT APPLICATION FORM PAGE 2");
            
        //PERSONAL DETAILS
         JLabel PersonDetails = new JLabel("Page 2 : Additional Details");
        PersonDetails.setFont(new Font("Raleway", Font.BOLD , 22));
        PersonDetails.setBounds(200,60,600,40);    //WORKS WHEN SETLAYOUT IS NULL!
        add(PersonDetails);        
        
        
        //religion
       
         JLabel rel= new JLabel("Religion: ");
        rel.setFont(new Font("Raleway", Font.BOLD , 22));
        rel.setBounds(100,140,150,30);    //WORKS WHEN SETLAYOUT IS NULL!
        add(rel);
        
        String valreligion[] = {"Hindu" , "Muslim" ,"Sikh","Christian", "others"};
       religion = new JComboBox(valreligion);
         religion.setBounds(300 , 140 , 400 , 30);
       religion.setBackground(Color.WHITE);
         add(religion);
        
        
      relTextField = new JTextField();
        relTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        relTextField.setBounds(300,140,400,30);
        add(relTextField);
        
        
        
        //category 
        JLabel cat= new JLabel("Category: ");
        cat.setFont(new Font("Raleway", Font.BOLD , 22));
        cat.setBounds(100,180,200,30);    //WORKS WHEN SETLAYOUT IS NULL!
        add(cat);
        
         String valcategory[] = {"General" , "OBC" ,"SC","ST", "others"};
        category = new JComboBox(valcategory);
        category.setBackground(Color.WHITE);
        category.setBounds(300 , 180 , 400 , 30);
         add(category);
        
        catTextField = new JTextField();
        catTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        catTextField.setBounds(300,180,400,30);
        add(catTextField);
        
       
        
        //income
        JLabel inc= new JLabel("Income: ");
        inc.setFont(new Font("Raleway", Font.BOLD , 22));
        inc.setBounds(100,220,200,30);    //WORKS WHEN SETLAYOUT IS NULL!
        add(inc);
        
        
        String valincome[] = {"NULL" , "<1,50,000" ,"<2,50,000","<5,00,000", "<10,00,000"};
         income = new JComboBox(valincome);
        income.setBackground(Color.WHITE);
        income.setBounds(300 , 220 , 400 , 30);
         add(income);
        
            
        
         incTextField = new JTextField();
        incTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        incTextField.setBounds(300,220,400,30);
        add(incTextField);
        
       
        
        //educational qualification
        JLabel educational_qualification= new JLabel("Qualification: ");
        educational_qualification.setFont(new Font("Raleway", Font.BOLD , 22));
        educational_qualification.setBounds(100,260,250,30);    //WORKS WHEN SETLAYOUT IS NULL!
        add(educational_qualification);
        
       String valeducation[] = {"GRADUATE" , "NON-GRADUATE" ,"POST-GRADUATE","DOCTOR","OTHERS"};
         education = new JComboBox(valeducation);
        education.setBackground(Color.WHITE);
        education.setBounds(300 , 260 , 400 , 30);
         add(education);
        
        
         educational_qualificationTextField = new JTextField();
        educational_qualificationTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        educational_qualificationTextField.setBounds(300,260,400,30);
        add(educational_qualificationTextField);  
        
     
        
        //occupatation
        JLabel occu= new JLabel("Occupatation: ");
        occu.setFont(new Font("Raleway", Font.BOLD , 22));
        occu.setBounds(100,300,200,30);    //WORKS WHEN SETLAYOUT IS NULL!
        add(occu);
        
         String valjob[] = {"SALARRIED" , "SELF EMPLOYED" ,"BUSSINESS","RETIRED","STUDENT","OTHER"};
         job = new JComboBox(valjob);
        job.setBackground(Color.WHITE);
        job.setBounds(300 , 300 , 400 , 30);
         add(job);
        

        
        occuTextField = new JTextField();
        occuTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        occuTextField.setBounds(300,300,400,30);
        add(occuTextField);  
        
       
        
        
        //pan number
        JLabel pan_number= new JLabel("Pan Number: ");
        pan_number.setFont(new Font("Raleway", Font.BOLD , 22));
        pan_number.setBounds(100,340,200,30);    //WORKS WHEN SETLAYOUT IS NULL!
        add(pan_number);
        
        
       pan_numberTextField = new JTextField();
        pan_numberTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        pan_numberTextField.setBounds(300,340,400,30);
        add(pan_numberTextField); 

        
        //Adhaar Number
        
        JLabel adhaar_number= new JLabel("Adhaar Number: ");
       adhaar_number.setFont(new Font("Raleway", Font.BOLD , 22));
        adhaar_number.setBounds(100,380,250,30);    //WORKS WHEN SETLAYOUT IS NULL!
        add(adhaar_number);
        
          adhaar_numberTextField = new JTextField();
        adhaar_numberTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        adhaar_numberTextField.setBounds(300,380,400,30);
        add(adhaar_numberTextField); 
        
        
        //senior_citizen
         JLabel senior_citizen= new JLabel("Senior Citizen: ");
        senior_citizen.setFont(new Font("Raleway", Font.BOLD , 22));
        senior_citizen.setBounds(100,420,200,30);    //WORKS WHEN SETLAYOUT IS NULL!
        add(senior_citizen);
        
        yes = new JRadioButton("yes");
        yes.setBounds(300,420,60,30);
        yes.setBackground(Color.WHITE);
        add(yes);
        
        no = new JRadioButton("no");
        no.setBounds(450,420,100,30);
        no.setBackground(Color.WHITE);
        add(no);
       
        
        
        //existing_acc
         JLabel existing_acc= new JLabel("Existing Account: ");
        existing_acc.setFont(new Font("Raleway", Font.BOLD , 22));
       existing_acc.setBounds(100,460,200,30);    //WORKS WHEN SETLAYOUT IS NULL!
        add(existing_acc);
        
       
        yes = new JRadioButton("yes");
        yes.setBounds(300,460,60,30);
        yes.setBackground(Color.WHITE);
        add(yes);
        
        no = new JRadioButton("no");
        no.setBounds(450,460,100,30);
        no.setBackground(Color.WHITE);
        add(no);
             
        
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
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
    String sincome= (String) income.getSelectedItem();
    String seducation = (String) education.getSelectedItem();
String soccupation = (String) job.getSelectedItem();
    String span = pan_numberTextField.getText();
    String sadhaar = adhaar_numberTextField.getText();

    
    String senior_citizen = null;
    if (yes.isSelected()) {
        senior_citizen = "yes";
    } else if (no.isSelected()) {
        senior_citizen= "no";
    }
    
    String existing_acc = null;
    if (yes.isSelected()) {
        existing_acc = "yes";
    } else if (no.isSelected()) {
        existing_acc= "no";
    }
    
    
    
    
    
    try {
    if (sreligion.equals("")) {
        JOptionPane.showMessageDialog(null, "Religion is required");
    } else {
        conn c = new conn();
        String query = "INSERT INTO signup2 VALUES ('"+formno+"','" + sreligion + "','" + scategory + "','" + sincome + "','"
                + seducation + "','" + soccupation + "','" + span + "','" + sadhaar + "','" + senior_citizen + "','"
                + existing_acc+ "')"; // Added missing fields in the query
        int rowsAffected = c.s.executeUpdate(query);
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Data inserted successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to insert data!");
        }
    }
    
    //signup3
     setVisible(false);
        new Signup3(formno).setVisible(true);
    
    
} catch (Exception e) {
    e.printStackTrace();
}
    }
 
public static void main(String args[]) {
        new Signup2("");
    }
}
