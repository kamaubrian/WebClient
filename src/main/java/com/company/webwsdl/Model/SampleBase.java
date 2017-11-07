/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.webwsdl.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author brian-kamau
 */
public abstract class SampleBase {
    public static String dbUsername =""; //Username for Mysql
    public static String dbPassword = ""; // Password for Mysql
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
