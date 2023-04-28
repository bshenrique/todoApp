package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 * 
 * @author bshenrique
 */
public class ConnectionFactory {
    
    // Informações para conexão com o Banco de Dados
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/todoapp";
    public static final String USER = "root";
    public static final String PASS = "bS4g@10#";        
    
    public static Connection getConnection(){
        try {
            // Carregando o driver do Banco de Dados
            Class.forName(DRIVER);
            // Retornando a conexão com o Banco de Dados
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            throw new RuntimeException("There was an error connecting to the database.", e);
        }
    }
    
    public static void closeConnection(Connection connection){
        try {
            if (connection != null) connection.close();
        } catch(Exception e) {
            throw new RuntimeException("There was an error closing the connection to the database.", e);
        }
    }
    
    public static void closeConnection(Connection connection, PreparedStatement statement){
        try {
            if (connection != null) connection.close();
            if (statement != null) statement.close();
        } catch(Exception e) {
            throw new RuntimeException("There was an error closing the connection to the database.", e);
        }
    }
    
    public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet resultSet){
        try {
            if (connection != null) connection.close();
            if (statement != null) statement.close();
            if (resultSet != null) resultSet.close();
        } catch(Exception e) {
            throw new RuntimeException("There was an error closing the connection to the database.", e);
        }
    }
    
    
}
