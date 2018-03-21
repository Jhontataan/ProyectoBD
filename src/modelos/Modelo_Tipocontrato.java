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
public class Modelo_Tipocontrato extends Conexion{
    public Modelo_Tipocontrato() {
    }

    public boolean nuevotipoContrato(String descripcion) {
        if (validartipoContrato(descripcion)) {
            String sentencia = "INSERT INTO tipo_contrato (descripcion)" + "VALUES ('" + descripcion + "')";
            return ejecutar(sentencia);
        }else
            return false;
    }

    public boolean validartipoContrato(String descripcion) {
        if (descripcion.length() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
