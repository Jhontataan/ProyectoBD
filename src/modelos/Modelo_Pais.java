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

    public Object[][] obtenerPaises() throws SQLException{
        try {
            
        } catch (Exception e) {
        }
        ResultSet rescont = consultar("SELECT COUNT(*) AS registros FROM pais");
        rescont.next();
        int total = rescont.getInt("registros");
        System.out.println(total);
        rescont.close();
        Object[][] paises = new String[total][3];
        int i = 0;
        ResultSet res = null;
        res = consultar("SELECT * FROM pais");
        while (res.next()) {
            paises[i][0] = res.getString("id_pais");
            paises[i][1] = res.getString("nombre");
            paises[i][2] = res.getString("moneda");
            i++;
        }
        res.close();
        return paises;
    }
}
