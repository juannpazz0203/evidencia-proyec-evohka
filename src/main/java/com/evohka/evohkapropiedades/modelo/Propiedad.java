/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evohka.evohkapropiedades.modelo;

public class Propiedad {

    private int idPropiedad;
    private String titulo;
    private String tipoInmueble;
    private String direccion;
    private String barrio;
    private String ciudad;
    private double canon;
    private int habitaciones;
    private int banos;
    private int idPropietario;

    public Propiedad() {
    }

    public Propiedad(int idPropiedad, String titulo, String tipoInmueble, String direccion, String barrio, String ciudad, double canon, int habitaciones, int banos, int idPropietario) {
        this.idPropiedad = idPropiedad;
        this.titulo = titulo;
        this.tipoInmueble = tipoInmueble;
        this.direccion = direccion;
        this.barrio = barrio;
        this.ciudad = ciudad;
        this.canon = canon;
        this.habitaciones = habitaciones;
        this.banos = banos;
        this.idPropietario = idPropietario;
    }

    public int getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(int idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(String tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getCanon() {
        return canon;
    }

    public void setCanon(double canon) {
        this.canon = canon;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getBanos() {
        return banos;
    }

    public void setBanos(int banos) {
        this.banos = banos;
    }

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }
}