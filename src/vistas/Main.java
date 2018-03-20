/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.sql.SQLException;
import modelos.Conexion;
import modelos.Modelo_Pais;
import modelos.Modelo_nivelacademico;

/**
 *
 * @author jhona
 */
public class Main {

    public static void main(String args[]) throws SQLException {
        Modelo_Pais pais = new Modelo_Pais();
        Modelo_nivelacademico nivel = new Modelo_nivelacademico();
        
        //Ejemplo de dar de alta un pais
        //pais.nuevoPais("España","Peseta");
        //Ejemplo de dar de alta un nivel
        nivel.nuevoNivel("Bachillerato Completado");
        /*Ejemplo de Obtener e imprimir los paises en consola
        Object consulta[][] = pais.obtenerPaises();
        for (int i = 0; i < consulta.length; i++) {
            System.out.println("Id: " + consulta[i][0] + " Nombre: " + consulta[i][1] + " Moneda: " + consulta[i][2]);
        }*/
        //Ejemplo de obtener e imprimir los niveles academicos
        Object consulta[][] = nivel.obtenernivelesAcademicos();
        for (int i = 0; i < consulta.length; i++) {
            System.out.println("Id: " + consulta[i][0] + " Descripcion: " + consulta[i][1]);
        }
    }
}
