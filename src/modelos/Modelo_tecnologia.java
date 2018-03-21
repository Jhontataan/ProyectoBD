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
public class Modelo_tecnologia extends Conexion{
    public Modelo_tecnologia() {
    }

    public boolean nuevaTecnologia(String descripcion) {
        if (validarTecnologia(descripcion)) {
            String sentencia = "INSERT INTO tecnologias (descripcion)" + "VALUES ('" + descripcion + "')";
            return ejecutar(sentencia);
        }else
            return false;
    }

    public boolean validarTecnologia(String descripcion) {
        if (descripcion.length() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
