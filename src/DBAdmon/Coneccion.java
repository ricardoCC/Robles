/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAdmon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ricardo
 * 
 * Esta clase Administra la coneccion a una base de datos
 */
public class Coneccion {
    
    static String db = "sicdb";
    static String login = "root";
    static String password = "";
    static String url = "jdbc:mysql://localhost/"+db;
    
    public Connection conn = null;
    
    
    /**
     * Este método realiza la coneccion a la base de datos
     */
    public void conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, login, password);
            
            if (conn != null) {
                System.out.println("Conección a base de datos "+db+": Exitosa");
            }
        } catch (SQLException e) {
            System.out.println("Error de conneccion: " + e);
        } catch (ClassNotFoundException e){
            System.out.println(e);
        }
        
    }
    
    /**
     * Este método retorna los valor de la conneccion
     * @return  conn
     */
    public Connection getConnection(){
        return conn;
    }
    
    public void desconectar(){
        conn = null;
    }
}
