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
public class Modelo_certificacion extends Conexion {

    public Modelo_certificacion() {
    }

    public boolean nuevaCertificacion(String descripcion) {
        if (validarCertificacion(descripcion)) {
            String sentencia = "INSERT INTO certificacion (descripcion)" + "VALUES ('" + descripcion + "')";
            return ejecutar(sentencia);
        }else
            return false;
    }

    public boolean validarCertificacion(String descripcion) {
        if (descripcion.length() > 0) {
            return true;
        } else {
            return false;
        }
    }

}
