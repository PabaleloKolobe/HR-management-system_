/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segoconss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class javaconnect {
    
    Connection con = null;
    ResultSet rs;
    PreparedStatement pst;
    
    public static Connection ConnecrDb(){
    
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\CSE18-020\\Documents\\NetBeansProjects\\SegoConss\\SegoRecruit.db");
            return con;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
            
        }
    }
}
