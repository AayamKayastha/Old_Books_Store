
package com.hpes_rcpl_project;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
static Connection con;
    static
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hpes_project", "root","aayam1");
            if(con!=null)
                System.out.print("connection ok");
            else
                System.out.print("Connection not ok");
        }
        catch(Exception e)
        {
            System.out.print(e.getMessage());
        }
    }
    public static Connection getConnection()
    {
        return con;
    }    
}
