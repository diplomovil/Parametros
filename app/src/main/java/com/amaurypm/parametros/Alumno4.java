package com.amaurypm.parametros;

import java.io.Serializable;

/**
 * Creado por Amaury Perea Matsumura el 08/10/22
 */
public class Alumno4 implements Serializable {
    String nombre;
    String numCuenta;

    public Alumno4(String nombre, String numCuenta) {
        this.nombre = nombre;
        this.numCuenta = numCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
}
