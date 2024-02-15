/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.sql.*;

/**
 *
 * @author DanKuzo
 */
public class ProbarConexion {
    public static void main(String[] args) {
        Conexion cc = new Conexion();
        Connection cn =cc.conexion();
        
        if (cn==null) {
            System.out.println("no conectado");
        }else{
            System.out.println("conectado ");
        }
    }
    }

