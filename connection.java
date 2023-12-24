
import java.sql.*;

public class connection {
    Connection c;
    Statement s;
    public connection()
    {
        try{
            //load the driver
                Class.forName("com.mysql.jdbc.Driver");
            //creating a connction
                c=DriverManager.getConnection("jdbc:mysql://localhost:3306/umsdb");
                String username="root";
                String password="saurav";

                s=c.createStatement();
        }
        catch(ClassNotFoundException | SQLException e){
                System.out.println(e);
        }
    }
    public static void main(String [] args)
    {
        connection conn=new connection();
        System.out.println("Connection Succeed");
        
    }
}
