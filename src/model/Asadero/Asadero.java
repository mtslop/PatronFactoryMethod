package model.Asadero;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Asadero {
    private String nombre;
    private String telefono;
    private LocalTime horaApertura;
    private LocalTime horaCierre;
    private List<Comanda> listaComandas;

    public Asadero(String nombre, String telefono, LocalTime horaApertura, LocalTime horaCierre) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.listaComandas = new ArrayList<>();
    }

    public void registrarComanda(ComandaFactory factory) {
        Comanda comanda = factory.crearComanda();
        this.listaComandas.add(comanda);
    }
}