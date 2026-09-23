package model.Asadero;

import java.time.LocalTime;

public class LlevarFactory implements ComandaFactory {
    private String cabecera;
    private String detalle;
    private String pie;
    private String cliente;
    private double subtotal;
    private LocalTime tiempoEstimado;

    public LlevarFactory(String cabecera, String detalle, String pie, String cliente, double subtotal, LocalTime tiempoEstimado) {
        this.cabecera = cabecera;
        this.detalle = detalle;
        this.pie = pie;
        this.cliente = cliente;
        this.subtotal = subtotal;
        this.tiempoEstimado = tiempoEstimado;
    }

    @Override
    public Comanda crearComanda() {
        return new ComandaLlevar(cabecera, detalle, pie, cliente, subtotal, tiempoEstimado);
    }
}