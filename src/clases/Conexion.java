/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sergio
 */
public class Conexion {
      public static Connection conectar(){
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_administrador", "root", "" );
            return cn;
        }
        catch (SQLException e){
            System.out.println("Error en la conexion local" + e);
        }
        return (null);
    }
}
