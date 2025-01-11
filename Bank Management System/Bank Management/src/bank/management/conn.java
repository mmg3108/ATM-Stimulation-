package bank.management;
import java.sql.*;          //import sql library
public class conn {
   /*
    5 STEPS OF JDBC CONNECTIVITY
    
    1)register the driver
    2)create connection
    3)create statement
    4)execute query
    5)close connection


*/
    
    /*
    mysql is an extrenal entity therfore 
    there are various chances of getting error
    errors at the run time
    
    */
    
    Connection c;
    Statement s;
    //first we made the constructor
    public conn(){
        try{
            //register the driver
            //class in the name of class 
            //and forname is an static method
            //com.mysql.cj.jdbc.Driver == driver name
         
                 
        // *****   Class.forName(com.mysql.cj.jdbc.Driver);
            
        //^now we dont need the above library as we have already created the path for the jdbc driver
        
        
            //now we will create the connection
            //url is the connection string 
            
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem" , "root" , "abcd");
            
            
            
            // create satement
            s = c.createStatement();
            
            //now add the library 
            
            
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}


