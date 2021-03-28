/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;
import java.io.*;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jana
 */
public class ReadLines {
        public static Connection conn = null;
        public static Statement stmt = null;
    public static void main(String a[]){
        ReadConfig config = new ReadConfig("C:\\Users\\Jana\\Desktop\\DIVYA AWS\\TASCconfig.txt");
        Map<String,String> TASC_Config = config.getConfig();
         System.err.println(TASC_Config.get("TASC_DB_IP"));
         System.err.println(TASC_Config.get("TASC_DB_Name"));
         System.err.println(TASC_Config.get("TASC_DB_UserName"));
         
         
    }
}
