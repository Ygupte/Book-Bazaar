/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookshop;
import java.sql.*;
/**
 *
 * @author manish
 */
public class DBConnection {
   static Connection con;
    public static Connection connect() 
            {
    try{
        Class.forName("com.mysql.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_store","root","");
        
       }catch(Exception e){
        System.out.println(e);
    }
        return con;
    }
  }
