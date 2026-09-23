package model.EmpresaTransporte;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {
    private String nombre;
    private List<Tiquete> listaTiquete;

    public EmpresaTransporte(String nombre) {
        this.nombre = nombre;
        this.listaTiquete = new ArrayList<>();
    }

    public void registrarTiquete(TiqueteFactory factory) {
        Tiquete tiquete = factory.crearTiquete();
        this.listaTiquete.add(tiquete);
    }
}