/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// 29/08 - Parei no video 11B
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author renat
 */
public class ConnectionFactory {
    
    public static final String DRIVE = "com.mysql.jdbc.Drive";
    public static final String URL = "jdbc:mysql://localhost:3306/todoapp";
    public static final String USER = "root";
    public static final String PASS = "";
    
    public static Connection getConnection () {
    try {
        
        Class.forName(DRIVE);
        return DriverManager.getConnection(URL, USER, PASS);
    }  catch (Exception ex) {
        throw new RuntimeException ("Erro na conexão com o banco de dados", ex);
        
    }
 } 
    
    public static void closeConnection (Connection connection) throws SQLException {
    try {
        if(connection != null){
            connection.close();
        }       
       
    } catch (SQLException ex){
        throw new RuntimeException("Erro ao fechar a conexão com o banco de dados");
    }        
    }
            
    
}
