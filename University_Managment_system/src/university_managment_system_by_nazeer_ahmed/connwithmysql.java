package university_managment_system_by_nazeer_ahmed;
import java.sql.*;
import javax.swing.*;
public class connwithmysql 
{
    Connection con;
    Statement stmt;
    ResultSet rs;
    public connwithmysql()
    {
        try
        {
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni_database_nazeer","root","");
            stmt = con.createStatement();
        }
        catch(Exception ex)
        {
           JOptionPane.showMessageDialog(this,ex.getMessage());
        }
    }
    
}
