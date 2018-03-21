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
public class Modelo_idiomaExtranjero extends Conexion {

    public Modelo_idiomaExtranjero() {
    }

    public boolean nuevoidioma(String nombre) {
        if (validarIdioma(nombre)) {
            String sentencia = "INSERT INTO idioma_extranjero (nombre) " + "VALUES ('" + nombre + "')";
            return ejecutar(sentencia);
        }else
            return false;
    }

    public boolean validarIdioma(String nombre) {
        if (nombre.length() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
