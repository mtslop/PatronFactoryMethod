package model.Asadero;

import java.time.LocalTime;

public class ComandaLlevar extends Comanda {
    private LocalTime tiempoEstimado;

    public ComandaLlevar(String cabecera, String detalle, String pie, String cliente, double subtotal, LocalTime tiempoEstimado) {
        super(cabecera, detalle, pie, cliente, subtotal);
        this.tiempoEstimado = tiempoEstimado;
    }

    @Override
    public double calcularTotal() {
        return subtotal;
    }
}