package model.Universidad;

import java.util.ArrayList;
import java.util.List;

public class UniversidadDelQuindio {
    private String nombre;
    private List<Persona> listaPersonas;
    private List<Notificacion> listaNotificaciones;

    public UniversidadDelQuindio(String nombre) {
        this.nombre = nombre;
        this.listaPersonas = new ArrayList<>();
        this.listaNotificaciones = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        this.listaPersonas.add(persona);
    }
}