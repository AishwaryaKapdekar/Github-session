package com.simple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/myapp";
        String username = "root";
        String password = "Bhushan@97";
        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM myapp");
        
        while(rs.next()) {
        	System.out.println(rs.getInt("ID")+" " +
        						rs.getString("name")+" "+
        						rs.getInt("time")+" "+
        						rs.getString("task")+" "+
        						rs.getString("doneornot"));
        }
        
    }
}
