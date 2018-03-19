/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author jhona
 */
public class Modelo_Pais extends Conexion {

    public Modelo_Pais() {
    }

    public boolean nuevoPais(String nombre, String moneda) {
        if (validarPais(nombre, moneda)) {
            String sentencia = "INSERT INTO pais (nombre, moneda) " + "VALUES ('" + nombre + "','" + moneda + "')";
            return ejecutar(sentencia);
        }
        return false;
    }

    public boolean validarPais(String nombre, String moneda) {
        if (nombre.length() > 0 && moneda.length() > 0) {
            return true;
        } else {
            return false;
        }
    }

}
