/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evohka.evohkapropiedades.dao;

import com.evohka.evohkapropiedades.conexion.ConexionBD;
import com.evohka.evohkapropiedades.modelo.Propiedad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

public class PropiedadDAO {

    public boolean guardarPropiedad(Propiedad propiedad) {

        String sql = "INSERT INTO propiedades "
                + "(titulo, tipo_inmueble, direccion, barrio, ciudad, canon, habitaciones, banos, id_propietario) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection conexion = ConexionBD.conectar();
            PreparedStatement consulta = conexion.prepareStatement(sql);

            consulta.setString(1, propiedad.getTitulo());
            consulta.setString(2, propiedad.getTipoInmueble());
            consulta.setString(3, propiedad.getDireccion());
            consulta.setString(4, propiedad.getBarrio());
            consulta.setString(5, propiedad.getCiudad());
            consulta.setDouble(6, propiedad.getCanon());
            consulta.setInt(7, propiedad.getHabitaciones());
            consulta.setInt(8, propiedad.getBanos());
            consulta.setInt(9, propiedad.getIdPropietario());

            consulta.executeUpdate();

            System.out.println("Propiedad guardada correctamente.");
            return true;

        } catch (SQLException e) {
            System.out.println("Error al guardar la propiedad.");
            System.out.println("Detalle: " + e.getMessage());
            return false;
        } 
    } 
    public void listarPropiedades() {

    String sql = "SELECT * FROM propiedades";

    try {
        Connection conexion = ConexionBD.conectar();
        Statement consulta = conexion.createStatement();
        ResultSet resultado = consulta.executeQuery(sql);

        System.out.println("LISTADO DE PROPIEDADES");
        System.out.println("----------------------");

        while (resultado.next()) {
            System.out.println("ID: " + resultado.getInt("id_propiedad"));
            System.out.println("Título: " + resultado.getString("titulo"));
            System.out.println("Tipo de inmueble: " + resultado.getString("tipo_inmueble"));
            System.out.println("Dirección: " + resultado.getString("direccion"));
            System.out.println("Barrio: " + resultado.getString("barrio"));
            System.out.println("Ciudad: " + resultado.getString("ciudad"));
            System.out.println("Canon: " + resultado.getDouble("canon"));
            System.out.println("Habitaciones: " + resultado.getInt("habitaciones"));
            System.out.println("Baños: " + resultado.getInt("banos"));
            System.out.println("ID Propietario: " + resultado.getInt("id_propietario"));
            System.out.println("----------------------");
        }

    } catch (SQLException e) {
        System.out.println("Error al listar las propiedades.");
        System.out.println("Detalle: " + e.getMessage());
    }
}
    public boolean actualizarPropiedad(Propiedad propiedad) {

    String sql = "UPDATE propiedades SET titulo=?, tipo_inmueble=?, direccion=?, barrio=?, ciudad=?, canon=?, habitaciones=?, banos=?, id_propietario=? WHERE id_propiedad=?";

    try {
        Connection conexion = ConexionBD.conectar();
        PreparedStatement consulta = conexion.prepareStatement(sql);

        consulta.setString(1, propiedad.getTitulo());
        consulta.setString(2, propiedad.getTipoInmueble());
        consulta.setString(3, propiedad.getDireccion());
        consulta.setString(4, propiedad.getBarrio());
        consulta.setString(5, propiedad.getCiudad());
        consulta.setDouble(6, propiedad.getCanon());
        consulta.setInt(7, propiedad.getHabitaciones());
        consulta.setInt(8, propiedad.getBanos());
        consulta.setInt(9, propiedad.getIdPropietario());
        consulta.setInt(10, propiedad.getIdPropiedad());

        consulta.executeUpdate();

        System.out.println("Propiedad actualizada correctamente.");
        return true;

    } catch (SQLException e) {
        System.out.println("Error al actualizar la propiedad.");
        System.out.println("Detalle: " + e.getMessage());
        return false;
    }
}

public boolean eliminarPropiedad(int idPropiedad) {

    String sql = "DELETE FROM propiedades WHERE id_propiedad=?";

    try {
        Connection conexion = ConexionBD.conectar();
        PreparedStatement consulta = conexion.prepareStatement(sql);

        consulta.setInt(1, idPropiedad);

        consulta.executeUpdate();

        System.out.println("Propiedad eliminada correctamente.");
        return true;

    } catch (SQLException e) {
        System.out.println("Error al eliminar la propiedad.");
        System.out.println("Detalle: " + e.getMessage());
        return false;
    }
}
public List<Propiedad> obtenerPropiedades() {

    List<Propiedad> lista = new ArrayList<>();
    String sql = "SELECT * FROM propiedades";

    try {
        Connection conexion = ConexionBD.conectar();
        Statement consulta = conexion.createStatement();
        ResultSet resultado = consulta.executeQuery(sql);

        while (resultado.next()) {
            Propiedad propiedad = new Propiedad();

            propiedad.setIdPropiedad(resultado.getInt("id_propiedad"));
            propiedad.setTitulo(resultado.getString("titulo"));
            propiedad.setTipoInmueble(resultado.getString("tipo_inmueble"));
            propiedad.setDireccion(resultado.getString("direccion"));
            propiedad.setBarrio(resultado.getString("barrio"));
            propiedad.setCiudad(resultado.getString("ciudad"));
            propiedad.setCanon(resultado.getDouble("canon"));
            propiedad.setHabitaciones(resultado.getInt("habitaciones"));
            propiedad.setBanos(resultado.getInt("banos"));
            propiedad.setIdPropietario(resultado.getInt("id_propietario"));

            lista.add(propiedad);
        }

    } catch (SQLException e) {
        System.out.println("Error al obtener propiedades.");
        System.out.println("Detalle: " + e.getMessage());
    }

    return lista;
}
}
