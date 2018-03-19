/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.sql.SQLException;
import modelos.Conexion;
import modelos.Modelo_Pais;

/**
 *
 * @author jhona
 */
public class Main {

    public static void main(String args[]) throws SQLException {
        Modelo_Pais pais = new Modelo_Pais();
        Object consulta[][]  = pais.obtenerPaises();
        for (int i = 0; i < consulta.length; i++) {
            System.out.println("Id: " + consulta[i][0] + " Nombre: " + consulta[i][1] + " Moneda: " + consulta[i][2]);
        }
    }
}
