/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.webwsdl.Model;
import java.sql.*;
/**
 *
 * @author brian-kamau
 */
public abstract class Base {
    public static String dbUsername ="root";
    public static String dbPassword = "wamatu";
    public static String dbUrl ="jdbc:mysql://localhost:3306/WebClient";
    public static String driver = "com.mysql.cj.Driver";
    protected Statement stat = null;
    protected PreparedStatement pst = null;
    protected Connection conn= null;
    protected ResultSet rst = null;
    
    
    
    public final boolean getConnection() throws SQLException,ClassNotFoundException{
        Class.forName(driver);
        conn=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
        
        
        return true;
    }
    
    
    
    
    
}
