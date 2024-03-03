package udem.edu.co.model.impl;

import udem.edu.co.model.Avenger;

import java.util.List;



public class AvengerImpl implements Avenger {
    private String nombre;
    private List<String> clasificaciones;

    public AvengerImpl(String nombre, List<String> clasificaciones) {
        this.nombre = nombre;
        this.clasificaciones = clasificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getClasificaciones() {
        return clasificaciones;
    }

}
