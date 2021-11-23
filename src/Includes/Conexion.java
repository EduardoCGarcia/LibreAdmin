/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Includes;

import Utilerias.Mostrar;
import java.sql.DriverManager;
import java.sql.Connection;

public class Conexion {

    public Connection cn = null;

    public Connection estableceConexion(String usuario,String contraseña) {
        String servidor = "localhost";
        String bd = "Libreria"; //Nombre de la BD
        String puerto = "5432"; //Puerto de enlace
        String cadena = "jdbc:postgresql://" + servidor + ":" + puerto + "/" + bd; //Cadena para conexion con BD

        try {
            Class.forName("org.postgresql.Driver");
            cn = DriverManager.getConnection(cadena, usuario, contraseña);
        } catch (Exception e) {
            System.out.println((e.getMessage()));
            Mostrar.Mensaje("Usuario o contraseña incorrectos");
        }
        return cn;
    }


    
}
