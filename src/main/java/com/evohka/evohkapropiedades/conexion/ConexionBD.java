/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evohka.evohkapropiedades.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String URL = "jdbc:mysql://localhost:3306/gestion_arriendos";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "";

    public static Connection conectar() {
        Connection conexion = null;

        try {
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("Conexión exitosa a la base de datos gestion_arriendos");
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos");
            System.out.println("Detalle: " + e.getMessage());
        }

        return conexion;
    }
}