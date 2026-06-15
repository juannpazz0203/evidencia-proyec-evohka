/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.evohka.evohkapropiedades;

import com.evohka.evohkapropiedades.dao.PropiedadDAO;


public class EvohkaPropiedades {

    public static void main(String[] args) {

        PropiedadDAO propiedadDAO = new PropiedadDAO();

    propiedadDAO.listarPropiedades();

    }
}