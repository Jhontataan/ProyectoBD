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
public class Modelo_persona extends Conexion {

    public Modelo_persona() {
    }

    public boolean nuevaPersona(int id, String nombre, String paterno, String materno) {
        String sentencia = "INSERT INTO persona (id_nivel, nombre, paterno, materno) " + "VALUES(" + id + ",'" + nombre + "','" + paterno + "','" + materno + "')";
        return ejecutar(sentencia);
    }

    public boolean validarPersona(int id, String nombre, String paterno, String materno) {
        if (id > 0 && nombre.length() > 0 && paterno.length() > 0 && materno.length() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
