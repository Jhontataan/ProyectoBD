/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jhona
 */
public class Modelo_nivelacademico extends Conexion {

    public Modelo_nivelacademico() {

    }

    public boolean nuevoNivel(String descripcion) {
        if (validarnivelAcademico(descripcion)) {
            String sentencia = "INSERT INTO nivel_academico (descripcion) " + "VALUES ('" + descripcion + "')";
            return ejecutar(sentencia);
        } else {
            return false;
        }
    }

    public boolean validarnivelAcademico(String descripcion) {
        if (descripcion.length() > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public Object[][] obtenernivelesAcademicos() throws SQLException{
        ResultSet rescont = consultar("SELECT COUNT(*) AS registros FROM nivel_academico");
        rescont.next();
        int total = rescont.getInt("registros");
        rescont.close();
        Object[][] paises = new String[total][2];
        int i = 0;
        ResultSet res = null;
        res = consultar("SELECT * FROM nivel_academico");
        while (res.next()) {
            paises[i][0] = res.getString("id_nivel");
            paises[i][1] = res.getString("descripcion");
            i++;
        }
        res.close();
        return paises;
    }
}
