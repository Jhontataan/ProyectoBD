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
public class Modelo_prestacion extends Conexion {

    public Modelo_prestacion() {
    }

    public boolean nuevaPrestacion(String descripcion) {
        if (validarPrestacion(descripcion)) {
            String sentencia = "INSERT INTO prestacion (descripcion)" + "VALUES ('" + descripcion + "')";
            return ejecutar(sentencia);
        } else {
            return false;
        }
    }

    public boolean validarPrestacion(String descripcion) {
        if (descripcion.length() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
