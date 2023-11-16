/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.g12.duque.guilherme.gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 08139
 */
public class Conexao {
    public static final String USERNAME = "root"; // Se tem um 'final' é uma constante ou seja tem o valor fixo
    public static final String PASSWORD = "usbw"; 
    public static final String DBNAME = "sistema";
    public static final String SERVER = "jdbc:mysql://localhost:3306";
    
    //Método que realiza a conexão com o banco de dados
    public static Connection getConnection(){
        Connection conn = null;
        String message = "";
        //Tratamento de exceções em java
        try{
            conn = DriverManager.getConnection(SERVER+"/"+DBNAME, USERNAME, PASSWORD);
            message = "DEU CERTO GARAIO!";
        }catch(SQLException ex){
            message = "BURRO, BURRO, MIL VEZES BURRO!";
            System.out.println(message);
            ex.printStackTrace();
        }
        System.out.println(message);
        return conn;
    }
}
