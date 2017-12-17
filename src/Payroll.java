import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.net.URI;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrutu_E
 */
public class Payroll {
 Connection conn=null;
 
       public static Connection connecrDB()
    {
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:payroll.sqlite");
            
           return conn;    
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        
        }
    }
       public static void main(String args[]) throws Exception{
           Desktop x=Desktop.getDesktop();
           x.browse(new URI("https://inforway.wordpress.com/"));
           
       }
}
    
    
    

